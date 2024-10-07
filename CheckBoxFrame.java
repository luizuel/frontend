import java.awt.FlowLayout; 
// Importa a classe FlowLayout, que define o layout dos componentes no contêiner, neste caso, organizando-os em uma linha.

import java.awt.Font; 
// Importa a classe Font, usada para definir o estilo e tamanho da fonte do texto.
import java.awt.TextField;
import java.awt.event.ItemListener; 
// Importa a interface ItemListener, que permite detectar eventos de seleção ou desmarcação de itens (como em caixas de seleção).

import java.awt.event.ItemEvent; 
// Importa a classe ItemEvent, que representa o evento de seleção ou desmarcação de um item.

import javax.swing.JFrame; 
// Importa a classe JFrame, que define uma janela para a interface gráfica.

import javax.swing.JTextField; 
// Importa a classe JTextField, que cria um campo de texto onde o usuário pode inserir ou exibir texto.

import javax.swing.JCheckBox; 
// Importa a classe JCheckBox, que cria uma caixa de seleção (checkbox), que pode ser marcada ou desmarcada.

import java.awt.font.*;
import java.util.*;

public class CheckBoxFrame extends JFrame 
// Define a classe CheckBoxFrame, que herda de JFrame, ou seja, é uma janela personalizada que contém os componentes da interface.

{
   private final JTextField textField; 
   // Declara um campo de texto (JTextField) chamado textField. Ele será usado para exibir texto cujo estilo de fonte será alterado.

   private final JCheckBox boldJCheckBox; 
   // Declara uma caixa de seleção (JCheckBox) chamada boldJCheckBox, que será usada para alternar o estilo "negrito" do texto.

   private final JCheckBox italicJCheckBox; 
   // Declara uma caixa de seleção (JCheckBox) chamada italicJCheckBox, que será usada para alternar o estilo "itálico" do texto.

   private final JCheckBox underlineJCheckBox;


   public CheckBoxFrame() 
   // Construtor da classe CheckBoxFrame. É executado quando um objeto dessa classe é criado.
   {
      super("JCheckBox Test");
      // Chama o construtor da superclasse (JFrame) e define o título da janela como "JCheckBox Test".

      setLayout(new FlowLayout());
      // Define o layout da janela como FlowLayout, para que os componentes sejam dispostos em linha, na ordem em que são adicionados.

      textField = new JTextField("Watch the font style change", 20);
      // Cria um campo de texto com o texto inicial "Watch the font style change" e 20 colunas de largura.

      textField.setFont(new Font("Serif", Font.PLAIN, 14));
      // Define a fonte do texto no campo de texto como "Serif", estilo normal (PLAIN), e tamanho 14.

      add(textField); 
      // Adiciona o campo de texto (textField) à janela (JFrame).

      boldJCheckBox = new JCheckBox("Bold"); 
      // Cria uma caixa de seleção com o rótulo "Bold" (negrito).

      italicJCheckBox = new JCheckBox("Italic"); 
      // Cria uma caixa de seleção com o rótulo "Italic" (itálico).

      underlineJCheckBox = new JCheckBox("Underline"); 

      add(boldJCheckBox); 
      // Adiciona a caixa de seleção "Bold" à janela.

      add(italicJCheckBox); 
      // Adiciona a caixa de seleção "Italic" à janela.

      add(underlineJCheckBox);

      CheckBoxHandler handler = new CheckBoxHandler(); 
      // Cria um objeto do tipo CheckBoxHandler, que será o responsável por gerenciar os eventos de seleção/desmarcação das caixas de seleção.

      boldJCheckBox.addItemListener(handler); 
      // Adiciona o gerenciador de eventos (handler) à caixa de seleção "Bold", para que ele responda a eventos de seleção/desmarcação.

      italicJCheckBox.addItemListener(handler); 
      // Adiciona o gerenciador de eventos (handler) à caixa de seleção "Italic", para que ele responda a eventos de seleção/desmarcação.

      underlineJCheckBox.addItemListener(handler); 
   
   } 


   private class CheckBoxHandler implements ItemListener 
   // Classe interna privada que implementa a interface ItemListener. Ela é responsável por lidar com os eventos de seleção/desmarcação.

   {
      @Override
      public void itemStateChanged(ItemEvent event) 
      // Método que é chamado sempre que o estado de um item (caixa de seleção) muda, seja ele marcado ou desmarcado.
      {
         Font font = null; 
         // Declara um objeto Font, que será usado para alterar o estilo de fonte do texto no campo de texto.

         // Verifica se ambas as caixas de seleção "Bold" e "Italic" estão marcadas.
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14); 
            // Se ambas estiverem marcadas, cria uma nova fonte "Serif" com estilo "negrito" e "itálico", e tamanho 14.

         // Verifica se apenas a caixa de seleção "Bold" está marcada.
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14); 
            // Se apenas "Bold" estiver marcada, cria uma nova fonte "Serif" com estilo "negrito" e tamanho 14.

         // Verifica se apenas a caixa de seleção "Italic" está marcada.
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14); 
            // Se apenas "Italic" estiver marcada, cria uma nova fonte "Serif" com estilo "itálico" e tamanho 14.

         else
            font = new Font("Serif", Font.PLAIN, 14); 
            // Se nenhuma das caixas estiver marcada, define a fonte como "Serif" com estilo normal (PLAIN) e tamanho 14.

         textField.setFont(font); 

         if (underlineJCheckBox.isSelected()){
            font = textField.getFont();
            Map attributes =  font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textField.setFont(font.deriveFont(attributes));
            font = new Font(attributes);
         }
         // Aplica a nova fonte ao campo de texto (textField), atualizando o estilo de fonte com base nas caixas de seleção.
      } //Fechamento do método itemStateChanged
   }//Fechamento da classe CheckBoxHandler
}//Fechamento da classe CheckBoxFrame
