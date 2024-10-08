// Importa as classes necessárias para layout, fontes, manipulação de eventos e componentes GUI do Swing.
import java.awt.FlowLayout; // Para organizar os componentes dentro do JFrame.
import java.awt.Font; // Para trabalhar com diferentes fontes no texto.
import java.awt.event.ItemListener; // Interface para ouvir eventos de seleção.
import java.awt.event.ItemEvent; // Classe que define os eventos de item, como seleção e deseleção de botões de rádio.
import javax.swing.JFrame; // Cria a janela da aplicação.
import javax.swing.JTextField; // Campo de texto onde o estilo da fonte vai mudar.
import javax.swing.JRadioButton; // Botões de rádio para selecionar diferentes estilos de fonte.
import javax.swing.ButtonGroup; // Agrupa os botões de rádio, permitindo selecionar apenas um por vez.

public class RadioButtonFrame extends JFrame 
// Declara a classe RadioButtonFrame que herda de JFrame, permitindo criar a interface gráfica.
{
   // Declaração dos componentes e fontes que serão utilizados.
   private JTextField textField; // Campo de texto que exibirá o texto com o estilo de fonte selecionado.
   private Font plainFont; // Fonte padrão (sem negrito ou itálico).
   private Font boldFont; // Fonte em negrito.
   private Font italicFont; // Fonte em itálico.
   private Font boldItalicFont; // Fonte em negrito e itálico ao mesmo tempo.
   private JRadioButton plainJRadioButton; // Botão de rádio para o estilo de fonte simples.
   private JRadioButton boldJRadioButton; // Botão de rádio para o estilo de fonte em negrito.
   private JRadioButton italicJRadioButton; // Botão de rádio para o estilo de fonte em itálico.
   private JRadioButton boldItalicJRadioButton; // Botão de rádio para o estilo de fonte em negrito e itálico.
   private ButtonGroup radioGroup; // Agrupa os botões de rádio para garantir que apenas um seja selecionado de cada vez.

   // Construtor da classe RadioButtonFrame que configura a interface.
   public RadioButtonFrame()
   {
      // Chama o construtor da superclasse JFrame e define o título da janela.
      super("RadioButton Test");
      // Define o layout da janela como FlowLayout, que organiza os componentes em linha.
      setLayout(new FlowLayout()); 

      // Inicializa o JTextField com um texto padrão e um número máximo de 25 colunas.
      textField = new JTextField("Watch the font style change", 25);
      // Adiciona o campo de texto à janela.
      add(textField); 

      // Inicializa os botões de rádio com os respectivos textos e define o botão "Plain" como selecionado por padrão.
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);

      // Adiciona os botões de rádio à janela.
      add(plainJRadioButton); 
      add(boldJRadioButton); 
      add(italicJRadioButton); 
      add(boldItalicJRadioButton); 

      // Cria um ButtonGroup e adiciona os botões de rádio, permitindo que apenas um seja selecionado por vez.
      radioGroup = new ButtonGroup(); 
      radioGroup.add(plainJRadioButton); 
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton);
      radioGroup.add(boldItalicJRadioButton); 

      // Inicializa os diferentes estilos de fonte.
      plainFont = new Font("Serif", Font.PLAIN, 14); // Fonte simples.
      boldFont = new Font("Serif", Font.BOLD, 14); // Fonte em negrito.
      italicFont = new Font("Serif", Font.ITALIC, 14); // Fonte em itálico.
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14); // Fonte em negrito e itálico.

      // Define o estilo de fonte padrão (simples) para o campo de texto.
      textField.setFont(plainFont);

      // Associa um ouvinte de eventos para cada botão de rádio que muda a fonte do JTextField conforme o botão selecionado.
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont)); // Ouvinte para o botão de fonte simples.
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont)); // Ouvinte para o botão de fonte negrito.
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont)); // Ouvinte para o botão de fonte itálico.
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont)); // Ouvinte para o botão de fonte negrito e itálico.
   } 

   // Classe interna que implementa ItemListener para tratar as mudanças de estado dos botões de rádio.
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // Fonte a ser aplicada ao campo de texto.

      // Construtor que recebe uma fonte como argumento e a armazena na variável local.
      public RadioButtonHandler(Font f)
      {
         font = f; // Atribui a fonte recebida ao atributo da classe.
      } 
   
      // Método que é chamado quando o estado de um item muda (quando um botão de rádio é selecionado ou desmarcado).
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         // Define a nova fonte do JTextField com base no botão de rádio selecionado.
         textField.setFont(font); 
      } 
   } 
}
