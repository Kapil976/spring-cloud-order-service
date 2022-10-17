/**
 * 
 */
package com.kapil.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kapil.model.Stock;

/**
 * @author HOME PC
 *
 */
@FeignClient("STOCK-SERVICE")
public interface IStockConsumerFeign {

	@GetMapping("/stock/data")
	public ResponseEntity<String> showMessage();

	@GetMapping("/stock/find/{id}")
	public ResponseEntity<Stock> getStockById(@PathVariable Long id);

	@PostMapping("/stock/create")
	public ResponseEntity<String> createStock(@RequestBody Stock stock);
}
