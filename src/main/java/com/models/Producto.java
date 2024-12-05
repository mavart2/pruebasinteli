package com.models;

import lombok.Data;


import java.util.Objects;

public class Producto {

    private int id;
    private String nombre;
    private Double precio;

    public Producto(){

    }
    public Producto(int id, String nombre, Double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;

    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precio == producto.precio && Objects.equals(nombre, producto.nombre);

    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void setId(int i) {
    }

    public void setNombre(String polera) {
    }

    public void setPrecio(double v) {
    }


}
