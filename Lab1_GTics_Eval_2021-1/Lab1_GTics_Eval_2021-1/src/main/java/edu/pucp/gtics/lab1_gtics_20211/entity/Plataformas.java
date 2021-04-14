package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;

@Entity
@Table(name="plataformas")
public class Plataformas {

    /** Completar*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idplataforma;
    private String nombre;
    private String descripcion;

    public int getIdplataforma() {
        return idplataforma;
    }

    public void setIdplataforma(int idplataforma) {
        this.idplataforma = idplataforma;
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
}
