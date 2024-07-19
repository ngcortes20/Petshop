package com.proyecto3.mascotas.models;

import com.proyecto3.mascotas.models.classes.PetItem;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "services")
public class ServiceEntity extends PetItem{
    private Integer duration;
}