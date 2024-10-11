import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame 
{
   // Array com as cores que serão usadas para mudar a cor do texto
   private final Color[] colorValues = 
      {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};   
   
   // Arrays para armazenar os itens de menu do tipo RadioButton (para cores e fontes)
   private final JRadioButtonMenuItem[] colorItems;
   private final JRadioButtonMenuItem[] fonts;

   // Arrays para armazenar os itens de menu do tipo CheckBox (para estilos de fonte como Negrito e Itálico)
   private final JCheckBoxMenuItem[] styleItems;

   // JLabel para exibir o texto que será formatado de acordo com as opções do menu
   private final JLabel displayJLabel;

   // Grupos de botões para garantir que apenas uma opção de fonte e uma de cor sejam selecionadas ao mesmo tempo
   private final ButtonGroup fontButtonGroup;
   private final ButtonGroup colorButtonGroup;

   // Variável para armazenar o estilo da fonte (por exemplo, Negrito, Itálico)
   private int style;

   public MenuFrame()
   {
      super("Using JMenus");  // Define o título da janela

      // Cria o menu "File" com um atalho de teclado ('F')
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic('F');

      // Cria o item "About..." no menu "File"
      JMenuItem aboutItem = new JMenuItem("About...");
      aboutItem.setMnemonic('A');  // Atalho 'A' para "About"
      fileMenu.add(aboutItem);

      // Adiciona um listener para exibir uma caixa de diálogo quando "About..." for selecionado
      aboutItem.addActionListener(
         new ActionListener()
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // Exibe uma caixa de diálogo simples explicando o propósito do programa
               JOptionPane.showMessageDialog(MenuFrame.this,
                  "This is an example\nof using menus",
                  "About", JOptionPane.PLAIN_MESSAGE);
            } 
         } 
      );

      // Cria o item "Exit" no menu "File"
      JMenuItem exitItem = new JMenuItem("Exit");
      exitItem.setMnemonic('x');  // Atalho 'x' para "Exit"
      fileMenu.add(exitItem);

      // Listener para fechar o programa quando "Exit" for selecionado
      exitItem.addActionListener(
         new ActionListener()
         {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);  // Sai do programa
            } 
         }
      );

      // Cria uma barra de menus e adiciona o menu "File"
      JMenuBar bar = new JMenuBar();
      setJMenuBar(bar);
      bar.add(fileMenu);

      // Cria o menu "Format" com um atalho de teclado ('r')
      JMenu formatMenu = new JMenu("Format");
      formatMenu.setMnemonic('r');

      // Array de nomes de cores que aparecerão no submenu de cores
      String[] colors = {"Black", "Blue", "Red", "Green"};

      // Cria o submenu "Color" dentro de "Format"
      JMenu colorMenu = new JMenu("Color");
      colorMenu.setMnemonic('C');  // Atalho 'C' para "Color"

      // Inicializa os RadioButtons para selecionar a cor
      colorItems = new JRadioButtonMenuItem[colors.length];
      colorButtonGroup = new ButtonGroup();  // Grupo para as cores, para permitir apenas uma seleção por vez
      ItemHandler itemHandler = new ItemHandler();  // Listener compartilhado para os itens de cor

      // Loop para criar os RadioButtons para cada cor, adicionar ao submenu e configurar o listener
      for (int count = 0; count < colors.length; count++) 
      {
         colorItems[count] = new JRadioButtonMenuItem(colors[count]);
         colorMenu.add(colorItems[count]);  // Adiciona o item de cor ao menu
         colorButtonGroup.add(colorItems[count]);  // Adiciona ao grupo de botões
         colorItems[count].addActionListener(itemHandler);  // Configura o listener
      }

      // Define a cor preta como a selecionada por padrão
      colorItems[0].setSelected(true);

      // Adiciona o submenu "Color" ao menu "Format"
      formatMenu.add(colorMenu);
      formatMenu.addSeparator();  // Adiciona um separador no menu "Format"

      // Array de nomes de fontes
      String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
      JMenu fontMenu = new JMenu("Font");  // Cria o submenu "Font"
      fontMenu.setMnemonic('n');  // Atalho 'n' para "Font"

      // Inicializa os RadioButtons para selecionar a fonte
      fonts = new JRadioButtonMenuItem[fontNames.length];
      fontButtonGroup = new ButtonGroup();  // Grupo para as fontes

      // Loop para criar os RadioButtons para cada fonte, adicionar ao submenu e configurar o listener
      for (int count = 0; count < fonts.length; count++) 
      {
         fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
         fontMenu.add(fonts[count]);  // Adiciona o item de fonte ao menu
         fontButtonGroup.add(fonts[count]);  // Adiciona ao grupo de botões
         fonts[count].addActionListener(itemHandler);  // Configura o listener
      } 

      // Define "Serif" como a fonte selecionada por padrão
      fonts[0].setSelected(true);
      fontMenu.addSeparator();  // Adiciona um separador no submenu de fontes

      // Array de estilos (Negrito, Itálico)
      String[] styleNames = {"Bold", "Italic"};
      styleItems = new JCheckBoxMenuItem[styleNames.length];  // Itens do tipo CheckBox para estilos de fonte
      StyleHandler styleHandler = new StyleHandler();  // Listener para os estilos

      // Loop para criar os CheckBoxes para cada estilo e adicionar ao submenu de fontes
      for (int count = 0; count < styleNames.length; count++) 
      {
         styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
         fontMenu.add(styleItems[count]);  // Adiciona o item de estilo ao menu
         styleItems[count].addItemListener(styleHandler);  // Configura o listener
      }

      // Adiciona o submenu de fontes ao menu "Format"
      formatMenu.add(fontMenu);
      bar.add(formatMenu);  // Adiciona o menu "Format" à barra de menus

      // Configura o JLabel que exibirá o texto com as formatações selecionadas
      displayJLabel = new JLabel("Sample Text", SwingConstants.CENTER);
      displayJLabel.setForeground(colorValues[0]);  // Cor inicial (preta)
      displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));  // Fonte inicial

      // Configura o fundo da janela e adiciona o JLabel ao centro da tela
      getContentPane().setBackground(Color.CYAN);
      add(displayJLabel, BorderLayout.CENTER);
   }

   // Classe interna para tratar as mudanças nos itens de menu (cor e fonte)
   private class ItemHandler implements ActionListener 
   {
      @Override
      public void actionPerformed(ActionEvent event)
      {
         // Verifica qual cor foi selecionada e atualiza a cor do texto
         for (int count = 0; count < colorItems.length; count++)
         {
            if (colorItems[count].isSelected()) 
            {
               displayJLabel.setForeground(colorValues[count]);
               break;
            } 
         } 

         // Verifica qual fonte foi selecionada e atualiza a fonte do texto
         for (int count = 0; count < fonts.length; count++)
         {
            if (event.getSource() == fonts[count]) 
            {
               displayJLabel.setFont(new Font(fonts[count].getText(), style, 72));
            }
         }

         repaint();  // Redesenha a janela para aplicar as mudanças
      } 
   }

   // Classe interna para tratar as mudanças nos estilos (Negrito, Itálico)
   private class StyleHandler implements ItemListener 
   {
      @Override
      public void itemStateChanged(ItemEvent e)
      {
         // Pega o nome atual da fonte
         String name = displayJLabel.getFont().getName();
         Font font;

         // Verifica quais estilos (negrito, itálico) estão selecionados e aplica
         if (styleItems[0].isSelected() && styleItems[1].isSelected())
            font = new Font(name, Font.BOLD + Font.ITALIC, 72);  // Negrito e Itálico
         else if (styleItems[0].isSelected())
            font = new Font(name, Font.BOLD, 72);  // Apenas Negrito
         else if (styleItems[1].isSelected())
            font = new Font(name, Font.ITALIC, 72);  // Apenas Itálico
         else
            font = new Font(name, Font.PLAIN, 72);  // Normal (sem estilo)

         displayJLabel.setFont(font);  // Atualiza a fonte no JLabel
         repaint();  // Redesenha a janela para aplicar as mudanças
      } 
   }
}
