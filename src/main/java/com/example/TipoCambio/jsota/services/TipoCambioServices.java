package com.example.TipoCambio.jsota.services;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.TipoCambio.jsota.model.TipoCambio;
import com.example.TipoCambio.jsota.repository.TipoCambioRepository;


public interface TipoCambioServices {

    TipoCambio save(TipoCambio cambio);
    Optional<TipoCambio> findById(Long id );
    void delete(long id);
    Optional<TipoCambio>  update (Long id, TipoCambio tipoCambio);
    List<TipoCambio>findByAll();



}
