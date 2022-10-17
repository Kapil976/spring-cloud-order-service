/**
 * 
 */
package com.kapil.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapil.consumer.IStockConsumerFeign;
import com.kapil.model.Stock;

/**
 * @author HOME PC
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

//	private StockConsumer stockConsumer;

	@Autowired
	private IStockConsumerFeign iStockConsumerFeign;

	@GetMapping("/data")
	public ResponseEntity<String> showStock() {
//		String dataFromStock = stockConsumer.getDataFromStock();
		String body = iStockConsumerFeign.showMessage().getBody();
		return ResponseEntity.ok("FROM ORDER" + body);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Stock> getStockById(@PathVariable Long id) {
		Stock body = iStockConsumerFeign.getStockById(id).getBody();
		return ResponseEntity.ok(body);
	}

	@PostMapping("/create")
	public ResponseEntity<String> createStock(@RequestBody Stock stock) {
		String body = iStockConsumerFeign.createStock(stock).getBody();
		return ResponseEntity.ok(body);
	}
}
