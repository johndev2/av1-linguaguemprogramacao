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

    public filme(String titulo_orig, String titulo_trad, String genero, String atores, String diretor, String sinopse,String nacionalidade, float tam_filme, int id) {
        this.titulo_orig = titulo_orig;
        this.titulo_trad = titulo_trad;
        this.genero = genero;
        this.atores = atores;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.nacionalidade = nacionalidade;
        this.tam_filme = tam_filme;
        this.Id = id;
    }


    public String getTitulo_orig() {
		return titulo_orig;
	}
	public void setTitulo_orig(String titulo_orig) {
		this.titulo_orig = titulo_orig;
	}
	public String getTitulo_trad() {
		return titulo_trad;
	}
	public void setTitulo_trad(String titulo_trad) {
		this.titulo_trad = titulo_trad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAtores() {
		return atores;
	}
	public void setAtores(String atores) {
		this.atores = atores;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public float getTam_filme() {
		return tam_filme;
	}
	public void setTam_filme(float tam_filme) {
		this.tam_filme = tam_filme;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
    




    

}


// classe cinema ( localiza no brasil )
// diversas filiais-
// cidades e estados diferentes -

// lista de filmes (possui varios filmes em cartaz)
// salas podem exibir filmes diferentes
// classe sala ( id diferentes, capacidade )

// classe filme ( titulo original, titulo traduzido, genero, atores, diretores, tamanho do filme, sinopse, nacionalidae, id)
// classe ator ( nome, nacionalide, descricao(o que ele fez))
// classe diretor( nome, nacionalide, descricao( o que ele fez))
// classe cliente(nome, cpf, endereco)

// classe sessao( sala + filme + horario + clientes)
