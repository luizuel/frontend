import javax.swing.*; // Importa a biblioteca Swing, necessária para criar a interface gráfica no Java

public class MultipleSelectionTest 
// Declara a classe pública `MultipleSelectionTest` que conterá o método `main`, ponto de entrada do programa.
{
   public static void main(String[] args)
   // O método `main` é o ponto de partida para a execução do programa. É onde o programa começa a rodar.
   { 
      // Cria uma instância da classe `MultipleSelectionFrame`.
      // Isso inicializa a janela com todos os componentes definidos no construtor de `MultipleSelectionFrame`.
      MultipleSelectionFrame multipleSelectionFrame =
         new MultipleSelectionFrame(); 

      // Define a operação padrão de fechamento da janela.
      // `EXIT_ON_CLOSE` significa que o programa será encerrado quando a janela for fechada.
      multipleSelectionFrame.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);

      // Define o tamanho da janela. O tamanho aqui é de 350 pixels de largura por 150 pixels de altura.
      multipleSelectionFrame.setSize(350, 300); 

      // Torna a janela visível. 
      // `setVisible(true)` faz com que a janela criada seja exibida na tela.
      multipleSelectionFrame.setVisible(true); 
   } 
}
