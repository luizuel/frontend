
import java.awt.FlowLayout; // importando componente / módulo / biblioteca pacote.
import java.awt.event.ActionListener; // importando componente / sub móduto / módulo / biblioteca pacote.
import java.awt.event.ActionEvent; // importando componente / sub móduto / módulo / biblioteca pacote.
import javax.swing.JFrame; // importando componente / módulo / biblioteca pacote.
import javax.swing.JTextField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JPasswordField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JOptionPane; // importando componente / módulo / biblioteca pacote.

public class PasswordField extends JFrame 
{
   private final JTextField passwordField;
   
   public PasswordField() 
   {
      super("PasswordField");
      setLayout(new FlowLayout());

      passwordField = new JPasswordField("Hidden text");
      add(passwordField);
            
      TextFieldHandler handler = new TextFieldHandler();
      passwordField.addActionListener(handler);
   }

   private class TextFieldHandler implements ActionListener 
   { 
      @Override 
      public void actionPerformed(ActionEvent event)
      {
         String string = "";
         if (event.getSource() == passwordField)
            string = String.format("PasswordField: %s",
                event.getActionCommand());

         JOptionPane.showMessageDialog(null, string); 
      } 
   }
   public static void main(String[] args)
   { 
      PasswordField passwordField = new PasswordField();
      passwordField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      passwordField.setSize(350, 100);
      passwordField.setVisible(true);
   }
}