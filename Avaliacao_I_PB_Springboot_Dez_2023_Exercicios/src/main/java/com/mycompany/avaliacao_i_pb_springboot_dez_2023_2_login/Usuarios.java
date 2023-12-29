/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_2_login;

import java.util.ArrayList;

/**
 *
 * @author Mateus Santos
 */
public class Usuarios {
    public static ArrayList<Usuarios> listaDeUsuarios = new ArrayList<>();
    
    private String usuario;
    private String senha;
    
    public Usuarios(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuarios() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrar_Usuarios(){
        listaDeUsuarios.add(new Usuarios("mateus@uol.com.br", "uol123"));
        listaDeUsuarios.add(new Usuarios("brenda@uol.com.br", "uol456"));
    }
    
    public boolean validar_Login(String usuario_informado, String senha_informada){
        boolean validador = false;
        
        for(Usuarios usuario : listaDeUsuarios){
            if(usuario.getUsuario() == usuario_informado && usuario.getSenha() == senha_informada){
                validador = true;
            }
        }
        
        return validador;
    }
}
