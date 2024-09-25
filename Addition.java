// Na linha abaixo está importando a biblioteca (pacote) javax, o módulo swing e o componente JOptionPane
import javax.swing.JOptionPane; 

//Na linha abaixo está sendo declarada a classe Addtion
public class Addition 

//Na linha abaixo está sendo aberto o bloco de códigos da classe Addition
{
//Na linha abaixo está sendo declarado o método "main" (principal) que vai executar a aplicação 
   public static void main(String[] args)
   //Na linha abaixo está sendo aberto o bloco "main" (principal)
   {
      // Na linha abaixo está sendo declarado a variável do tipo String com o firstNumber, que pode ser identificado devido a aplicação de operador de atribuição "="
      //Onde tem operador de atribuição "=" tem variável
      String firstNumber = 
      //Na linha abaixo com o componente JOptionPane está sendo invocado para mostrar a mensagem "Enter first integer" que é o diálogo de entrada
      // Exibe uma caixa de diálogo pedindo ao usuário para inserir o primeiro número inteiro.
      // O número inserido é retornado como uma string e armazenado na variável firstNumber.   
      JOptionPane.showInputDialog("Entre com o primeiro número inteiro");
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");

      // Converte a string firstNumber para um número inteiro e armazena o resultado em number1.
      int number1 = Integer.parseInt(firstNumber); 
      // Converte a string secondNumber para um número inteiro e armazena o resultado em number2.
      int number2 = Integer.parseInt(secondNumber);
      // Soma os dois números inteiros armazenados em number1 e number2 e salva o resultado na variável sum.
      int sum = number1 + number2; 

      // Exibe uma caixa de diálogo mostrando a soma dos dois números inteiros.
      // O primeiro argumento (null) indica que a caixa de diálogo não está vinculada a nenhuma janela específica.
      // O segundo argumento é a mensagem que será exibida, neste caso, o texto "The sum is" seguido do valor da soma.
      // O terceiro argumento define o título da caixa de diálogo como "Sum of Two Integers".
      // O quarto argumento (JOptionPane.PLAIN_MESSAGE) indica que a caixa de diálogo será exibida sem ícones.
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} // Fechamento do bloco da classe Addition
