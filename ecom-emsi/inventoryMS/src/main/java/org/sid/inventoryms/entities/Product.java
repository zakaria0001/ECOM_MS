package org.sid.inventoryms.entities;

import jakarta.persistence.*;
import lombok.*;


/**
 * @author | mbp-de-zakaria
 **/
@Entity
@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Product {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private double price ;
    private int quantity;
}
