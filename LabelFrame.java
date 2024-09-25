import java.awt.FlowLayout; //importando java.awt.FlowLayout que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.JFrame; //importando javax.swing.JFrame que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.JLabel; //importando um componentejavax.swing.JLabel que é de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.SwingConstants; //importando javax.swing.SwingConstants que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.Icon; //importando javax.swing.Icon que é um componente de um móduto de uma biblioteca (pacote) Javax 
import javax.swing.ImageIcon; //importando javax.swing.ImageIcon que é um componente de um móduto de uma biblioteca (pacote) Javax 

// declaração da LabelFrame que está herdando o JFrame
public class LabelFrame extends JFrame 

{ //Iniciando o bloco de códigos da classe LabelFrame.

   //Declaração de variável.
   //"private" = variável privada setada apenas e exclusivamente para a classe declarada no caso "LabelFrame".
   //"final" = variável apenas de leitura.
   //"JLabel" = tipo.
   //"label1" = nome da variável.
   private final JLabel label1; //Declaração de variável.
   private final JLabel label2; //Declaração de variável.
   private final JLabel label3; //Declaração de variável.

   //contrutor / flexivel / variável.
   //Contrutor tem que ter o nome da classe e o mesmo nome do arquivo.
   //Construtor da classe LabelFrame. Este método é chamado quando um objeto LabelFrame é criado.
   public LabelFrame()
   
   {//Inicio do bloco de códigos do construtor.

      //Chama o construtor da superclasse (JFrame) e define o título da janela como "Testing JLabel".
      //"super" = vem de superior (parte superior da tela) declaração do titulo da janela.
      super("Testing JLabel");

      //Define o layout da janela como FlowLayout, que organiza os componentes na ordem em que são adicionados.
      //Define o desenho/layout (saída das camadas) herdada os métodos do JFrame, não se utiliza o ponto.
      setLayout(new FlowLayout()); 

      //"label1" está recebendo um novo objeto chamado JLabel que está recebendo o parâmetro de string/texto
      label1 = new JLabel("Label with text");

      //Na linha abaixo está invocanto uma ferramenta de dica de texto onde está recebendo o parâmetro de string/texto (ao passar o mouse encima ele apresenta o texto)
      //Quando coocar o mouse encima do elemento vai aparecer o texto.
      label1.setToolTipText("This is label1");

      //"add" = adicionar - está adicionando a label1 que foi definida acima na estrutura do construtor LabelFrame
      //Vai apresentar / imprimir / exibir
      add(label1);

      //Na linha abaixo está sendo declarado uma variável "bug".
      //novo objeto do tipo ImageIcon onde esta sendo enviado um parâmetro com métodos que vai pegar a classe "getClass" (coletar/pegar) LabelFrame / invocar o recurso bug1.png parametro com o nome do arquivo.
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      //label2 está recebendo um novo objeto do tipo JLabel. onde também está recebendo um separador de parâmetros, onde chama a variável bug do tipo icon. 
      label2 = new JLabel("Label with text and icon", bug,
      // com mais um separador de parâmetro, está sendo definido na linha abaixo SwingConstants = formatação/alinhamento onde está sendo invocado a variável LEFT ou seja alinhar a variável bug a esquerda.
         SwingConstants.LEFT);
      //Na linha abaixo está invocanto uma ferramenta de dica de texto onde está recebendo o parâmetro de string/texto (ao passar o mouse encima ele apresenta o texto)
      //Quando coocar o mouse encima do elemento vai aparecer o texto.
      label2.setToolTipText("This is label2");
      //"add" = adicionar - está adicionando a label1 que foi definida acima na estrutura do construtor LabelFrame
      //Vai apresentar / imprimir / exibir
      add(label2);

      //"label3" está recebendo um novo objeto chamado JLabel
      label3 = new JLabel(); 
      //"label3" está recebendo um novo objeto chamado JLabel que está recebendo o parâmetro de string/texto
      label3.setText("Label with icon and text at bottom");
      //está inserindo o icone com a variável bug / reutilizando o código da variável bug definida nos códigos acima
      label3.setIcon(bug); 
      //na linha abaixo está sendo definido a posição do texto no alinhamento horizontal, posição centro
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      //na linha abaixo está sendo definido a posição vertical do texto, ou seja enviando o texto para baixo para que o icone seja enviado para cima do texto
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      //Na linha abaixo está invocanto uma ferramenta de dica de texto onde está recebendo o parâmetro de string/texto (ao passar o mouse encima ele apresenta o texto)
      //Quando coocar o mouse encima do elemento vai aparecer o texto.
      label3.setToolTipText("This is label3");
      //"add" = adicionar - está adicionando a label1 que foi definida acima na estrutura do construtor LabelFrame
      //Vai apresentar / imprimir / exibir
      add(label3); 
   
   } //fechamento do bloco de códigos do construtor.
}//fechando o bloco de códigos da classe LabelFrame.

