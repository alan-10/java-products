package com.crudProject.crud.domain.product.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.domain.product.dtos.IncreaseProductDTO;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody Product body) {

		Product newProduct = this.service.save(body);

		return ResponseEntity.ok().body(newProduct);

	}

	@PostMapping("/increase/{id}")
	public void increaseCountProduct(@PathVariable Long id, @RequestBody IncreaseProductDTO body) {

		this.service.increaseProduct(id, body.getQuantityProduct());
	}
	
	
	@GetMapping("/lowStockProducts")
	public ResponseEntity<List<Product>> lowStockProducts(){
		
		List<Product> products = this.service.getLowStokProducts();
		
		return ResponseEntity.ok().body(products);
		
	}
}
