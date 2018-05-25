
/**
 * Escreva a descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
public class App
{
   ArrayList<Pessoa> pessoas=new ArrayList<Pessoa>();
   Scanner sc=new Scanner(System.in);
   
   public void Iniciar()
   {
       int opcao=0;
       do
       {       
           
           exibirMenu();
           opcao=sc.nextInt();
           sc.nextLine();
           switch(opcao)
           {
               case 2:
                    //cadastrarProfessor();
                    break;
               case 1:
                    cadastrarAluno();
                    break;
               case 3:
                    exibirPessoas();
                    break;
               case 8:
                    salvarDados();
                    break;
               case 0:
                    System.out.println("Saindo...");
                    break;
               default:
                    System.out.println("Opção inválida");
                    break;               
           }
           System.out.println("Pressione ENTER para continuar");
           sc.nextLine();
           
    }while(opcao!=0);
       
   }
   
   void salvarDados()
   {
       try
       {
       PrintWriter pw=new PrintWriter("c:\\teste\\arq.txt");
       for(int i=0;i<pessoas.size();i++)
       {
           pw.println(pessoas.get(i).getNome()+"\t"+pessoas.get(i).getCPF());
        }
       pw.flush();
       pw.close();
    }catch(IOException e)
    {
        System.out.println("Deu ruim");
    }
       
       
   }
   
   void exibirPessoas()
   {
       for(int i=0;i<pessoas.size();i++)
         System.out.println("Nome: "+pessoas.get(i).getNome()+
                            "\nCPF: "+pessoas.get(i).getCPF()+"\n");
       
       
    }
   
   void  cadastrarAluno()
   {
       String nome,cpf;
       System.out.print("Digite o nome do aluno: ");
       nome=sc.nextLine();
       System.out.print("Digite o CPF do aluno: ");
       cpf=sc.nextLine();
       //Pessoa aluno=new Aluno(nome,cpf);
       //pessoas.add(aluno);
       pessoas.add(new Aluno(nome,cpf));
    }
   void exibirMenu()
   {
       System.out.println("\u000C");
       System.out.println("1-Cadastrar aluno"+
                          "\n2-Cadastrar professor"+
                          "\n3-Exibir Pessoas"+
                          "\n8-Salvar dados"+
                          "\n0-Sair");
       
       
   }
}
