/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorUsuario extends ControladorAbstracto<Usuario> {

    private List<Usuario> listaUsuarios;
    private List<List> listaCasados;
    private static ControladorUsuario ctrlus;

    private ControladorUsuario() {
        listaUsuarios = new ArrayList<>();
        listaCasados = new ArrayList<>();
    }
    
    public static ControladorUsuario getInstance(){
        if (ctrlus == null) {
            ctrlus = new ControladorUsuario();
        }
        return ctrlus;
    }
    
    @Override
    public boolean create(Usuario objeto) {
        if (!listaUsuarios.contains(objeto)) {
            return listaUsuarios.add(objeto);
        }
        return true;
    }

    public boolean createCasados(Usuario objeto, Usuario objeto2, Usuario objeto3, Usuario objeto4) {
//        if (listaCasados.contains(objeto)) {
        List<Usuario> c = new ArrayList<>();
        c.add(objeto);
        c.add(objeto2);
        c.add(objeto3);
        c.add(objeto4);
        return listaCasados.add(c);
//        }
//        return true;
    }

    @Override
    public Usuario readNombre(String objeto) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            var us = listaUsuarios.get(i);
            if (objeto.equals(us.getNombre())) {
                return us;
            }
        }
        return null;
    }

    public boolean comprobarCorreo(String correo) {
        return listaUsuarios.stream().filter(c -> correo.equals(c.getCorreo())).noneMatch(c -> correo.equals(c.getCorreo()));
    }

    Usuario obtenerSesionIniciada;

    public boolean iniciarSesion(String correo, String contrasenia) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            var us = listaUsuarios.get(i);
            if (correo.equals(us.getCorreo()) && contrasenia.equals(us.getContraseña())) {
                obtenerSesionIniciada = us;
                return true;
            }
        }
        return false;
    }

    public Usuario getSesionIniciada() {
        return obtenerSesionIniciada;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> findAll() {
        return listaUsuarios;
    }

    public List<List> findAll2() {
        return listaCasados;
    }
}
