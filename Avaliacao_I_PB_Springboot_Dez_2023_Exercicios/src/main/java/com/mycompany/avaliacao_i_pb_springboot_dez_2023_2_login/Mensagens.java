/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_2_login;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Mateus Santos
 */
public class Mensagens {
    public static ArrayList<Mensagens> listaDeMensagens = new ArrayList<>();
    
    private String mensagem;

    public Mensagens(String mensagem) {
        this.mensagem = mensagem;
    }

    public Mensagens() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public void cadastrar_Mensagem(){
        listaDeMensagens.add(new Mensagens("Bom dia, você se logou ao nosso sistema"));
        listaDeMensagens.add(new Mensagens("Boa noite, você se logou ao nosso sistema"));
        listaDeMensagens.add(new Mensagens("Boa madrugada, você se logou ao nosso sistema"));
        listaDeMensagens.add(new Mensagens("Usuário e/ou senha incorretos"));
    }
    
    public String retornar_Mensagem(){
        String mensagem = "";
        
        LocalDateTime data_Hora_Atual = LocalDateTime.now();
        LocalTime hora_Atual = data_Hora_Atual.toLocalTime();
        
        LocalTime manha_Inicio = LocalTime.of(6, 0);
        LocalTime manha_Fim = LocalTime.of(11, 59);
        LocalTime noite_Inicio = LocalTime.of(18, 0);
        LocalTime noite_Fim = LocalTime.of(23, 59);
        LocalTime madrugada_Inicio = LocalTime.MIDNIGHT;
        LocalTime madrugada_Fim = LocalTime.of(5, 59);
        
        if (hora_Atual.isAfter(manha_Inicio) && hora_Atual.isBefore(manha_Fim)) {
            Mensagens mensagem_selecionada = listaDeMensagens.get(0);
            mensagem = mensagem_selecionada.getMensagem();
            
        } else if ((hora_Atual.isAfter(noite_Inicio) && hora_Atual.isBefore(noite_Fim)) ||
                   (hora_Atual.isAfter(LocalTime.MIDNIGHT) && hora_Atual.isBefore(madrugada_Fim))) {
            Mensagens mensagem_selecionada = listaDeMensagens.get(1);
            mensagem = mensagem_selecionada.getMensagem();
            
        } else if (hora_Atual.isAfter(madrugada_Inicio) && hora_Atual.isBefore(madrugada_Fim)) {
            Mensagens mensagem_selecionada = listaDeMensagens.get(2);
            mensagem = mensagem_selecionada.getMensagem();
        }
        return mensagem;
    } 
}
