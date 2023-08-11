/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario{
     public int comissao;
     public int numeroDevendas;
     @Override
    public double calcularSalario() {
       return this.salario + (comissao*numeroDevendas);
    }
}
