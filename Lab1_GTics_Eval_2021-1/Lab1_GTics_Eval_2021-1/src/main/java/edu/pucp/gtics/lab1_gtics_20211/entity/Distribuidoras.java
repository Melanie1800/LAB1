package edu.pucp.gtics.lab1_gtics_20211.entity;

import javax.persistence.*;

@Entity
@Table(name="distribuidoras")
public class Distribuidoras {

    /** Completar*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddistribuidora;
    private String nombre;

    private int fundacion;
    private String sede;

    public int getIddistribuidora() {
        return iddistribuidora;
    }

    public void setIddistribuidora(int iddistribuidora) {
        this.iddistribuidora = iddistribuidora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
