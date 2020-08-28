package com.opticasantaclara.admin.repositoriesServices;

import java.util.List;

import com.opticasantaclara.admin.entities.Paciente;

public interface IPacienteService {
    Paciente saveOrUpdate(Paciente paciente);
    void delete (int id);
    List<Paciente>listarPacientes();
    Paciente findByCedula(int cedula);
    
}