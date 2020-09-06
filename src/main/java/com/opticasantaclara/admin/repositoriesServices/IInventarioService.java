package com.opticasantaclara.admin.repositoriesServices;

import java.util.List;

import com.opticasantaclara.admin.entities.Inventario;

public interface IInventarioService {
    Inventario saveOrUpdate(Inventario inventario);
    void delete(Integer id);
    List<Inventario>listarInventarios();
    Inventario findById(Integer id);
}
