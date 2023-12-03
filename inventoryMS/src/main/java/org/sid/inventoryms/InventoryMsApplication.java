package org.sid.inventoryms;

import org.sid.inventoryms.entities.Product;
import org.sid.inventoryms.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;
@SpringBootApplication
public class InventoryMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryMsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Product.class);
            productRepository.saveAll(
                    List.of(
                            Product.builder().name("Computer").quantity(12).price(1200).build(),
                            Product.builder().name("iPhone").quantity(5).price(10000).build(),
                            Product.builder().name("iMac").quantity(2).price(33000).build()
                    )
            );
        };
    }
}
