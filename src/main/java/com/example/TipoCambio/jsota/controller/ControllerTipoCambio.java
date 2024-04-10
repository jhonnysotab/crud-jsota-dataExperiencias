package com.example.TipoCambio.jsota.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TipoCambio.jsota.model.TipoCambio;
import com.example.TipoCambio.jsota.repository.TipoCambioRepository;
import com.example.TipoCambio.jsota.services.TipoCambioServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class ControllerTipoCambio {

    @Autowired
    private TipoCambioServices servicio;



    @GetMapping("/saludo")
    public String saludar() {
        return "Hola, ¡bienvenido a mi servicio REST, mi nombre es jhonny sota!";
    }

    @PostMapping("/create")
    public TipoCambio createTipoCambio(@RequestBody TipoCambio TipoCambio) {
        return servicio.save(TipoCambio);

    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateTipoCambio(@PathVariable long id , @RequestBody TipoCambio cambio) {
        Optional<TipoCambio>  data =servicio.update(id, cambio);
        return ResponseEntity.ok().body(data);
    }


  
    @GetMapping("/list/{id}")
    public ResponseEntity<?> getAlTipoCambios(@PathVariable Long id) {
         Optional<TipoCambio> option = servicio.findById(id);
         
          if (option.isPresent()) {
              return ResponseEntity.ok(option.orElseThrow());
          
         }
         return ResponseEntity.noContent().build();
    }

    @GetMapping("/list")
    public List<TipoCambio> findAll() {
        return servicio.findByAll();
    }

}
