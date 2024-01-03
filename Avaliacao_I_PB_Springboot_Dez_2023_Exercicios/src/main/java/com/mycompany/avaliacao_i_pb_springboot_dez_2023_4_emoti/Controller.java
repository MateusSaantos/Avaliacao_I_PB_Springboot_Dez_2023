/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_4_emoti;

import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Controller {
    
    public void recebe_frase(){
        Scanner ler = new Scanner(System.in);
        String resultado;

        // Solicita ao usuário para inserir a frase
        System.out.println("Digite uma frase: ");
        String frase = ler.nextLine();
        
        resultado = validador_emoticons(frase);
        
        System.out.println(resultado);
    }
    
    public String validador_emoticons(String frase){
        int divertido;
        int chateado;
        
        divertido = contar_emoticons_frase(frase, ":-)");
        chateado = contar_emoticons_frase(frase, ":-(");
        
        if(divertido > chateado){
            return "Divertido";
        
        } else if(chateado > divertido){
            return "Chateado";
        } else {
            return "Neutro";
        }
    }
    
    public int contar_emoticons_frase(String frase, String emoticon) {
        int controle = 0;
        int index = frase.indexOf(emoticon);

        while (index != -1) {
            controle = controle + 1;
            index = frase.indexOf(emoticon, index + 1);
        }

        return controle;
    }
}
