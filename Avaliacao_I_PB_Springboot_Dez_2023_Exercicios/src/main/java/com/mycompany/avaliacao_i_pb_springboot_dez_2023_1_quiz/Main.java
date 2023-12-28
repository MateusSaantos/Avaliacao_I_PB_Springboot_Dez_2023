/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_1_quiz;

/**
 *
 * @author Mateus Santos
 */
public class Main {
    public static void main(String[] args) {
        Controler controle = new Controler();
        
        controle.cadastrar_Usuario();
        controle.alternativa_Usuario();
        controle.acertos_erros();
    }
}
