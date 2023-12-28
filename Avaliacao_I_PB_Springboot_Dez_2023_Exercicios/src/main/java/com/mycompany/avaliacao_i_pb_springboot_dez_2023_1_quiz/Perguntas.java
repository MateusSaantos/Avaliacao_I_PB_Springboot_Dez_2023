/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_1_quiz;

import java.util.ArrayList;

/**
 *
 * @author Mateus Santos
 */
public class Perguntas {
    private String pergunta;
    private String alternativa_1;
    private String alternativa_2;
    private String alternativa_3;
    private String alternativa_4;
    private int alternativa_correta;

    public static ArrayList<Perguntas> listaDePerguntas = new ArrayList<>();
    
    public Perguntas(String pergunta, String alternativa_1, String alternativa_2, String alternativa_3, String alternativa_4, int alternativa_correta) {
        this.pergunta = pergunta;
        this.alternativa_1 = alternativa_1;
        this.alternativa_2 = alternativa_2;
        this.alternativa_3 = alternativa_3;
        this.alternativa_4 = alternativa_4;
        this.alternativa_correta = alternativa_correta;
    }
    
    public Perguntas() {
    
    }
    
        public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlternativa_1() {
        return alternativa_1;
    }

    public void setAlternativa_1(String alternativa_1) {
        this.alternativa_1 = alternativa_1;
    }

    public String getAlternativa_2() {
        return alternativa_2;
    }

    public void setAlternativa_2(String alternativa_2) {
        this.alternativa_2 = alternativa_2;
    }

    public String getAlternativa_3() {
        return alternativa_3;
    }

    public void setAlternativa_3(String alternativa_3) {
        this.alternativa_3 = alternativa_3;
    }

    public String getAlternativa_4() {
        return alternativa_4;
    }

    public void setAlternativa_4(String alternativa_4) {
        this.alternativa_4 = alternativa_4;
    }

    public int getAlternativa_correta() {
        return alternativa_correta;
    }

    public void setAlternativa_correta(int alternativa_correta) {
        this.alternativa_correta = alternativa_correta;
    }
    
    public void cadstrar_Perguntas(){
        listaDePerguntas.add(new Perguntas("Qual é o maior planeta do sistema solar?", "Marte", "Júpiter", "Vênus", "Saturno", 2));
        listaDePerguntas.add(new Perguntas("Quem é o autor da obra 'Dom Casmurro'?", "Machado de Assis", "Carlos Drummond de Andrade", "Cecília Meireles", "Graciliano Ramos", 1));
        listaDePerguntas.add(new Perguntas("Qual é o nome do oceano mais extenso?", "Atlântico", "Índico", "Pacífico", "Ártico", 3));
        listaDePerguntas.add(new Perguntas("Quantos lados tem um triângulo?", "3", "4", "5", "6", 1));
        listaDePerguntas.add(new Perguntas("Quem foi o primeiro presidente do Brasil?", "Getúlio Vargas", "Juscelino Kubitschek", "Deodoro da Fonseca", "Fernando Collor", 3));
        listaDePerguntas.add(new Perguntas("Em que ano ocorreu a Independência do Brasil?", "1808", "1822", "1889", "1922", 2));
        listaDePerguntas.add(new Perguntas("Qual é o nome do pigmento responsável pela cor verde das plantas?", "Clorofila", "Hemoglobina", "Melanina", "Caroteno", 1));
        listaDePerguntas.add(new Perguntas("Qual é a capital da França?", "Berlim", "Madri", "Paris", "Londres", 3));
        listaDePerguntas.add(new Perguntas("Qual é o nome do processo de transformação do vapor de água em água líquida?", "Condensação", "Evaporação", "Solidificação", "Sublimação", 1));
        listaDePerguntas.add(new Perguntas("Quem pintou a Mona Lisa?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet", 2));
    }
    
    public void listar_Perguntas(Perguntas pergunta){
        System.out.println("Pergunta: " + pergunta.getPergunta());
        System.out.println("Alternativa 1: " + pergunta.getAlternativa_1());
        System.out.println("Alternativa 2: " + pergunta.getAlternativa_2());
        System.out.println("Alternativa 3: " + pergunta.getAlternativa_3());
        System.out.println("Alternativa 4: " + pergunta.getAlternativa_4());
        System.out.println();
    }
}
