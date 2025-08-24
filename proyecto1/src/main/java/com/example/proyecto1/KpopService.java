package com.example.proyecto1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KpopService {

    @Autowired
    private KpopRepository kpopRepository;

    public List<KpopStore> getProductos() {
        return kpopRepository.findAll();
    }

    public Optional<KpopStore> getProducto(Long id) {
        return kpopRepository.findById(id);
    }

    public void saveOrUpdate(KpopStore producto) {
        kpopRepository.save(producto);
    }

    public void delete(Long id) {
        kpopRepository.deleteById(id);
    }
}
