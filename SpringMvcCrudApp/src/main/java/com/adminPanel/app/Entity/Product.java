package com.adminPanel.app.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.action.internal.OrphanRemovalAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JoinColumn(name ="product_details_id")
    @OneToOne(cascade = CascadeType.ALL)
    private ProductDetails productDetails;
}
