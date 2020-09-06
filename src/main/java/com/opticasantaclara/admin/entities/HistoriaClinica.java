package com.opticasantaclara.admin.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "historiasclinicas")
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date fechaDeConsulta;
    @Column
    private String motivoDeConsulta;
    @Column
    private String antecedentesPersonales;
    @Column
    private String antecedentesFamiliares;
    @Column
    private String medicamentosEnUso;
    @Column
    private String diagnostico;
    @Column
    private String tratamiento;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column
    private Date fechaProximaConsulta;
    @Column
    private double lensometriaEsferaOD;
    @Column
    private double lensometriaEsferaOI;
    @Column
    private double lensometriaCilindroOD;
    @Column
    private double lensometriaCilindroOI;
    @Column
    private double lensometriaEjeOD;
    @Column
    private double lensometriaEjeOI;
    @Column
    private double adicionLensometria;
    @Column
    private double avsc;



    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cedula_paciente", nullable = false)
    private Paciente paciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer id, Date fechaDeConsulta, String motivoDeConsulta, String antecedentesPersonales,
            String antecedentesFamiliares, String medicamentosEnUso, String diagnostico, String tratamiento,
            Date fechaProximaConsulta, double lensometriaEsferaOD, double lensometriaEsferaOI,
            double lensometriaCilindroOD, double lensometriaCilindroOI, double lensometriaEjeOD,
            double lensometriaEjeOI, double adicionLensometria, double avsc, Paciente paciente) {
        this.id = id;
        this.fechaDeConsulta = fechaDeConsulta;
        this.motivoDeConsulta = motivoDeConsulta;
        this.antecedentesPersonales = antecedentesPersonales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.medicamentosEnUso = medicamentosEnUso;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.fechaProximaConsulta = fechaProximaConsulta;
        this.lensometriaEsferaOD = lensometriaEsferaOD;
        this.lensometriaEsferaOI = lensometriaEsferaOI;
        this.lensometriaCilindroOD = lensometriaCilindroOD;
        this.lensometriaCilindroOI = lensometriaCilindroOI;
        this.lensometriaEjeOD = lensometriaEjeOD;
        this.lensometriaEjeOI = lensometriaEjeOI;
        this.adicionLensometria = adicionLensometria;
        this.avsc = avsc;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(Date fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getMedicamentosEnUso() {
        return medicamentosEnUso;
    }

    public void setMedicamentosEnUso(String medicamentosEnUso) {
        this.medicamentosEnUso = medicamentosEnUso;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaProximaConsulta() {
        return fechaProximaConsulta;
    }

    public void setFechaProximaConsulta(Date fechaProximaConsulta) {
        this.fechaProximaConsulta = fechaProximaConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getLensometriaEsferaOD() {
        return lensometriaEsferaOD;
    }

    public void setLensometriaEsferaOD(double lensometriaEsferaOD) {
        this.lensometriaEsferaOD = lensometriaEsferaOD;
    }

    public double getLensometriaEsferaOI() {
        return lensometriaEsferaOI;
    }

    public void setLensometriaEsferaOI(double lensometriaEsferaOI) {
        this.lensometriaEsferaOI = lensometriaEsferaOI;
    }

    public double getLensometriaCilindroOD() {
        return lensometriaCilindroOD;
    }

    public void setLensometriaCilindroOD(double lensometriaCilindroOD) {
        this.lensometriaCilindroOD = lensometriaCilindroOD;
    }

    public double getLensometriaCilindroOI() {
        return lensometriaCilindroOI;
    }

    public void setLensometriaCilindroOI(double lensometriaCilindroOI) {
        this.lensometriaCilindroOI = lensometriaCilindroOI;
    }

    public double getLensometriaEjeOD() {
        return lensometriaEjeOD;
    }

    public void setLensometriaEjeOD(double lensometriaEjeOD) {
        this.lensometriaEjeOD = lensometriaEjeOD;
    }

    public double getLensometriaEjeOI() {
        return lensometriaEjeOI;
    }

    public void setLensometriaEjeOI(double lensometriaEjeOI) {
        this.lensometriaEjeOI = lensometriaEjeOI;
    }

    public double getAdicionLensometria() {
        return adicionLensometria;
    }

    public void setAdicionLensometria(double adicionLensometria) {
        this.adicionLensometria = adicionLensometria;
    }

    public double getAvsc() {
        return avsc;
    }

    public void setAvsc(double avsc) {
        this.avsc = avsc;
    }

    

    
}