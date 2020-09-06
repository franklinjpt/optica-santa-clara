package com.opticasantaclara.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventarios")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private TipoDeProducto nombre;
    @Column
    private String marca;
    @Column
    private String referencia;
    @Column
    private int cantidad;
    @Column
    private int costoPorUnidad;

    public Inventario() {
    }

    public Inventario(Integer id, TipoDeProducto nombre, String marca, String referencia, int cantidad,
            int costoPorUnidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.costoPorUnidad = costoPorUnidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDeProducto getNombre() {
        return nombre;
    }

    public void setNombre(TipoDeProducto nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public void setCostoPorUnidad(int costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }

    
    

}
