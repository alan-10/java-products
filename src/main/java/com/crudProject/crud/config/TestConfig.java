package com.crudProject.crud.config;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.crudProject.crud.domain.order.entities.Order;
import com.crudProject.crud.domain.order.enuns.OrderStatus;
import com.crudProject.crud.domain.order.repository.OrderRepository;
import com.crudProject.crud.domain.product.entities.Category;
import com.crudProject.crud.domain.product.entities.Product;
import com.crudProject.crud.domain.product.repository.CategoryRepository;
import com.crudProject.crud.domain.product.repository.ProductRepository;
import com.crudProject.crud.domain.user.UserRepository;
import com.crudProject.crud.domain.user.entities.User;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User(null, "alan1", "alan@gmail.com", "989887t22", "12345");
		User user2 = new User(null, "pablo", "pabloviadinho@gmail.com", "98988733", "12345");

		List<User> usersCreated = userRepository.saveAll(Arrays.asList(user1, user2));

		Category category = new Category(null, "Category 1", "First category");

		Category newCategory = categoryRepository.save(category);

		Product product1 = new Product(null, "Smartphone XYZ",
				"Smartphone de última geração com câmera de 108MP e 128GB de armazenamento.", 2999.99, 10, true,
				newCategory.getId());
		Product product2 = new Product(null, "teste",
				"Smartphone de última geração com câmera de 108MP e 128GB de armazenamento.", 2999.99, 10, true,
				newCategory.getId());

		Product newProduct = productRepository.save(product1);
		Product newProduct2 = productRepository.save(product2);

		Order order1 = new Order(null, Instant.parse("2024-08-25T19:55:07Z"), OrderStatus.PAID,1,  usersCreated.get(0).getId(),
				newProduct.getId());
		Order order2 = new Order(null, Instant.parse("2024-08-26T20:23:08Z"), OrderStatus.WAITING_PAYMENT,1,
				  usersCreated.get(0).getId(),
					newProduct.getId());
		Order order3 = new Order(null, Instant.parse("2024-09-22T02:12:01Z"), OrderStatus.WAITING_PAYMENT,1,
				  usersCreated.get(0).getId(),
					newProduct.getId());

		orderRepository.saveAll(Arrays.asList(order1, order2, order3));

	}

}
