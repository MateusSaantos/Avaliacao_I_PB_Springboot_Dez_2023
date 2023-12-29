/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_3_bonus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Funcionario {
    public static ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    
    private String funcionario;
    private double salario_bruto;
    private double bonus_desconto;
    private double salario_liquido;

    public Funcionario(String funcionario, double salario_bruto, double bonus_desconto, double salario_liquido) {
        this.funcionario = funcionario;
        this.salario_bruto = salario_bruto;
        this.bonus_desconto = bonus_desconto;
        this.salario_liquido = salario_liquido;
    }

    public Funcionario() {
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }

    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public double getBonus_desconto() {
        return bonus_desconto;
    }

    public void setBonus_desconto(double bonus_desconto) {
        this.bonus_desconto = bonus_desconto;
    }

    public double getSalario_liquido() {
        return salario_liquido;
    }

    public void setSalario_liquido(double salario_liquido) {
        this.salario_liquido = salario_liquido;
    }
    
    public double calcular_Bonus_Desconto(double salario_informado){
        double bonus_desconto_calculado = 0;
        
        if(salario_informado <= 1000){
            bonus_desconto_calculado = 20.00;
        } else if(salario_informado > 1000 || salario_informado <= 2000){
            bonus_desconto_calculado = 10.00;
            
        } else if(salario_informado > 2000){
            bonus_desconto_calculado = 10.00;
            
        }
        
        return bonus_desconto_calculado;
    }
    
    public double calcula_salario_liquido(double salario_informado){
        double salario_liquido_calculado = 0;
        
        if(salario_informado <= 1000){
            salario_liquido_calculado = (salario_informado * 1.2);
            
        } else if(salario_informado > 1000 && salario_informado <= 2000){
            salario_liquido_calculado = (salario_informado * 1.1);
            
        } else if(salario_informado > 2000){
            salario_liquido_calculado = (salario_informado * 0.9);
            
        }
        return salario_liquido_calculado;
    }
    
    public void cadastrarFuncionario() {
        System.out.print("DIGITE O NOME DO FUNCIONARIO: ");
        String nome_informado = ler.next();

        System.out.print("DIGITE O SALARIO BRUTO: ");
        double salario_informado = ler.nextDouble();

        double bonus_desconto_calculado = calcular_Bonus_Desconto(salario_informado);
        
        double salario_liquido_calculado = calcula_salario_liquido(salario_informado);
        
        Funcionario novo_funcionario = new Funcionario(nome_informado, salario_informado, bonus_desconto_calculado, salario_liquido_calculado);

        listaDeFuncionarios.add(novo_funcionario);
    }
    
    public void listar_Funcionarios(){
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("--------------------");
            System.out.println("FUNCIONARIO: " + funcionario.getFuncionario());
            
            String salario_Bruto_Formatado = String.format("%.2f", funcionario.getSalario_bruto());
            System.out.println("SALARIO BRUTO: R$ " + salario_Bruto_Formatado);
            
            if(funcionario.getSalario_bruto() > 2000){
                String desconto_Bruto_Formatado = String.format("%.2f", funcionario.getBonus_desconto());
                System.out.println("DESCONTO: R$ " + desconto_Bruto_Formatado);
                
            } else{
                String desconto_Bruto_Formatado = String.format("%.2f", funcionario.getBonus_desconto());
                System.out.println("BONUS: R$ " + desconto_Bruto_Formatado);
                
            }
            String salario_Liquido_Formatado = String.format("%.2f", funcionario.getSalario_liquido());
            System.out.println("SALARIO LIQUIDO: R$ " + salario_Liquido_Formatado);
            System.out.println("--------------------");
        }
    }
}
