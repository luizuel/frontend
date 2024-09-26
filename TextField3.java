
import java.awt.FlowLayout; // importando componente / módulo / biblioteca pacote.
import java.awt.event.ActionListener; // importando componente / sub móduto / módulo / biblioteca pacote.
import java.awt.event.ActionEvent; // importando componente / sub móduto / módulo / biblioteca pacote.
import javax.swing.JFrame; // importando componente / módulo / biblioteca pacote.
import javax.swing.JTextField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JPasswordField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JOptionPane; // importando componente / módulo / biblioteca pacote.

public class TextField3 extends JFrame 
{
   private final JTextField textField3;
   
   public TextField3() 
   {
      super("TextField3");
      setLayout(new FlowLayout());

      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false);
      add(textField3);
            
      TextFieldHandler handler = new TextFieldHandler();
      textField3.addActionListener(handler);
   }

   private class TextFieldHandler implements ActionListener 
   { 
      @Override 
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         if (event.getSource() == textField3)
            string = String.format("TextField3: %s",
                event.getActionCommand());

         JOptionPane.showMessageDialog(null, string); 
      } 
   }
   public static void main(String[] args)
   { 
      TextField3 textField3 = new TextField3();
      textField3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textField3.setSize(350, 100);
      textField3.setVisible(true);
   }
}