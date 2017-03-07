package com.example.android.abrilcultural;

/**
 * Created by INTEL on 06/03/2017.
 */

public class Evento {
    private String Mes;
    private String DiaMes;
    private String DiaSemana;
    private String TipoEvento;
    private String Titulo;
    private String Descripcion;
    private String Organiza;
    private String Lugar;
    private String Hora;

    public Evento(String mes, String diaSemana, String diaMes, String tipoEvento, String titulo, String descripcion, String organiza, String lugar, String hora) {
        Mes = mes;
        DiaMes = diaMes;
        DiaSemana = diaSemana;
        TipoEvento = tipoEvento;
        Titulo = titulo;
        Descripcion = descripcion;
        Organiza = organiza;
        Lugar = lugar;
        Hora = hora;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public String getDiaSemana() {
        return DiaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        DiaSemana = diaSemana;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getOrganiza() {
        return Organiza;
    }

    public void setOrganiza(String organiza) {
        Organiza = organiza;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getTipoEvento() {
        return TipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        TipoEvento = tipoEvento;
    }

    public String getDiaMes() {
        return DiaMes;
    }

    public void setDiaMes(String diaMes) {
        DiaMes = diaMes;
    }
}
