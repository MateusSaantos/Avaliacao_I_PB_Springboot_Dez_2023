/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_5_palin;

import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Controller {
    
    public void capturar_palavra(){
        Scanner ler = new Scanner(System.in);

        // Solicita ao usuário para inserir uma palavra
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine();

        // Verifica se a palavra é um palíndromo
        if (verificar_palindromo(palavra)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
    
    public boolean verificar_palindromo(String palavra){
        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(palavraInvertida);
    }
}
