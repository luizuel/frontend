import javax.swing.JFrame;

public class MenuTest 
{
   public static void main(String[] args) 
   { 
      // Cria uma instância de MenuFrame, que é a janela principal do aplicativo.
      // MenuFrame provavelmente é uma subclasse de JFrame que contém componentes
      // gráficos, como menus suspensos, barra de ferramentas, etc.
      MenuFrame menuFrame = new MenuFrame(); 
      
      // Define o comportamento da janela quando o botão "Fechar" for clicado.
      // EXIT_ON_CLOSE garante que o programa será encerrado e os recursos liberados
      // corretamente ao fechar a janela.
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      
      // Define as dimensões da janela do aplicativo para 500 pixels de largura
      // e 200 pixels de altura. Este tamanho deve ser suficiente para acomodar
      // os menus e outros componentes visuais que o MenuFrame pode conter.
      menuFrame.setSize(500, 200); 
      
      // Torna a janela visível na tela. Inicialmente, quando um JFrame é criado,
      // ele está invisível por padrão. Esse método é essencial para que a janela
      // apareça para o usuário.
      menuFrame.setVisible(true); 
   } 
}
