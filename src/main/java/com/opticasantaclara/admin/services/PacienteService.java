package com.opticasantaclara.admin.services;

import java.util.List;

import com.opticasantaclara.admin.entities.Paciente;
import com.opticasantaclara.admin.repositories.PacienteRepository;
import com.opticasantaclara.admin.repositoriesServices.IPacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService {
    @Autowired
    private PacienteRepository pRepository;

    @Override
    public Paciente saveOrUpdate(Paciente paciente) {

        return pRepository.save(paciente);
    }

    @Override
    public void delete(int id) {
        pRepository.deleteById(id);

    }

    @Override
    public List<Paciente> listarPacientes() {

        return pRepository.findAll();
    }

    @Override
    public Paciente findByCedula(int cedula) {

        return pRepository.getOne(cedula);
    }
    
}