package com.models;

public class Motor {
    private int cc;

    public Motor(int cc) {
        this.cc = cc;
    }

    public void encender() {
        System.out.println("El motor de " + cc + "cc está encendido.");
    }

    // Getters y Setters si es necesario
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
