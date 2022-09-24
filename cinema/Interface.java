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
        int opcao=0, opcD=0,opcC=0, opcao2=0;        
        Scanner s = new Scanner(System.in);
        // Gerente gerente = new Gerente("Fularo de Tal", 0,"Desonhecida");
        ArrayList<filial> listaFilial = new ArrayList<filial>(); 
        ArrayList<pessoa> listaPessoa = new ArrayList<pessoa>();
        ArrayList<cliente> listaCliente = new ArrayList<cliente>();
        ArrayList<diretor> listaDiretor = new ArrayList<diretor>();        
        ArrayList<sessao> listaSessao = new ArrayList<sessao>();      
        
        
        do{
        System.out.println("Você eh cliente ou dono:\n1- Dono;\n2- Cliente");
            // dono - cadastrar filial, filmes;
        opcao = s.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite a a opcao desejada:\n1- Cadastrar uma filial;\n2- Cadastro filme\n3- Cadastro Sala;\n4- Cadastro Sessão;");
                opcD = s.nextInt();    
                switch (opcD) {
                    case 1:
                    filial f = new filial("Cinemark", "Salvador", "Bahia");
                    //Funcionario f = new Funcionario();
                    System.out.println("Informe o nome do Cinema:");
                    f.nome = s.next();
                    System.out.println("Informe a cidade:");
                    f.cidade=s.next();
                    System.out.println("Informe a estado:");
                    f.estado=s.next();
                    filial filial = new filial(f.nome, f.cidade, f.estado);
                     listaFilial.add(filial);
                        break;
                    // case 2:
                        
                    //     break;
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
        System.out.println("\n Deseja Continuar: 1-Sim, 2-Não");
        opcao2 = s.nextInt(); 
        }while(opcao2 ==1);
            for (int i = 0; i <listaFilial.size(); i++) {
                System.out.println(""+listaFilial.get(i).nome);   
                System.out.println(""+listaFilial.get(i).cidade);
                System.out.println(""+listaFilial.get(i).estado);
            }
    }


    
}
