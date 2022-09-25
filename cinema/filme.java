/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import java.util.ArrayList;

public class filme {
    public String titulo_orig;
    public String titulo_trad;
    public String genero;
    public String sinopse;
    public String nacionalidade;
    public float tam_filme;
    public int Id;
    public ArrayList<ator> atores;
    public ArrayList<diretor> diretores;


    public filme() {
    }


	public filme(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,
			float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores) {
		this.titulo_orig = titulo_orig;
		this.titulo_trad = titulo_trad;
		this.genero = genero;
		this.sinopse = sinopse;
		this.nacionalidade = nacionalidade;
		this.tam_filme = tam_filme;
		Id = id;
		this.atores = atores;
		this.diretores = diretores;
	}


    public void exibirDiretores(){
        for(int i=0; i< diretores.size();i++){
			if(diretores.get(i).nacionalidade == "brasileira") System.out.println(diretores.get(i).nome+" - "+diretores.get(i).CPF+" - "+diretores.get(i).endereco+" - "+diretores.get(i).descricao);
			else System.out.println(diretores.get(i).nome+" - "+diretores.get(i).nacionalidade+" - "+diretores.get(i).endereco+" - "+diretores.get(i).descricao);
		}
    }
    public void exibirAtores(){
        for(int i=0; i< atores.size();i++){
			if(atores.get(i).nacionalidade == "brasileira") System.out.println(atores.get(i).nome+" - "+atores.get(i).CPF+" - "+atores.get(i).endereco+" - "+atores.get(i).descricao);
			else System.out.println(atores.get(i).nome+" - "+atores.get(i).nacionalidade+" - "+atores.get(i).endereco+" - "+atores.get(i).descricao);
		}
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

//     Funcionario f = new Funcionario();
        //     System.out.println("Informe o nome do funcionário:");
        //     f.nome = s.next();
        //     System.out.println("Informe a matricula do funcionário:");
        //     f.matricula=s.nextInt();
        //     Funcionario funcionario = new Funcionario(f.nome, f.matricula);
        //     System.out.println("Informe a área do funcionário:");
        //     gerente = new Gerente(funcionario.nome, funcionario.matricula, s.next());
        //     listaGerente.add(gerente);
        //     System.out.println("\n Deseja Continuar: 1-Sim, 2-Não");
        //     opcao = s.nextInt();
        // }while(opcao != 0);
        // for (int i = 0; i <listaGerente.size(); i++) {
        //     System.out.println(""+listaGerente.get(i).nome);   
        //     System.out.println(""+listaGerente.get(i).area);
        //     System.out.println(""+listaGerente.get(i).matricula);  