/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_2_login;

import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Controller {
    Usuarios usuario = new Usuarios();
    Mensagens mensagem = new Mensagens();
    Scanner ler = new Scanner(System.in);
    
    String usuario_correto = "mateus@uol.com.br";
    String senha_correta = "uol123";
    String senha_incorreta = "incorreta";
    
    public void realizar_Login(){
        usuario.cadastrar_Usuarios();
        int opcoes;
        boolean validador = false;
        
        System.out.println("SELECIONE UMA DAS OPÇÕES PARA REALIZAR LOGIN");
        System.out.println("1 - LOGIN CORRETO");
        System.out.println("2 - LOGIN INCORRETO");
        opcoes = ler.nextInt();
        
        if(opcoes == 1){
            System.out.println("USUÁRIO: " + usuario_correto);
            System.out.println("SENHA: " + senha_correta);
            validador = usuario.validar_Login(usuario_correto, senha_correta);
            
        } else if (opcoes == 2){
            System.out.println("USUÁRIO: " + usuario_correto);
            System.out.println("SENHA: "+ senha_incorreta);
            validador = usuario.validar_Login(usuario_correto, senha_incorreta);
        }
        
        String retorno = mensagem.retornar_Mensagem(validador);
        System.out.println(retorno);
    }
}
