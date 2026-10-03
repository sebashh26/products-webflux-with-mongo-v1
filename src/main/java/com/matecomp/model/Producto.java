package com.matecomp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "productos")
public class Producto {

    @Id
    private Integer id;
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stock;
}
