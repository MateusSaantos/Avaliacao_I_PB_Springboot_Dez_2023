/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_3_bonus;

import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Controller {
    Scanner ler = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();
    
    int quantidade_funcionarios;
    
    public void adquirir_Dados_funcionarios(){
        System.out.print("QUANTOS FUNCIONARIOS DESEJA CADASTRAR? ");
        quantidade_funcionarios = ler.nextInt();
        
        for(int i = 0; i < quantidade_funcionarios; i++){
            funcionario.cadastrarFuncionario();
        }
        funcionario.listar_Funcionarios();
    }
}
