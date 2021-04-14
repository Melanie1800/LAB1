package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;

@Entity
@Table(name="juegos")
public class Juegos {

    /** Completar*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idjuego;
    private String nombre;
    private String descripcion;
    private double precio;
    private int idplataforma;

    public int getIdjuego() {
        return idjuego;
    }

    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(int idplataforma) {
        this.idplataforma = idplataforma;
    }

}
