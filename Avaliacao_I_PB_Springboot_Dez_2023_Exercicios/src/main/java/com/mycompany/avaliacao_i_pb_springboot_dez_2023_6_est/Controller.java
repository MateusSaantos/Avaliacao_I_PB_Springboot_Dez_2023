/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao_i_pb_springboot_dez_2023_6_est;

/**
 *
 * @author Mateus Santos
 */
public class Controller {
    
    Produtos produto = new Produtos();
    
    public void testes(){
        produto.cadastrar_Produtos();
        
        produto.listar_Produtos();
        
        //Realizando testes com o produto "Teclado"
        produto.vender_Produto(produto.listaDeProdutos.get(0), 1);
        
        produto.inserir_estoque_Produto(produto.listaDeProdutos.get(0), 15);
        
        produto.vender_Produto(produto.listaDeProdutos.get(0), 100);
    } 
}
