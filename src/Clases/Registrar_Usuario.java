/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author elpin
 */
public class Registrar_Usuario {
    private String nombre_usuario;
    private String nombre_completo; 
    private String rut;
    private String correo;
    private String contraseña;
    private String confirmar_contraseña;
    private String id_bodega;
    private String cargo;
    
    public Registrar_Usuario(String nombre_usuario,String nombre_completo,String rut,String correo,String contraseña,String confirmar_contraseña,String id_bodega,String cargo) {
        this.nombre_usuario = nombre_usuario;
        this.nombre_completo = nombre_completo;
        this.rut = rut;
        this.correo = correo;
        this.contraseña = contraseña;
        this.confirmar_contraseña = confirmar_contraseña;
        this.id_bodega = id_bodega;
        this.cargo = cargo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre(String nombre_corto) {
        this.nombre_completo = nombre_corto;
    }
      public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDescrpcion() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmar_contraseña() {
        return confirmar_contraseña;
    }

    public void setConfirmar_contraseña(String confirmar_contraseña) {
        this.confirmar_contraseña = confirmar_contraseña;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId_bodega() {
        return id_bodega;
    }

    public void setId_Bodega(String id_bodega) {
        this.id_bodega = id_bodega;
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
