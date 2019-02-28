package com.favio.listviewvolley.modelos;

public class Persona {

    //@SerializedName("nombre");
    private Integer Id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;

    public Persona(int id, String nombre, String apellido, int edad){
        this.Id=id;
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Edad=edad;
    }

    public void setId(int id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Integer getEdad() {
        return Edad;
    }

}
