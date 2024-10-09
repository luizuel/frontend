import javax.swing.*; 
// Importa todas as classes do pacote javax.swing, que são usadas para criar interfaces gráficas com o Swing.
// Swing é um conjunto de bibliotecas que fornecem componentes GUI (Graphical User Interface), como janelas, botões, listas, etc.

public class ListTest 
// Declaração da classe pública ListTest, que contém o método principal para executar o programa.
// O nome da classe deve corresponder ao nome do arquivo (ListTest.java).

{
   public static void main(String[] args) 
   // Método principal (main) é o ponto de entrada da aplicação.
// Ele é chamado automaticamente quando o programa é executado.
// O parâmetro "String[] args" permite que argumentos sejam passados pela linha de comando, mas não é obrigatório.

   {
      ListFrame listFrame = new ListFrame(); 
      // Cria uma nova instância da classe ListFrame.
// ListFrame é uma classe personalizada (não definida aqui, mas presumivelmente em outro arquivo), que estende JFrame.
// Ela configura os componentes da interface gráfica, como a lista de itens, e gerencia o comportamento da janela.

      listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      // Define o comportamento padrão de fechamento da janela.
// Quando o usuário clicar no botão "X" no canto superior da janela, o programa será encerrado.
// JFrame.EXIT_ON_CLOSE é uma constante que indica que o programa deve terminar completamente quando a janela for fechada.

      listFrame.setSize(350, 150); 
      // Define o tamanho da janela (JFrame) criada pela classe ListFrame.
// A largura da janela será 350 pixels e a altura será 150 pixels.
// Esse tamanho é definido de forma a comportar confortavelmente os componentes visuais que serão inseridos na janela.

      listFrame.setVisible(true); 
      // Torna a janela visível na tela.
// Por padrão, quando um JFrame é criado, ele não é exibido automaticamente.
// O método setVisible(true) garante que a janela seja exibida para o usuário.
   } 
}
