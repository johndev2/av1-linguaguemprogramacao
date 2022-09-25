package cinema;


public class ator extends pessoa {
    public int codigo;
    
    public ator(){
    }

    public ator(String nome, int CPF, String endereco, String nacionalidade, String descricao, int codigo) {
        super(nome, CPF, endereco, nacionalidade, descricao);
        this.codigo = codigo;
    }

    public ator(String nome, int CPF, String endereco, int codigo) {
        super(nome, CPF, endereco);
        this.codigo = codigo;
    }

    public ator(String nome, String nacionalidade, String descricao, int codigo) {
        super(nome, nacionalidade, descricao);
        this.codigo = codigo;
    }

    public ator(int codigo) {
        this.codigo = codigo;
    }
    
   
    
    
    
}
