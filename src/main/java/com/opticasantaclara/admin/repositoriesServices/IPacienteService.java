package com.opticasantaclara.admin.repositoriesServices;

import java.util.List;

import com.opticasantaclara.admin.entities.HistoriaClinica;
import com.opticasantaclara.admin.entities.Paciente;

public interface IPacienteService {
    Paciente saveOrUpdate(Paciente paciente);
    void delete (int id);
    List<Paciente>listarPacientes();
    Paciente findByCedula(int cedula);
    List<HistoriaClinica> findHiClinicasByPaciente(Paciente paciente);

    HistoriaClinica crearOEditarHiClinica(HistoriaClinica historiaClinica);
    void eliminarHiClinica(int id);
    List<HistoriaClinica>listarHiClinicas();
    
}