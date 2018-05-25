
/**
 * Classe abstrata Pessoa - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Pessoa
{
   private String Nome,CPF;
   public Pessoa(String nm,String cpf)
   {
       Nome=nm;
       CPF= cpf;       
   }
   
   public String getNome()
   {
       return Nome;
   }
   public String getCPF()
   {
       return CPF;
   }
   
   
}
