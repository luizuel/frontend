//Importação da biblioteca javax
import javax.swing.JFrame;
//Declaração da classe ButtonTeste
public class ButtonTest 
{//Inicio do bloco de códigos da classe ButtonTest

   //Declaração do método executor main
   public static void main(String[] args)
   { //Inicio do bloco de código do método principal
      ButtonFrame buttonFrame = new ButtonFrame(); //Declaração da variável buttonframe do tipo burronframe cujo o valor vai ser atribuido um novo objeto burronframe
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Definição de operação de fechamento padrão
      buttonFrame.setSize(275, 110); //Definição de tamanho
      buttonFrame.setVisible(true); //Definição de visibilidade
   } 
} 