package com.example.productjenkins;

import com.example.productjenkins.model.Product;
import com.example.productjenkins.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ProductJenkinsApplication implements CommandLineRunner{

	private final ProductRepository productRepository;

	@Autowired
	public ProductJenkinsApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		productRepository.save(new Product(UUID.randomUUID().toString(),"Car",1000000.0d));
		productRepository.save(new Product(UUID.randomUUID().toString(),"Bike",10000.0d));
		productRepository.save(new Product(UUID.randomUUID().toString(),"Truck",5000000.0d));
		productRepository.save(new Product(UUID.randomUUID().toString(),"Cycle",10000.0d));

	}
}
