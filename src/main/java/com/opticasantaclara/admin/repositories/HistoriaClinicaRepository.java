package com.opticasantaclara.admin.repositories;

import java.util.List;

import com.opticasantaclara.admin.entities.HistoriaClinica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Integer >{
    @Query("SELECT hc FROM HistoriaClinica hc WHERE hc.paciente.cedula = :cedula")
    List<HistoriaClinica> findHiClinicasByPaciente(@Param("cedula")Integer pacienteCedula);

    @Query(value = "SELECT * FROM historiasclinicas hc INNER JOIN pacientes pa ON hc.cedula_paciente = pa.cedula WHERE hc.id=:id", nativeQuery = true)
    HistoriaClinica findHiClinicasById(@Param("id")Integer hiClinicaId);
}