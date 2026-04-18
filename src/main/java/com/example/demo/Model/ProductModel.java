package com.example.demo.Model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductModel {
    private int id;
    @NonNull
    private String name;

    private BigDecimal price;
    @NonNull
    private Boolean productAvailable = false;

}
