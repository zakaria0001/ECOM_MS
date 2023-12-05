package org.sid.inventoryms.repository;

import org.sid.inventoryms.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author | mbp-de-zakaria
 **/
@RepositoryRestResource
public interface ProductRepository  extends JpaRepository<Product,Long> {
}
