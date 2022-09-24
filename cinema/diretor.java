package cinema;

import java.util.ArrayList;

public class diretor extends pessoa{
    public int codigo;
    public ArrayList<pessoa> diretores;
    public diretor(){

    }
    public diretor(String nome, int CPF, String endereco, String nacionalidade, String descricao, int codigo,
            ArrayList<pessoa> diretores) {
        super(nome, CPF, endereco, nacionalidade, descricao);
        this.codigo = codigo;
        this.diretores = diretores;
    }
    public diretor(String nome, int CPF, String endereco, int codigo, ArrayList<pessoa> diretores) {
        super(nome, CPF, endereco);
        this.codigo = codigo;
        this.diretores = diretores;
    }
    public diretor(String nome, String nacionalidade, String descricao, int codigo, ArrayList<pessoa> diretores) {
        super(nome, nacionalidade, descricao);
        this.codigo = codigo;
        this.diretores = diretores;
    }
    public diretor(int codigo, ArrayList<pessoa> diretores) {
        this.codigo = codigo;
        this.diretores = diretores;
    }

    
    
    
    
    
}
