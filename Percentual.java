/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio_entregar;

import javax.swing.JOptionPane;

/**
 *
 * @author mcl_l
 */
public class Percentual {
    
    private String nome, tipoAvaliacao;
    private float notaMaxima;
    
    public Percentual(){
        nome          = JOptionPane.showInputDialog(null, "Insira seu nome", "Nome", JOptionPane.INFORMATION_MESSAGE);
        tipoAvaliacao = JOptionPane.showInputDialog(null, "Insira o nome da avaliacao", "Avaliacao", JOptionPane.INFORMATION_MESSAGE);
        notaMaxima    = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira sua nota", "Nota", JOptionPane.INFORMATION_MESSAGE));
    }

    public Percentual(String nome, String tipoAvaliacao, float notaMaxima){
        this.nome = nome;
        this.tipoAvaliacao = tipoAvaliacao;
        this.notaMaxima = notaMaxima;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", Tipo de Avaliação = " + tipoAvaliacao + ", Percentual de nota = " + (notaMaxima *100) /10 + "%" +'}';
    }

    
    
}
