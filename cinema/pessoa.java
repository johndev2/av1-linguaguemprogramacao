/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author johnv
 */
public class pessoa {
    public String nome;
    private int CPF;
    public String endereco;
    public String nacionalidade;
    public String descricao;

    public pessoa(String nome, int CPF, String endereco, String nacionalidade, String descricao) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.descricao = descricao;
    }

    public pessoa(String nome, int CPF, String endereco) { // Cliente
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public pessoa(String nome, String nacionalidade, String descricao) { // Ator e Diretor
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.descricao = descricao;
    }
    
    
    
}
