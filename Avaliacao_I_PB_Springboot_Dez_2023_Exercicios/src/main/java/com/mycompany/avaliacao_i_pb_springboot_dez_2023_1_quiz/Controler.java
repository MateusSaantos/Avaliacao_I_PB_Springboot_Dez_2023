/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_1_quiz;

import static com.mycompany.avaliacao_i_pb_springboot_dez_2023_1_quiz.Perguntas.listaDePerguntas;
import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Controler {
   Perguntas pergunta = new Perguntas();
   Scanner ler = new Scanner(System.in);
   
   int[] respostas_usuario = new int[10];
   public void alternativa_Usuario(){
       pergunta.cadstrar_Perguntas();
       
       for(int i = 0; i < 10; i++){
           System.out.println("===========================");
           System.out.println("PERGUNTA NUMERO " + i + 1);
           pergunta = listaDePerguntas.get(i);
           pergunta.listar_Perguntas(pergunta);

           System.out.println("===========================");           
           System.out.print("QUAL A ALTERNATIVA CORRETA? ");
           respostas_usuario[i] = ler.nextInt();
       }
   }
   
   public void acertos_erros(){
       int acertos = 0;
       int erros = 0;
       int controle = 0;
       for (Perguntas pergunta : listaDePerguntas) {
           
           if(pergunta.getAlternativa_correta() == respostas_usuario[controle]){
               acertos = acertos + 1;
           
           } else {
               erros = erros + 1;
               
           }
           controle = controle + 1;
       }
   }
   
}
