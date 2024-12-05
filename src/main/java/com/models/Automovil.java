package com.models;

public class Automovil {

    public Motor motor;
    public Radio radio;

    // Constructor que acepta tanto Motor como Radio
    public Automovil(Motor motor, Radio radio) {
        this.motor = motor;
        this.radio = radio;
    }

    // Constructor que solo acepta Radio
    public Automovil(Radio radio) {
        this(null, radio); // Llama al constructor principal con motor como null
    }

    public void manejar() {
        if (motor != null) {
            this.motor.encender();
        }
    }

    public void escucharRadio() {
        if (radio != null) {
            this.radio.encender();
        }
    }
}
