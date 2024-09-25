//Linha abaixo está importando a biblioteca (pacote) javax
//javax.swing.JFrame  >JFrame > Biblioteca/Pacote | swing > Módulo | javax > Componente
import javax.swing.JFrame;

//Declaração da classe TextFieldTeste que tem o mesmo nome do arquivo.
public class TextFieldTest
{//Inicio do bloco de códigos da classe TextFieldTest

   //Declaração do método Main que é o método principal (método executor).
   public static void main(String[] args)
   { //Inicio do bloco de código do método.
      TextFieldFrame textFieldFrame = new TextFieldFrame(); //Declaração da variável textFieldFrame com novo objeto que será declarado
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir operação de fechamento padrão na variável ScreemCase que está dentro da JFrame, e invocando a variável EXIT_ON_CLOSE.
      textFieldFrame.setSize(350, 100); //definição de tamanho, largura e altura em pixel
      textFieldFrame.setVisible(true); //
   } //fechamento do bloco de códigos do método
}//fechamento do bloco de códigos da classe