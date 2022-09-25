package cinema;

public class compra {
    public int id;
    public String nome;
    public int cpf_cliente;
    public int cod_sessao;
    public String filme;

    

    public compra(int id, String nome, int cpf_cliente, int cod_sessao, String filme) {
        this.id = id;
        this.nome = nome;
        this.cpf_cliente = cpf_cliente;
        this.cod_sessao = cod_sessao;
        this.filme = filme;
    }



    public compra(){

    }

}
