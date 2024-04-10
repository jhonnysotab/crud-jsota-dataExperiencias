package com.example.TipoCambio.jsota.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TIPOCAMBIO")
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoCambio;

    private String moneda;

    private double valor;

    private String estado;

    

    public TipoCambio(Long idTipoCambio, String moneda, double valor, String estado) {
        this.idTipoCambio = idTipoCambio;
        this.moneda = moneda;
        this.valor = valor;
        this.estado = estado;
    }

    public Long getIdTipoCambio() {
        return idTipoCambio;
    }

    public void setIdTipoCambio(Long idTipoCambio) {
        this.idTipoCambio = idTipoCambio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
