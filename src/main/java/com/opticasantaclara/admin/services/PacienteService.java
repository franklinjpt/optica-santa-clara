package com.opticasantaclara.admin.services;

import java.util.List;

import com.opticasantaclara.admin.entities.HistoriaClinica;
import com.opticasantaclara.admin.entities.Paciente;
import com.opticasantaclara.admin.repositories.HistoriaClinicaRepository;
import com.opticasantaclara.admin.repositories.PacienteRepository;
import com.opticasantaclara.admin.repositoriesServices.IPacienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService implements IPacienteService {
    @Autowired
    private PacienteRepository pRepository;

    @Autowired
    private HistoriaClinicaRepository hcRepository;

    @Override
    public Paciente saveOrUpdate(Paciente paciente) {

        return pRepository.save(paciente);
    }

    @Override
    public void delete(Integer id) {
        pRepository.deleteById(id);

    }

    @Override
    public List<Paciente> listarPacientes() {

        return pRepository.findAll();
    }

    @Override
    public Paciente findByCedula(Integer cedula) {

        return pRepository.getOne(cedula);
    }

    @Override
    public List<HistoriaClinica> findHiClinicasByPaciente(Paciente paciente) {
        
        return hcRepository.findHiClinicasByPaciente(paciente.getCedula());
    }

    @Override
    public HistoriaClinica crearOEditarHiClinica(HistoriaClinica historiaClinica) {
        
        return hcRepository.save(historiaClinica);
    }

    @Override
    public void eliminarHiClinica(Integer id) {
        hcRepository.deleteById(id);
    }

    @Override
    public List<HistoriaClinica> listarHiClinicas() {
        
        return hcRepository.findAll();
    }

    @Override
    public HistoriaClinica findHiClinicasByPacienteAndId(Paciente paciente, HistoriaClinica hiclinica) {
        
        return hcRepository.findHiClinicasByPacienteAndId(paciente.getCedula(), hiclinica.getId());
    }

    @Override
    public HistoriaClinica findByIdHiclinica(Integer id) {
        
        return hcRepository.getOne(id);
    }
    
}