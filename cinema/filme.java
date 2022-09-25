/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema;

import java.util.ArrayList;
import java.util.Scanner;

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
		this.Id = id;
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

	// public void cadastro_filme(){
	// 	int opc;
	// 	Scanner s = new Scanner(System.in);
	// 	filme fi = new filme();
	// 	System.out.print("\n1-Sim\n2-Não\nO filme é nacional?");
	// 	opc = s.nextInt();
	// 	System.out.print("Informe o titulo original do filme: ");
	// 	fi.titulo_orig=s.next();
	// 	if(opc==2){
	// 		System.out.print("Informe o titulo traduzido do filme: ");
	// 		fi.titulo_trad=s.next();
	// 	}
	// 	System.out.print("Informe o genero do filme: ");
	// 	fi.genero=s.next();
	// 	System.out.print("Informe o tamanho do filme: ");
	// 	fi.tam_filme=s.nextFloat();
	// 	System.out.print("Informe a nacionalidade do filme: ");
	// 	fi.nacionalidade=s.next();
	// 	System.out.print("Informe o codigo do filme: ");
	// 	fi.Id=s.nextInt();
	// 	ator a = new ator();
	// 	do{ //classe ator ( nome, nacionalide, descrição(o que ele fez))
	// 		System.out.print("Informe o nome do ator: ");
	// 		a.nome=s.next();
	// 		System.out.print("Informe a nacionalidade do ator: ");
	// 		a.nacionalidade=s.next();
	// 		System.out.print("Informe o endereco do ator: ");
	// 		a.endereco=s.next();
	// 		System.out.print("Informe a descricao do ator: ");
	// 		a.descricao=s.next();
	// 		System.out.print("Informe o codigo do ator: ");
	// 		a.codigo = s.nextInt();
	// 		if(a.nacionalidade == "brasileira"){
	// 			System.out.print("Informe o cpf do ator: ");
	// 			a.CPF = s.nextInt();
	// 		}
	// 		ator ator = new ator(a.nome, a.nacionalidade, a.descricao, a.codigo);
	// 		System.out.println("Deseja cadastra outro ator? (1-Sim 2 -Nao)");
	// 		opc = s.nextInt();
	// 		listaAtores.add(ator);
	// 	}while(opc!=2);
	// 	diretor d =new diretor();
	// 	do{ //classe diretor( nome, nacionalide, descrição( o que ele fez))
	// 		System.out.print("Informe o nome do Diretor: ");
	// 		d.nome=s.next();
	// 		System.out.print("Informe a nacionalidade do diretor: ");
	// 		d.nacionalidade=s.next();
	// 		System.out.print("Informe a descricao do diretor: ");
	// 		d.descricao=s.next();
	// 		System.out.print("Informe o endereco do ator: ");
	// 		d.endereco=s.next();
	// 		System.out.print("Informe o codigo do diretor: ");
	// 		d.codigo = s.nextInt();
	// 		diretor diretor = new diretor(d.nome, d.nacionalidade, d.descricao, d.codigo);
	// 		System.out.print("Deseja cadastra outro diretor? (1-Sim 2 -Nao)");
	// 		opc = s.nextInt();
	// 		listaDiretores.add(diretor);
	// 	}while(opc!=2);
	// 	//filme(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores)
	// 	filme filme = new filme(fi.titulo_orig,fi.titulo_trad,fi.genero,fi.sinopse,fi.nacionalidade,fi.tam_filme,fi.Id,listaAtores,listaDiretores);
	// 	listaFilme.add(filme);
	// 	System.out.println("Cadastro efetuado com Sucesso!"); 
	// 	}

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