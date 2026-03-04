package com.adminPanel.app.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductModel {
    private int id;
    @NonNull
    @Size(min = 1, max = 100)
    private String name;

    private BigDecimal price;
    @NonNull
    private Boolean productAvailable;

}
