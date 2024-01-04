/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_6_est;

import java.util.ArrayList;

/**
 *
 * @author Mateus Santos
 */
public class Produtos {
    
    public static ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
    
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produtos(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void cadastrar_Produtos() {
        Produtos teclado = new Produtos("Teclado", 1, 29.99, 50);
        Produtos.listaDeProdutos.add(teclado);

        Produtos mouse = new Produtos("Mouse", 2, 19.99, 40);
        Produtos.listaDeProdutos.add(mouse);

        Produtos monitor = new Produtos("Monitor", 3, 199.99, 20);
        Produtos.listaDeProdutos.add(monitor);

        Produtos cpu = new Produtos("CPU", 4, 499.99, 10);
        Produtos.listaDeProdutos.add(cpu);
    }
    
    public void listar_Produtos() {
        System.out.println("========== LISTA DE PRODUTOS ==========\n");

        for (Produtos produto : Produtos.listaDeProdutos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidade());
            System.out.println("---------------------------");
        }
    }
    
    public void vender_Produto(Produtos produto, int quantidadeVendida) {
        System.out.println("========== VENDA DE PRODUTOS ==========\n");
        System.out.println("Solicitação de venda do produto " + produto.getNome());
        historico_Produto(produto, quantidadeVendida, "vender");
    }
    
    public void inserir_estoque_Produto(Produtos produto, int quantidadeVendida) {
        System.out.println("========== COMPRA DE PRODUTOS ==========\n");
        System.out.println("Realização de compra do produto " + produto.getNome());
        historico_Produto(produto, quantidadeVendida, "inserir");
    }
    
    public void historico_Produto(Produtos produto, int quantidadeAlterada, String acao) {
        if ("inserir".equalsIgnoreCase(acao)) {
            System.out.println("Inserindo " + quantidadeAlterada + " unidades de " + produto.getNome() + " no estoque.");
            produto.setQuantidade(produto.getQuantidade() + quantidadeAlterada);
            
            
        } else if ("vender".equalsIgnoreCase(acao)) {
            if (produto.getQuantidade() >= quantidadeAlterada) {
                System.out.println("Retirando " + quantidadeAlterada + " unidades de " + produto.getNome() + " do estoque.");
                produto.setQuantidade(produto.getQuantidade() - quantidadeAlterada);
                
                System.out.println("Venda realizada com sucesso!");
                System.out.println("Nova quantidade em estoque: " + produto.getQuantidade());
            } else {
                System.out.println("Estoque insuficiente para retirar a quantidade desejada.");
                System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                
            }
        }
    }
}
