/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    PROVA ("Prova"),
    TRABALHO ("Trabalho"),
    SEMINARIO ("Seminario");
    
    private String nomeAvaliacao;

    private TipoAvaliacao(String nome) {
        this.nomeAvaliacao = nome;
    }
    
    
}