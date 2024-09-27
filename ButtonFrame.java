import java.awt.FlowLayout; //Responsável pela apresentação do conteúdo do layout com responsivo
import java.awt.event.ActionListener;//Acionador de eventos ... exibir outras telas
import java.awt.event.ActionEvent;//Acionador de eventos, responsável por trazer a ação do usuário
import javax.swing.JFrame;//Responsável por fornecer toda a estrutura pronta da janela
import javax.swing.JButton;//Importando componente JButton 
import javax.swing.Icon;//Responsável pela estrutura do botão e configuração
import javax.swing.ImageIcon;//Responsável por carregar a imagem
import javax.swing.JOptionPane;//responsável por aparecer a mensagem ao clicar nos botões

//Declaração da classe ButtonFrame com herança do JFrame, inclui toda a estruta da janela.
public class ButtonFrame extends JFrame 
{//Abertura do bloco de código da classe ButtonFrame
   private final JButton plainJButton;//Declaração de variável privada de tipo JButton e somente leitura
   private final JButton fancyJButton;//Declaração de variável privada de tipo JButton e somente leitura

   //Declaração da classe contrutor
   public ButtonFrame()
   {//abertura do bloco de código do construtor
      super("Testing Buttons"); //definidor do titulo da janela
      setLayout(new FlowLayout()); //Aplicação do método para apresentação do conteúdo no layout conforme a seguencia das camadas

      plainJButton = new JButton("Plain Button");//Atribuindo um novo JButton e definindo o nome do botão
      add(plainJButton);//Adicionando ele na renderização dos elementos visuais

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));//Declaração da variável BUG1 do tipo ICON e aplicando um parâmetro  GETCLASS (coleta a classe na qual o IMAGEICON está inserido) e invocando o recurso que seria a imagem do icone
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));//Declaração da variável BUG2 do tipo ICON e aplicando um parâmetro  GETCLASS (coleta a classe na qual o IMAGEICON está inserido) e invocando o recurso que seria a imagem do icone
      fancyJButton = new JButton("Fancy Button", bug1);//Atribuindo um novo  JButton e aplicando um texto, junto com a variável que seria a imagem declarada anteriormente
      fancyJButton.setRolloverIcon(bug2);//Atribuindo uma interação com a função setRolloverIcon com a variavel bug2 que é o segundo icon, criando um efeito de ao clicar muda a imagem
      add(fancyJButton);//Adicionando na renderização dos elementos visuais

      //Definindo variável de manipulação, ou seja que via executar a operação conforme a ação do usuário
      ButtonHandler handler = new ButtonHandler();
      fancyJButton.addActionListener(handler);//
      plainJButton.addActionListener(handler);//
   }//Fechamento do bloco de código do construtor

   //Declaração da classe ButtonHandler privativa que está injetando o componente actionlistener que é uma classe
   private class ButtonHandler implements ActionListener 
   {//Inicio do bloco de códigos da classe ButtonHandler

      @Override //em ingles é o sobrescreva e o @ é para evitar notificações de alerta referene a ação.
      public void actionPerformed(ActionEvent event)//Declaração da classe AcctionEvent
      {//abertura do bloco de códigos da classe ActionEvent
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(//Exibir diálogo de mensagem, inserindo parâmentros da classe ButtonFrame com o formato String (escrita)
            "You pressed: %s", event.getActionCommand()));//exibe mensagem formatada de texto que está no proprio objeto
      }//Fechamento do bloco de códigos da classe ActionEvent
   } //Fechamento do bloco de códigos da classe ButtonHandle
}//Fechamento do bloco de códigos da classe ButtonFrame
