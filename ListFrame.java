import java.awt.*; 
import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.event.*; // Importa o pacote para tratar eventos de ação.

public class ListFrame extends JFrame {
   private final JList<String> colorJList; 
   private static final String[] colorNames = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", 
      "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
   private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, 
      Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};

   // Adicionando um JComboBox para as resoluções
   private final JComboBox<String> resolutionComboBox;
   private static final String[] resolutions = {"Small", "Medium", "Big"};

   public ListFrame() {
      super("List Test");
      setLayout(new FlowLayout());

      // Inicializa a lista de cores
      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5);
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      add(new JScrollPane(colorJList));

      // Adiciona o listener de seleção da lista de cores
      colorJList.addListSelectionListener(
         new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
               getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
            } 
         } 
      );

      // Inicializa o JComboBox para as resoluções
      resolutionComboBox = new JComboBox<>(resolutions);
      add(resolutionComboBox); // Adiciona o JComboBox à janela

      // Adiciona um listener para mudar o tamanho da janela ao selecionar uma resolução
      resolutionComboBox.addActionListener(
         new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               String selectedResolution = (String) resolutionComboBox.getSelectedItem();
               switch (selectedResolution) {
                  case "Small":
                     setSize(350, 150);
                     break;
                  case "Medium":
                     setSize(800, 600);
                     break;
                  case "Big":
                     setSize(1920, 1080);
                     break;
               }
            }
         }
      );

      // Definindo o tamanho inicial da janela
      setSize(350, 150);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      ListFrame listFrame = new ListFrame();
      listFrame.setVisible(true);
   }
}
