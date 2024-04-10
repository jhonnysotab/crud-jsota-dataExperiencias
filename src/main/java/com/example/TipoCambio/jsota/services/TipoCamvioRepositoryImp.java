package com.example.TipoCambio.jsota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TipoCambio.jsota.model.TipoCambio;
import com.example.TipoCambio.jsota.repository.TipoCambioRepository;


@Service
public class TipoCamvioRepositoryImp  implements TipoCambioServices{

    @Autowired
    TipoCambioRepository repository;

    @Override
    public TipoCambio save(TipoCambio cambio) {
        return  repository.save(cambio);
    }

    @Override
    public Optional<TipoCambio> findById(Long id) {
        return (Optional<TipoCambio>) repository.findById(id);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TipoCambio> update(Long id, TipoCambio tipoCambio) {
        Optional<TipoCambio> cambio = repository.findById(id);
        if(cambio.isPresent()){
            TipoCambio pro = cambio.orElseThrow();
            pro.setMoneda(tipoCambio.getMoneda()== null ? pro.getMoneda(): tipoCambio.getMoneda());
            pro.setValor(tipoCambio.getValor()== 0 ? pro.getValor(): tipoCambio.getValor());
            return Optional.of(repository.save(pro));
        }
        return cambio;

    }

    @Override
    public List<TipoCambio> findByAll() {
       return (List<TipoCambio>) repository.findAll();
    }

}
