/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

/**
 *
 * @author johnv
 */
public class filme {
    public String titulo_orig;
    public String titulo_trad;
    public String genero;
    public String atores;
    public String diretor;
    public String sinopse;
    public String nacionalidade;
    public float tam_filme;
    public int Id;
    
}

/*
classe cinema ( localiza no brasil )
diversas filiais-
cidades e estados diferentes -

lista de filmes (possui varios filmes em cartaz)
salas podem exibir filmes diferentes
classe sala ( id diferentes, capacidade )

classe filme ( titulo original, titulo traduzido, genero, atores, diretores, tamanho do filme, sinopse, nacionalidae, id)
classe ator ( nome, nacionalide, descrição(o que ele fez))
classe diretor( nome, nacionalide, descrição( o que ele fez))
classe cliente(nome, cpf, endereço)

classe sessao( sala + filme + horario + clientes)
*/