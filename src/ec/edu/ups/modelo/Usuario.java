/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author braya
 */
public  class Usuario{
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Direccion;
    private String Genero;
    private Date FechaNac;
    private String Correo;
    private String Contraseña;
    private String PapelEnBoda;
    private String LugarBoda;
    private Date FechaBoda;
    
    
    
    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, String Cedula, String Direccion, String Genero, Date FechaNac, String Correo, String Contraseña, String PapelEnBoda) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.PapelEnBoda = PapelEnBoda;
    }

    public Usuario(String Nombre, String Apellido, String Cedula, String Direccion, String Genero, Date FechaNac, String Correo, String Contraseña, String LugarBoda, Date FechaBoda) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Genero = Genero;
        this.FechaNac = FechaNac;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.LugarBoda = LugarBoda;
        this.FechaBoda = FechaBoda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }   

    public String getLugarBoda() {
        return LugarBoda;
    }

    public void setLugarBoda(String LugarBoda) {
        this.LugarBoda = LugarBoda;
    }

    public Date getFechaBoda() {
        return FechaBoda;
    }

    public void setFechaBoda(Date FechaBoda) {
        this.FechaBoda = FechaBoda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.Cedula);
        hash = 71 * hash + Objects.hashCode(this.Correo);
        hash = 71 * hash + Objects.hashCode(this.Nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.Cedula, other.Cedula)) {
            return false;
        }
        if (!Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + ", Direccion=" + Direccion + ", Genero=" + Genero + ", FechaNac=" + FechaNac + ", Correo=" + Correo + ", Contrase\u00f1a=" + Contraseña + ", PapelEnBoda=" + PapelEnBoda + ", LugarBoda=" + LugarBoda + ", FechaBoda=" + FechaBoda + '}';
    }

    
}
