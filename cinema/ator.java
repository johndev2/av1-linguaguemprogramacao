package cinema;

import java.util.ArrayList;
import java.util.List;

public class ator extends pessoa {
    public int codigo;
    public ArrayList<pessoa> atores;
    public ator(){
    }
    public ator(String nome, int CPF, String endereco, String nacionalidade, String descricao, int codigo,
            ArrayList<pessoa> atores) {
        super(nome, CPF, endereco, nacionalidade, descricao);
        this.codigo = codigo;
        this.atores = atores;
    }
    public ator(String nome, int CPF, String endereco, int codigo, ArrayList<pessoa> atores) {
        super(nome, CPF, endereco);
        this.codigo = codigo;
        this.atores = atores;
    }
    public ator(String nome, String nacionalidade, String descricao, int codigo, ArrayList<pessoa> atores) {
        super(nome, nacionalidade, descricao);
        this.codigo = codigo;
        this.atores = atores;
    }
    public ator(String nome, String nacionalidade, String descricao, int codigo) {
        super(nome, nacionalidade, descricao);
        this.codigo = codigo;
    }
    public ator(int codigo, ArrayList<pessoa> atores) {
        this.codigo = codigo;
        this.atores = atores;
    }
   
    
    
    
}
