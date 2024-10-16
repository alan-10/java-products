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

import com.crudProject.crud.domain.product.dtos.ConvertDtosToEntities;
import com.crudProject.crud.domain.product.dtos.CreateProductDTO;
import com.crudProject.crud.domain.product.dtos.IncreaseProductDTO;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody CreateProductDTO body) {

		Product newProduct = this.service.save(ConvertDtosToEntities.productEntity(body));

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
	
	@GetMapping("/list")
	public ResponseEntity<List<Product>> list(){
		List<Product> products = this.service.getAllProducts();
		
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping("/findBYId/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = this.service.findById(id);
		
		return ResponseEntity.ok().body(product);
	}
}
