/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author braya
 */
public class LugarCeremonia {
    private Date fechaMatrimonio;
    private String lugar;
    private List<Usuario> listaUsuarios;

    public LugarCeremonia() {this.listaUsuarios = new ArrayList<>();}

    public LugarCeremonia(Date fechaMatrimonio, String lugar) {
        this.fechaMatrimonio = fechaMatrimonio;
        this.lugar = lugar;
        listaUsuarios = listaUsuarios;
    }

    public LugarCeremonia(Date fechaMatrimonio, String lugar, List<Usuario> listaUsuarios) {
        this.fechaMatrimonio = fechaMatrimonio;
        this.lugar = lugar;
        this.listaUsuarios = listaUsuarios;
    }

    public Date getFechaMatrimonio() {
        return fechaMatrimonio;
    }

    public void setFechaMatrimonio(Date fechaMatrimonio) {
        this.fechaMatrimonio = fechaMatrimonio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
        
}
