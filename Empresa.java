/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;

import java.time.LocalDate;
import java.util.Scanner;



/**
 *
 * @author Aluno
 */
public class Empresa {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.nome = "Marcos";
        gerente.salario = 4500;
        gerente.dataNascimento = LocalDate.now();
        
       double salarioGerente = gerente.calcularSalario();
        System.out.println("nome do gerente: "+gerente.nome);
        System.out.println("salario: "+gerente.salario);
        System.out.println("data de nascimento: "+gerente.dataNascimento);
        System.out.println("salario total: "+salarioGerente);
        
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Jose";
        vendedor.salario = 2500;
        vendedor.dataNascimento = LocalDate.now();
        vendedor.comissao = 30;
        vendedor.numeroDevendas = 17;
        
        double salarioVendedor = vendedor.calcularSalario();
        System.out.println("salario vendedor: " + vendedor.salario);
        System.out.println("nome do vendedor: " + vendedor.nome);
        System.out.println("data de nascimento " + vendedor.dataNascimento);
        System.out.println("salario total: " + salarioVendedor);
        
        //atalho System.out.println = sout + tab
}
}