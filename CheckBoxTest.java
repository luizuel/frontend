import javax.swing.JFrame; 
// Importa a classe JFrame, que fornece a estrutura para uma janela gráfica básica.

public class CheckBoxTest 
// Define a classe pública CheckBoxTest, que contém o método principal para executar o programa.

{
   public static void main(String[] args) 
   // Define o método main, que é o ponto de partida da execução do programa.

   { 
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
      // Cria um objeto do tipo CheckBoxFrame. Este é o frame personalizado (que herda de JFrame) 
      // e contém as caixas de seleção (checkboxes) que vão interagir com o campo de texto.

      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      // Define a operação padrão de fechamento da janela. 
      // Quando o usuário clicar no botão "fechar" (X), o programa será encerrado.

      checkBoxFrame.setSize(275, 100); 
      // Define o tamanho da janela como 275 pixels de largura e 100 pixels de altura.

      checkBoxFrame.setVisible(true); 
      // Torna a janela visível na tela. Sem essa linha, o frame não será exibido.
   } 
}
