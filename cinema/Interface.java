package cinema;

// package interface;

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
        int opcao=0, opcD=0,opcC=0, opcao2=0,opc;        
        Scanner s = new Scanner(System.in);
        // Gerente gerente = new Gerente("Fularo de Tal", 0,"Desonhecida");
        ArrayList<filial> listaFilial = new ArrayList<filial>(); 
        ArrayList<pessoa> listaPessoa = new ArrayList<pessoa>();
        ArrayList<cliente> listaCliente = new ArrayList<cliente>();
        ArrayList<diretor> listaDiretor = new ArrayList<diretor>();        
        ArrayList<sessao> listaSessao = new ArrayList<sessao>();      
        ArrayList<filme> listaFilme = new ArrayList<filme>();      
        
        
        do{
        System.out.println("1- Dono;\n2- Cliente\nVocê eh cliente ou dono:");
            // dono - cadastrar filial, filmes;
        opcao = s.nextInt();
        switch (opcao){
            case 1:
                System.out.println("\n1- Cadastrar uma filial;\n2- Cadastro filme\n3- Cadastro Sala;\n4- Cadastro Sessão;\nDigite a a opcao desejada:");
                opcD = s.nextInt();    
                switch (opcD) {
                    case 1:
                            filial f = new filial();
                            System.out.println("Informe o nome do Cinema:");
                            f.nome = s.next();
                            System.out.println("Informe a cidade:");
                            f.cidade=s.next();
                            System.out.println("Informe a estado:");
                            f.estado=s.next();
                            System.out.println("Informe o codigo:");
                            f.codigo=s.nextInt();
                            filial filial = new filial(f.nome, f.cidade, f.estado,f.codigo);
                            listaFilial.add(filial);
                            System.out.println("Cadastro efetuado com Sucesso!");
                        break;
                     case 2://classe filme ( titulo original, titulo traduzido, genero, atores, diretores, tamanho do filme, sinopse, nacionalidae, id)
                            filme fi = new filme();
                            System.out.println("\n1-Sim\n2-Não\nO filme é nacional?");
                            opc = s.nextInt();
                            System.out.println("Informe o titulo original do filme:");
                            fi.titulo_orig=s.next();
                            if(opc==2){
                                System.out.println("Informe o titulo traduzido do filme:");
                                fi.titulo_trad=s.next();
                            }
                            System.out.println("Informe o genero do filme:");
                            fi.genero=s.next();
                            System.out.println("Informe o tamanho do filme:");
                            fi.tam_filme=s.nextInt();
                            System.out.println("Informe a nacionalidade do filme:");
                            fi.nacionalidade=s.next();
                            System.out.println("Informe o codigo do filme:");
                            fi.Id=s.nextInt();
                            ator a = new ator();
                            do{ //classe ator ( nome, nacionalide, descrição(o que ele fez))
                                System.out.println("Informe o nome do ator:");
                                a.nome=s.next();
                                System.out.println("Informe a nacionalidade do ator:");
                                a.nacionalidade=s.next();
                                System.out.println("Informe a descricao do ator:");
                                a.descricao=s.next();
                                System.out.println("Informe o codigo do ator");
                                a.codigo = s.nextInt();
                                ator ator = new ator(a.nome, a.nacionalidade, a.descricao, a.codigo);
                                System.out.println("Deseja cadastra outro ator? (1-Sim)");
                                opc = s.nextInt();
                                
                            }while(opc!=2);
                            diretor d =new diretor();
                            do{ //classe diretor( nome, nacionalide, descrição( o que ele fez))
                                System.out.println("Informe o nome do Direto:");
                                d.nome=s.next();
                                System.out.println("Informe a nacionalidade do direto:");
                                d.nacionalidade=s.next();
                                System.out.println("Informe a descricao do diretor:");
                                d.descricao=s.next();
                                System.out.println("Informe o codigo do diretor");
                                d.codigo = s.nextInt();
                                ator ator = new ator(a.nome, a.nacionalidade, a.descricao, a.codigo);
                                System.out.println("Deseja cadastra outro diretor? (1-Sim)");
                                opc = s.nextInt();
                            }while(opc!=2);
                            filme filme = new filme(fi.titulo_orig);
                            listaFilme.add(filme);
                            System.out.println("Cadastro efetuado com Sucesso!");                    
                        break;
                    // case 3:
                        
                    //     break;
                    // case 4:
                        
                    //     break;
                }

                break;
            case 2:
                // System.out.println("Digite a a opção desejada:\n1- Comprar ingresso\n2- Mostrar lista de filmes\n3- Escolher filme e horario");
                // opcC = s.nextInt();
                // switch (key) {
                //     case value:
                        
                //         break;
                //     case value:
                        
                //         break;
                
                //     default:
                //         break;
                // }
                
                // break;  
        }
                            
            
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
        System.out.println("-------------------------------------");
        System.out.println("\nFinalizado!\n1-Sim\n2-Não\nDeseja Continuar:");
        opcao2 = s.nextInt(); 
        }while(opcao2 ==1);
            for (int i = 0; i <listaFilial.size(); i++) {
                System.out.println(""+listaFilial.get(i).nome);   
                System.out.println(""+listaFilial.get(i).cidade);
                System.out.println(""+listaFilial.get(i).estado);
            }
    }


    
}
