//A linha abaixo importará o componente JFrame do módulo swing da biblioteca (pacote) javax
import javax.swing.JFrame;

//A linha abaixo está declarando a classe LabelTeste
public class LabelTest 

//A linha abaixo inicia o bloco de códigos da classe LabelTeste
{
   
   //A linha abaixo está declarando o método main (principal)
   public static void main(String[] args)
   //A linha abaixo inicia o bloco de códigos do método
   { 
      //A linha abaixo está declarando a variável LabelFrame, que é do tipo LabelFrame. 
      //Estamos criando uma variável do mesmo tipo do construtor, arquivo localizando na pasta raiz LabelFrame.java
      LabelFrame labelFrame = new LabelFrame(); 
      //A linha abaixo está declarando a invocação da "setDefaultCloseOperation" Definir a operação de fechamento padrão do parametros EXIT_ON_CLOSE (sair ao fechar) do componente JFrame.
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //A linha abaixo está definindo o tamanho da área do componente labelFrame com largura de 260 pixels e altura de 180 pixels;
      labelFrame.setSize(260, 180); 
      //A linha abaixo está exibindo o componente labelFrame com o comando serVisible true = verdadeiro / false = falso
      labelFrame.setVisible(true); 
   //A linha abaixo fecha o bloco de cógidos do método
   }
//A linha abaixo fecha o bloco de códigos da classe LabelTeste
}
