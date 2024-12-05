package org.example;

import com.models.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Juan");
        usuario.setApellido("Alvarez");
        usuario.setEdad(45);
        usuario.setEmail("gmproyect@gmail.com");

        System.out.println(usuario);

        // Ejercicio 1
        Persona persona = new Persona();
        persona.setNombre("Alberto");
        persona.setEdad(50);


        System.out.println(persona);

        // Ejercicio 2
       // ProductoConLombok productoConLombok = new ProductoConLombok(1, 50.0, "Pollera");

       // System.out.println(productoConLombok);


        // Ejercicio 2
        /*/ Creación de una instancia de Producto utilizando el constructor
        Producto producto = new Producto();
        producto.setId(2);
        producto.setNombre("Polera");
        producto.setPrecio(50.0);
        // Imprimir el objeto Producto
        System.out.println(producto);*/



        Motor motor = new Motor(444);
        Radio radio = new Radio();

        // Crear una instancia de Automovil solo con radio
        Automovil automovilSoloConRadio = new Automovil(radio);

        Automovil automovil = new Automovil( motor,radio);
        //automovil.setMotor(motor);
        automovil.manejar();
        automovil.escucharRadio();


        automovilSoloConRadio.escucharRadio();


    }
}
