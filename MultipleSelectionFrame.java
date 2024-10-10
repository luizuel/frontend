import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A classe MultipleSelectionFrame demonstra o uso de múltiplas listas
 * de seleção e botões para copiar os itens selecionados de uma lista
 * para outra.
 */
public class MultipleSelectionFrame extends JFrame 
{
   // Listas para seleção de cores e frutas
   private final JList<String> colorJList;  // Lista de cores
   private final JList<String> copyJList;   // Lista onde as cores selecionadas serão copiadas
   private JButton copyJButton;             // Botão para copiar as cores selecionadas
   private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", 
      "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"}; // Nomes das cores

   // Listas para seleção de frutas
   private final JList<String> fruitJList;  // Lista de frutas
   private final JList<String> copyJList2;  // Lista onde as frutas selecionadas serão copiadas
   private JButton copyJButton2;            // Botão para copiar as frutas selecionadas
   private static final String[] fruitNames = {"Maçã", "Banana", "Cereja", "Tâmara", "Uva", 
      "Kiwi", "Limão", "Manga", "Laranja", "Pêssego", "Pera", "Abacaxi", "Melancia"}; // Nomes das frutas

   /**
    * Construtor da classe MultipleSelectionFrame.
    * Define o layout da janela e adiciona os componentes (listas e botões).
    */
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists"); // Define o título da janela
      setLayout(new FlowLayout());       // Define o layout como FlowLayout

      // Inicializa a lista de cores
      colorJList = new JList<String>(colorNames); 
      colorJList.setVisibleRowCount(5);  // Exibe 5 linhas de cada vez
      colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Permite seleção múltipla
      add(new JScrollPane(colorJList));  // Adiciona a lista com um scroll

      // Inicializa e adiciona o botão para copiar as cores selecionadas
      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(new ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent event)
         {
            // Copia os itens selecionados da lista de cores para a lista de cópia
            copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
         }
      });
      add(copyJButton);

      // Inicializa a lista onde as cores copiadas serão exibidas
      copyJList = new JList<String>();
      copyJList.setVisibleRowCount(5);
      copyJList.setFixedCellWidth(100);  // Define a largura das células
      copyJList.setFixedCellHeight(15);  // Define a altura das células
      copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); // Permite seleção simples
      add(new JScrollPane(copyJList));   // Adiciona a lista com um scroll

      // Inicializa a lista de frutas
      fruitJList = new JList<String>(fruitNames);
      fruitJList.setVisibleRowCount(5);  // Exibe 5 linhas de cada vez
      fruitJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Permite seleção múltipla
      add(new JScrollPane(fruitJList));  // Adiciona a lista com um scroll

      // Inicializa e adiciona o botão para copiar as frutas selecionadas
      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(new ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent event)
         {
            // Copia os itens selecionados da lista de frutas para a lista de cópia
            copyJList2.setListData(fruitJList.getSelectedValuesList().toArray(new String[0]));
         }
      });
      add(copyJButton2);

      // Inicializa a lista onde as frutas copiadas serão exibidas
      copyJList2 = new JList<String>();
      copyJList2.setVisibleRowCount(5);
      copyJList2.setFixedCellWidth(100);  // Define a largura das células
      copyJList2.setFixedCellHeight(15);  // Define a altura das células
      copyJList2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); // Permite seleção simples
      add(new JScrollPane(copyJList2));   // Adiciona a lista com um scroll
   } 
}
