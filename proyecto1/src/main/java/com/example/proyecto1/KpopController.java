package com.example.proyecto1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/kpop")
public class KpopController {

    @Autowired
    private KpopService kpopService;

    @GetMapping
    public List<KpopStore> getAll() {
        return kpopService.getProductos();
    }

    @GetMapping("/{kpopId}")
    public Optional<KpopStore> getById(@PathVariable("kpopId") Long kpopId) {
        return kpopService.getProducto(kpopId);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody KpopStore producto) {
        kpopService.saveOrUpdate(producto);
    }

    @PutMapping("/{kpopId}")
    public void update(@PathVariable("kpopId") Long kpopId, @RequestBody KpopStore producto) {
        producto.setKpopId(kpopId); 
        kpopService.saveOrUpdate(producto);
    }


    @DeleteMapping("/{kpopId}")
    public void delete(@PathVariable("kpopId") Long kpopId) {
        kpopService.delete(kpopId);
    }
}
