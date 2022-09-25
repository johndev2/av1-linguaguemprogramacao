package cinema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import cinema.filme;
import cinema.pessoa;
import cinema.filial;

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


public class Interface {    
    public static void main(String [] args){
        int opcao=0, opcD=0,opcC=0, opcao2=0,opc, cliente_escolha;
        Boolean cursor;        
        Scanner s = new Scanner(System.in);
        // Gerente gerente = new Gerente("Fularo de Tal", 0,"Desonhecida");
        ArrayList<filial> listaFilial = new ArrayList<filial>(); 
        ArrayList<pessoa> listaPessoa = new ArrayList<pessoa>();
        ArrayList<cliente> listaCliente = new ArrayList<cliente>();
        ArrayList<diretor> listaDiretores = new ArrayList<diretor>();        
        ArrayList<ator> listaAtores = new ArrayList<ator>();        
        ArrayList<sessao> listaSessao = new ArrayList<sessao>();      
        ArrayList<sala> listaSala = new ArrayList<sala>();      
        ArrayList<filme> listaFilme = new ArrayList<filme>();      
        do{
        System.out.print("------------------------\n1- Dono;\n2- Cliente\nVocê eh cliente ou dono: ");
            // dono - cadastrar filial, filmes;
        opcao = s.nextInt();
        switch (opcao){
            case 1:
                System.out.print("--------------------------\n1- Cadastrar uma filial;\n2- Cadastro filme\n3- Cadastro Sala;\n4- Cadastro Sessão;\nDigite a a opcao desejada:");
                opcD = s.nextInt();    
                switch (opcD) {
                    case 1:
                            filial f = new filial();
                            System.out.print("Informe o nome do Cinema: ");
                            f.nome = s.next();
                            System.out.print("Informe a cidade: ");
                            f.cidade=s.next();
                            System.out.print("Informe a estado: ");
                            f.estado=s.next();
                            System.out.print("Informe o codigo: ");
                            f.codigo=s.nextInt();
                            filial filial = new filial(f.nome, f.cidade, f.estado,f.codigo);
                            listaFilial.add(filial);
                            System.out.println("Cadastro efetuado com Sucesso!");
                        break;
                     case 2://classe filme ( titulo original, titulo traduzido, genero, atores, diretores, tamanho do filme, sinopse, nacionalidae, id)
                            filme fi = new filme();
                            System.out.print("\n1-Sim\n2-Não\nO filme é nacional?");
                            opc = s.nextInt();
                            System.out.print("Informe o titulo original do filme: ");
                            fi.titulo_orig=s.next();
                            if(opc==2){
                                System.out.print("Informe o titulo traduzido do filme: ");
                                fi.titulo_trad=s.next();
                            }
                            System.out.print("Informe o genero do filme: ");
                            fi.genero=s.next();
                            System.out.print("Informe o tamanho do filme: ");
                            fi.tam_filme=s.nextFloat();
                            System.out.print("Informe a nacionalidade do filme: ");
                            fi.nacionalidade=s.next();
                            System.out.print("Informe o codigo do filme: ");
                            fi.Id=s.nextInt();
                            ator a = new ator();
                            do{ //classe ator ( nome, nacionalide, descrição(o que ele fez))
                                System.out.print("Informe o nome do ator: ");
                                a.nome=s.next();
                                System.out.print("Informe a nacionalidade do ator: ");
                                a.nacionalidade=s.next();
                                System.out.print("Informe o endereco do ator: ");
                                a.endereco=s.next();
                                System.out.print("Informe a descricao do ator: ");
                                a.descricao=s.next();
                                System.out.print("Informe o codigo do ator: ");
                                a.codigo = s.nextInt();
                                if(a.nacionalidade == "brasileira"){
                                    System.out.print("Informe o cpf do ator: ");
                                    a.CPF = s.nextInt();
                                }
                                ator ator = new ator(a.nome, a.nacionalidade, a.descricao, a.codigo);
                                System.out.println("Deseja cadastra outro ator? (1-Sim 2 -Nao)");
                                opc = s.nextInt();
                                listaAtores.add(ator);
                            }while(opc!=2);
                            diretor d =new diretor();
                            do{ //classe diretor( nome, nacionalide, descrição( o que ele fez))
                                System.out.print("Informe o nome do Diretor: ");
                                d.nome=s.next();
                                System.out.print("Informe a nacionalidade do diretor: ");
                                d.nacionalidade=s.next();
                                System.out.print("Informe a descricao do diretor: ");
                                d.descricao=s.next();
                                System.out.print("Informe o endereco do ator: ");
                                d.endereco=s.next();
                                System.out.print("Informe o codigo do diretor: ");
                                d.codigo = s.nextInt();
                                diretor diretor = new diretor(d.nome, d.nacionalidade, d.descricao, d.codigo);
                                System.out.print("Deseja cadastra outro diretor? (1-Sim 2 -Nao)");
                                opc = s.nextInt();
                                listaDiretores.add(diretor);
                            }while(opc!=2);
                            //filme(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores)
                            filme filme = new filme(fi.titulo_orig,fi.titulo_trad,fi.genero,fi.sinopse,fi.nacionalidade,fi.tam_filme,fi.Id,listaAtores,listaDiretores);
                            listaFilme.add(filme);
                            System.out.println("Cadastro efetuado com Sucesso!");                    
                        break;
                    case 3:
                            do{
                                sala sa = new sala();
                                filme fs = new filme();
                                System.out.println("--------------------\nCadastro de Sala!");
                                System.out.print("Informe o codigo da sala: ");
                                sa.idSala = s.nextInt();
                                System.out.print("Informe o nome da sala: ");
                                sa.nomeSala = s.next();
                                System.out.print("Informe a capacidade da sala: ");
                                sa.capacidade = s.nextInt();
                                System.out.print("Informe o codigo do filme: ");
                                fs.Id = s.nextInt();
                                int x=0;
                                for(int t=0;t<listaFilme.size();t++){
                                    if(listaFilme.get(t).Id == fs.Id){
                                        fs.titulo_orig = listaFilme.get(t).titulo_orig;
                                        fs.titulo_trad = listaFilme.get(t).titulo_trad;
                                        fs.genero = listaFilme.get(t).genero;
                                        fs.nacionalidade = listaFilme.get(t).nacionalidade;
                                        fs.tam_filme = listaFilme.get(t).tam_filme;
                                        fs.sinopse = listaFilme.get(t).sinopse;
                                        fs.atores = listaFilme.get(t).atores;
                                        fs.diretores = listaFilme.get(t).diretores;
                                        break;
                                    }
                                    x=t+1;
                                    if(x>= listaFilme.size()){
                                        System.out.println("Filme nao cadastrado");
                                    } 
                                }
                                sala sala = new sala(fs.titulo_orig, fs.titulo_trad, fs.genero, fs.sinopse, fs.nacionalidade, fs.tam_filme, fs.Id, fs.atores, fs.diretores, sa.idSala, sa.nomeSala, sa.capacidade);
                                listaSala.add(sala);
                                System.out.print("Deseja cadastra outra sala? (1-Sim 2 -Nao)");
                                opc = s.nextInt();                              
                            }while(opc!=2);
                                System.out.println( "nome: "+ listaSala.get(0).nomeSala+ " filme: "+ listaSala.get(0).titulo_orig);
                        break;
                    case 4:
                            sessao st = new sessao();
                            do{
                                System.out.println("---------------------------\nCadastro Sessão!");
                                System.out.print("Informe o codigo da sala: ");
                                st.idSa = s.nextInt();
                                System.out.print("Informe o horario da sessao: ");
                                st.horario= s.next();
                                for(int t=0;t<listaSala.size();t++){
                                    if(listaSala.get(t).Id == st.idSa){
                                        st.titulo_orig = listaSala.get(t).titulo_orig;
                                        st.titulo_trad = listaSala.get(t).titulo_trad;
                                        st.genero = listaSala.get(t).genero;
                                        st.sinopse = listaSala.get(t).sinopse;
                                        st.nacionalidade = listaSala.get(t).nacionalidade;
                                        st.tam_filme = listaSala.get(t).tam_filme;
                                        st.idSala = listaSala.get(t).idSala;
                                        st.atores = listaSala.get(t).atores;
                                        st.diretores = listaSala.get(t).diretores;
                                        st.nomeSala = listaSala.get(t).nomeSala;
                                        st.capacidade = listaSala.get(t).capacidade;
                                        break;
                                    }
                                    int x=t+1;
                                    if(x>= listaSessao.size()){
                                        System.out.println("Sessao nao cadastrada");
                                    } 
                                }
                                sessao sessao = new sessao(st.titulo_orig, st.titulo_trad, st.genero, st.sinopse, st.nacionalidade, st.tam_filme, st.idSala, st.atores, st.diretores, st.idSala, st.nomeSala, st.capacidade, st.horario, st.idSa);
                                listaSessao.add(sessao);
                                System.out.print("Deseja cadastra outra sala? (1-Sim 2 -Nao)");
                                opc = s.nextInt();
                            }while(opc!=2);
                        break;
                     }

                break;
            case 2:
                System.out.print("----------------------------\n1- Comprar ingresso\n2- Mostrar lista de filmes\n3- Listar sessoes\nDigite a a opção desejada:");
                opcC = s.nextInt();
                switch (opcC) {
                    case 1:
                            System.out.print("Informe o codigo do filme que deseja: ");
                            cliente_escolha = s.nextInt();
                            int i=0;
                            while(cursor = true){
                                if(listaFilme.get(i).Id == cliente_escolha) cursor = false;
                                i++;
                            }
                        break;
                    case 2://filme(String titulo_orig, String titulo_trad, String genero, String sinopse, String nacionalidade,float tam_filme, int id, ArrayList<ator> atores, ArrayList<diretor> diretores)
                            System.out.println("");
                            for( i = 0; i< listaFilme.size();i++){
                                System.out.println(listaFilme.get(i).Id+" | "+listaFilme.get(i).titulo_orig+" | "+listaFilme.get(i).titulo_trad+" | "+listaFilme.get(i).nacionalidade+" | "+listaFilme.get(i).tam_filme+ " | "+listaFilme.get(i).genero+" | "+listaFilme.get(i).sinopse+" | ");
                                System.out.print("Atores: ");
                                listaFilme.get(i).exibirAtores();
                                System.out.print("Diretores: ");
                                listaFilme.get(i).exibirDiretores();
                            }                       
                        break;               
                    case 3:
                        System.out.println("");
                        System.out.println("Nº sala| Titulo filme | Horario |");
                        for( i = 0; i< listaSessao.size();i++){
                            System.out.println(listaSessao.get(i).nomeSala+ " | "+listaSessao.get(i).titulo_orig+ " | "+listaSessao.get(i).horario);                        
                        }
                        break;
                }
                
                break;  
        }
                            
        System.out.println("-------------------------------------");
        System.out.print("\nFinalizado!\n1-Sim\n2-Não\nDeseja Continuar: ");
        opcao2 = s.nextInt(); 
        }while(opcao2 ==1);
            for (int i = 0; i <listaFilial.size(); i++) {
                System.out.println(""+listaFilial.get(i).nome);   
                System.out.println(""+listaFilial.get(i).cidade);
                System.out.println(""+listaFilial.get(i).estado);
            }
    }


    
}
