package com.example.TipoCambio.jsota.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.TipoCambio.jsota.model.TipoCambio;
 
@Repository
public interface TipoCambioRepository extends CrudRepository<TipoCambio,Long>{
 

}
