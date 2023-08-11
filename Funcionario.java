/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    public String nome;
    public int salario;
    public LocalDate dataNascimento;
    
    public double calcularSalario() {
       return this.salario;
    }
}
