package com.opticasantaclara.admin.repositories;

import com.opticasantaclara.admin.entities.Inventario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Integer>{
    
}
