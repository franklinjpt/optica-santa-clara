package com.opticasantaclara.admin.services;

import java.util.List;

import com.opticasantaclara.admin.entities.Inventario;
import com.opticasantaclara.admin.repositories.InventarioRepository;
import com.opticasantaclara.admin.repositoriesServices.IInventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioService implements IInventarioService {
    @Autowired
    private InventarioRepository iRepository;

    @Override
    public Inventario saveOrUpdate(Inventario inventario) {
        
        return iRepository.save(inventario);
    }

    @Override
    public void delete(Integer id) {

        iRepository.deleteById(id);
    }

    @Override
    public List<Inventario> listarInventarios() {
        
        return iRepository.findAll();
    }

    @Override
    public Inventario findById(Integer id) {
        
        return iRepository.getOne(id);
    }
    
}
