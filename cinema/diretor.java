package cinema;



public class diretor extends pessoa{
    public int codigo;
    public diretor(){

    }
    public diretor(String nome, int CPF, String endereco, String nacionalidade, String descricao, int codigo) {
        super(nome, CPF, endereco, nacionalidade, descricao);
        this.codigo = codigo;
    }
    public diretor(String nome, int CPF, String endereco, int codigo) {
        super(nome, CPF, endereco);
        this.codigo = codigo;
    }
    public diretor(String nome, String nacionalidade, String descricao, int codigo) {
        super(nome, nacionalidade, descricao);
        this.codigo = codigo;
    }
    public diretor(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
    
}
