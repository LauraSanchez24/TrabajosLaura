package com.sena.backend.venta.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.backend.venta.Entity.DescripcionVentas;
import com.sena.backend.venta.IRepository.IBaseRepository;
import com.sena.backend.venta.IRepository.IDescripcionVentasRepository;
import com.sena.backend.venta.IService.IDescripcionVentasService;

@Service
public class DescripcionVentasService extends ABaseService <DescripcionVentas> implements IDescripcionVentasService {
    @Autowired
    private IDescripcionVentasRepository repository;

    @Override
    protected IBaseRepository <DescripcionVentas, Long> getRepository(){
        return repository;
    }

    @Override
    public Optional<DescripcionVentas> findById(Long id) throws Exception {
        // TODO Auto-generated method stub
        return Optional.empty();
    }  
}
