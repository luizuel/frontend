
import java.awt.FlowLayout; // importando componente / módulo / biblioteca pacote.
import java.awt.event.ActionListener; // importando componente / sub móduto / módulo / biblioteca pacote.
import java.awt.event.ActionEvent; // importando componente / sub móduto / módulo / biblioteca pacote.
import javax.swing.JFrame; // importando componente / módulo / biblioteca pacote.
import javax.swing.JTextField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JPasswordField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JOptionPane; // importando componente / módulo / biblioteca pacote.

public class TextField2 extends JFrame 
{
   private final JTextField textField2;
   
   public TextField2() 
   {
      super("TextField2");
      setLayout(new FlowLayout());

      textField2 = new JTextField("Enter text here");
      add(textField2);
            
      TextFieldHandler handler = new TextFieldHandler();
      textField2.addActionListener(handler);
   }

   private class TextFieldHandler implements ActionListener 
   { 
      @Override 
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         if (event.getSource() == textField2)
            string = String.format("TextField2: %s",
                event.getActionCommand());

         JOptionPane.showMessageDialog(null, string); 
      } 
   }
   public static void main(String[] args)
   { 
      TextField2 textField2 = new TextField2();
      textField2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textField2.setSize(350, 100);
      textField2.setVisible(true);
   }
}