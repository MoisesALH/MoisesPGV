package com.example.vistatitsa.model;

public class Linea {
    private int numero;
    private String ubiInicio;
    private String ubiFin;

    public Linea(int numero, String ubiInicio, String ubiFin) {
        this.numero = numero;
        this.ubiInicio = ubiInicio.toUpperCase();
        this.ubiFin = ubiFin.toUpperCase();
    }

    @Override
    public String toString(){
        return "Linea " + numero + "\n" + ubiInicio + " -> " + ubiFin;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbiInicio() {
        return ubiInicio;
    }

    public void setUbiInicio(String ubiInicio) {
        this.ubiInicio = ubiInicio;
    }

    public String getUbiFin() {
        return ubiFin;
    }

    public void setUbiFin(String ubiFin) {
        this.ubiFin = ubiFin;
    }
}
