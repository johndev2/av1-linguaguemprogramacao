package cinema;

import java.util.ArrayList;

public class sala extends filme{
    public int idSala;
    public String nomeSala;
    public int capacidade;
    

    public sala(){
    }

    public sala(int idSala, String nomeSala, int capacidade) {
        this.idSala = idSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
    }

    public sala(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,
            float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores, int idSala, String nomeSala,
            int capacidade) {
        super(titulo_orig, titulo_trad, genero, sinopse, nacionalidade, tam_filme, id, atores, diretores);
        this.idSala = idSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
    }

 
}
