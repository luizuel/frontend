// Importa todas as classes do pacote java.awt, que contém componentes gráficos e eventos para criar interfaces gráficas.
import java.awt.*;

// Importa todas as classes do pacote java.awt.event, que permite manipular eventos de interface gráfica, como ações do usuário.
import java.awt.event.*;

// Importa todas as classes do pacote javax.swing, que fornece componentes GUI como JFrame, JComboBox, JLabel, etc.
import javax.swing.*;

// Declara a classe pública ComboBoxFrame que estende JFrame, criando assim uma janela GUI personalizada.
public class ComboBoxFrame extends JFrame 

{
   // Declara uma JComboBox de Strings chamada imagesJComboBox; será usada para exibir uma lista de opções para o usuário.
   private final JComboBox<String> imagesJComboBox; 

   // Declara um JLabel chamado label; será usado para exibir imagens correspondentes à opção selecionada na JComboBox.
   private final JLabel label;

   // Declara um array estático final de Strings chamado names, que contém os nomes dos arquivos de imagem a serem usados.
   private static final String[] names = 
      {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};

   // Declara um array final de Icons chamado icons; carrega as imagens correspondentes aos nomes no array names.
   private final Icon[] icons = { 
      // Carrega a imagem "bug1.gif" como um ImageIcon.
      new ImageIcon(getClass().getResource(names[0])),
      // Carrega a imagem "bug2.gif" como um ImageIcon.
      new ImageIcon(getClass().getResource(names[1])), 
      // Carrega a imagem "travelbug.gif" como um ImageIcon.
      new ImageIcon(getClass().getResource(names[2])),
      // Carrega a imagem "buganim.gif" como um ImageIcon.
      new ImageIcon(getClass().getResource(names[3]))
   };

   // Construtor da classe ComboBoxFrame; inicializa a interface gráfica e seus componentes.
   public ComboBoxFrame()
   {
      // Chama o construtor da superclasse JFrame e define o título da janela como "Testing JComboBox".
      super("Testing JComboBox");

      // Define o layout da janela como FlowLayout, que organiza os componentes na ordem em que são adicionados.
      setLayout(new FlowLayout());

      // Inicializa a JComboBox com o array de nomes; cada item da lista será um dos nomes de imagem.
      imagesJComboBox = new JComboBox<String>(names);

      // Define o número máximo de linhas visíveis na lista suspensa para 3.
      imagesJComboBox.setMaximumRowCount(5); 

      // Adiciona um ItemListener à JComboBox para responder a eventos de seleção de item.
      imagesJComboBox.addItemListener(
         // Cria uma nova classe anônima que implementa ItemListener.
         new ItemListener()
         {
            // Sobrescreve o método itemStateChanged para definir ações quando o estado de um item muda.
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // Verifica se o evento é de seleção (e não de deseleção).
               if (event.getStateChange() == ItemEvent.SELECTED)
                  // Define o ícone do label para o ícone correspondente ao item selecionado na JComboBox.
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         }
      );

      // Adiciona a JComboBox ao JFrame para que seja exibida na interface.
      add(imagesJComboBox);

      // Inicializa o JLabel com o primeiro ícone do array icons, exibindo a primeira imagem por padrão.
      label = new JLabel(icons[0]);

      // Adiciona o JLabel ao JFrame para que a imagem seja exibida na interface.
      add(label);
   }
}
