import javax.swing.JFrame; 
// Importa a classe JFrame, que é usada para criar uma janela (frame) na interface gráfica.

public class RadioButtonTest  
// Declara a classe pública RadioButtonTest, que contém o método principal para executar o programa.

{
   public static void main(String[] args) 
   // O método main é o ponto de entrada da execução do programa.

   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); 
      // Cria um objeto da classe RadioButtonFrame, que estende JFrame e contém a lógica dos botões de rádio (RadioButtons).

      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      // Define a operação de fechamento da janela. Ao clicar no botão de fechar (X), o programa será encerrado.

      radioButtonFrame.setSize(300, 100); 
      // Define o tamanho da janela (JFrame), com 300 pixels de largura e 100 pixels de altura.

      radioButtonFrame.setVisible(true); 
      // Torna a janela visível. Sem essa linha, o frame não apareceria na tela.
   } 
}
