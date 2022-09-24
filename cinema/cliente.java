package cinema;
 

public class cliente extends pessoa{
    public String endereco;
    public String nome;
    public int CPF;


    

    /**
     * @param endereco
     * @param nome
     * @param CPF
     */
    public cliente(String endereco, String nome, int CPF) {
        super(nome, CPF, endereco);
    } 
    
    
}
