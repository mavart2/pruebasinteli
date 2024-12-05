package com.models;

import lombok.Data;

@Data

public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Usuario(int id, String nombre, String apellido, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    public Usuario() {
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Usuario)) return false;
        final Usuario other = (Usuario) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$nombre = this.getNombre();
        final Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        final Object this$apellido = this.getApellido();
        final Object other$apellido = other.getApellido();
        if (this$apellido == null ? other$apellido != null : !this$apellido.equals(other$apellido)) return false;
        if (this.getEdad() != other.getEdad()) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Usuario;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        final Object $apellido = this.getApellido();
        result = result * PRIME + ($apellido == null ? 43 : $apellido.hashCode());
        result = result * PRIME + this.getEdad();
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "Usuario(id=" + this.getId() + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + ", edad=" + this.getEdad() + ", email=" + this.getEmail() + ")";
    }
}
