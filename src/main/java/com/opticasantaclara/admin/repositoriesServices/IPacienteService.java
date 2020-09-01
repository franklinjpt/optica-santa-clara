package com.opticasantaclara.admin.repositoriesServices;

import java.util.List;

import com.opticasantaclara.admin.entities.HistoriaClinica;
import com.opticasantaclara.admin.entities.Paciente;

public interface IPacienteService {
    Paciente saveOrUpdate(Paciente paciente);
    void delete (Integer id);
    List<Paciente>listarPacientes();
    Paciente findByCedula(Integer cedula);
    List<HistoriaClinica> findHiClinicasByPaciente(Paciente paciente);

    HistoriaClinica crearOEditarHiClinica(HistoriaClinica historiaClinica);
    HistoriaClinica findHiClinicasById(HistoriaClinica hiClinica);
    HistoriaClinica findByIdHiclinica(Integer id);
    void eliminarHiClinica(Integer id);
    List<HistoriaClinica>listarHiClinicas();
    
}