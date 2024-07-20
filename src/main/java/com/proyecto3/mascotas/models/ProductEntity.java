package com.proyecto3.mascotas.models;

import com.proyecto3.mascotas.models.classes.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductEntity extends Item {
    private Integer stock;
}
