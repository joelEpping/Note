/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdenner.to;

/**
 *
 * @author User
 */
public class Usuario {
    private int codigo;
    private int ci;
    private int nivel_acceso;
    private String nombre;
    private String username;
    private String password;
    
    public Usuario(){
        this.codigo=0;
        this.ci=0;
        this.ci=0;
        this.nombre="";
        this.password="";
        this.username="";
    }

    public Usuario(int codigo, int ci, int nivel_acceso, String nombre, String username, String password) {
        this.codigo = codigo;
        this.ci = ci;
        this.nivel_acceso = nivel_acceso;
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(int nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", ci=" + ci + ", nivel_acceso=" + nivel_acceso + ", nombre=" + nombre + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
    
    
}
