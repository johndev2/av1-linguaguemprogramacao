package cinema;

import java.util.ArrayList;

public class sessao extends sala{
    public String horario;

    public sessao(){
    }

    public sessao(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,
            float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores, int idSala, String nomeSala,int capacidade, String horario) {
        super(titulo_orig, titulo_trad, genero, sinopse, nacionalidade, tam_filme, id, atores, diretores, idSala,nomeSala, capacidade);
        this.horario = horario;
    }

    public sessao(String horario) {
        this.horario = horario;
    }

    public sessao(int idSala, String nomeSala, int capacidade, String horario) {
        super(idSala, nomeSala, capacidade);
        this.horario = horario;
    }

    
}
