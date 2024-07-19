package com.proyecto3.mascotas.models;

import java.time.Instant;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pets")
public class PetEntity {
    
    // Main attributes

    private String name;
    private String breed;
    private Date birthDate;

    // Relationships
    
    // Creation attributes

    private Instant createdAt;
    private Instant updatedAt;
    
    @PrePersist
    public void onCreated(){
        this.createdAt = Instant.now();
    }

    @PreUpdate
    public void onUpdated(){
        this.updatedAt = Instant.now();
    }
}
