package cinema;
 

public class cliente extends pessoa{
    public int id;
    

    public cliente(){
    }


    public cliente(String nome, int CPF, String endereco, String nacionalidade, String descricao, int id) {
        super(nome, CPF, endereco, nacionalidade, descricao);
        this.id = id;
    }


    public cliente(String nome, int CPF, String endereco, int id) {
        super(nome, CPF, endereco);
        this.id = id;
    }


    public cliente(String nome, String nacionalidade, String descricao, int id) {
        super(nome, nacionalidade, descricao);
        this.id = id;
    }


    public cliente(int id) {
        this.id = id;
    }

    
    
    
}
