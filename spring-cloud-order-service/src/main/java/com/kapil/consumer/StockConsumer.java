/**
 * 
 */
package com.kapil.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author HOME PC
 *
 */
//@Component
public class StockConsumer {

	@Autowired
	private LoadBalancerClient balancerClient;

	public String getDataFromStock() {

		RestTemplate rest = new RestTemplate();
		ServiceInstance choose = balancerClient.choose("STOCK-SERVICE");
		String url = choose.getUri() + "/stock/data";
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		return response.getBody();

	}
}
