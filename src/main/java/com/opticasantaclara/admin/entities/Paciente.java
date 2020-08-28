package com.opticasantaclara.admin.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @Column
    private Integer cedula;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @JsonFormat(pattern="dd-MM-yyyy")
    @Column
    private Date fechaDeNacimiento;

    public Paciente() {
    }

    public Paciente(Integer cedula, String nombre, String apellido, Date fechaDeNacimiento) {
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    

    
    
}