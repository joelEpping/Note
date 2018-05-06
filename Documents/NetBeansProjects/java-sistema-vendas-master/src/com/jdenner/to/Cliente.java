package com.jdenner.to;

import java.util.Date;

/**
 * Classe contendo os dados do cliente
 *
 * @author joel
 */
public class Cliente {

    private int codigo;
    private String nombre;
    private String ci;
    private Date nacimiento;
    private String correo;
    private String telefono;

    public Cliente() {
        this.codigo = 0;
        this.nombre = "";
        this.ci = "";
        this.nacimiento = new Date();
        this.telefono = "";
        this.telefono = "";
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
        this.nombre = "";
        this.ci = "";
        this.nacimiento = new Date();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nome) {
        this.nombre = nome;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cliente) {
            Cliente c = (Cliente) o;
            if (c.getCodigo() == this.getCodigo()) {
                return true;
            }
        }
        return false;
    }
}
