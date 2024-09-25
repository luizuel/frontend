
import java.awt.FlowLayout; // importando componente / módulo / biblioteca pacote.
import java.awt.event.ActionListener; // importando componente / sub móduto / módulo / biblioteca pacote.
import java.awt.event.ActionEvent; // importando componente / sub móduto / módulo / biblioteca pacote.
import javax.swing.JFrame; // importando componente / módulo / biblioteca pacote.
import javax.swing.JTextField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JPasswordField; // importando componente / módulo / biblioteca pacote.
import javax.swing.JOptionPane; // importando componente / módulo / biblioteca pacote.

//Declarando a classe TextFieldFrame que está herdando o componente JFrame.
public class TextFieldFrame extends JFrame 
{// Inicio do bloco de códigos da classe TextFieldFrame.
   private final JTextField textField1; // Declaração da variável privada ou seja é de uso exclusivo da classe e final é que não pode ser alterada/modificada do tipo TextField.
   private final JTextField textField2; // Declaração da variável privada ou seja é de uso exclusivo da classe e final é que não pode ser alterada/modificada do tipo TextField.
   private final JTextField textField3; // Declaração da variável privada ou seja é de uso exclusivo da classe e final é que não pode ser alterada/modificada do tipo TextField.
   private final JPasswordField passwordField;// Declaração da variável privada ou seja é de uso exclusivo da classe e final é que não pode ser alterada/modificada do tipo TextField.

// Declaração do construtor TextFieldFrame, exportador.
   public TextFieldFrame()
   {// Inicio do bloco de códigos do construtor TextFieldFrame.
      super("Testing JTextField and JPasswordField"); // Definição do título da janela.
      setLayout(new FlowLayout()); // declaração do layout de camadas da apresentação da janela.


      textField1 = new JTextField(10); //declaração de variável com Atribuição com um novo objeto JTextField com definiçao de largura das colunas em torno de 10 a 15 pixels.
      add(textField1);// Adicionando o textfild1 no layout de apresentação.


      textField2 = new JTextField("Enter text here"); //declaração de variável com Atribuição com um novo objeto JTextField com definição de texto.
      add(textField2); // Adicionando o textfild2 no layout de apresentação.

  
      textField3 = new JTextField("Uneditable text field", 21);//declaração de variável com Atribuição com um novo objeto JTextField com definição de texto e também o tamanho da coluna
      textField3.setEditable(false); //definição do método para não ser editado = false
      add(textField3);// Adicionando o textfild3 no layout de apresentação.


      passwordField = new JPasswordField("Hidden text"); //declaração de variável com Atribuição com um novo objeto JPasswordField com definição de senha ou seja caracter ***.
      add(passwordField);// Adicionando o textfild3 no layout de apresentação.
      
      
      TextFieldHandler handler = new TextFieldHandler(); // declaração de variável TextFieldHandler Manipulador dos campos TextFieldHandler com uma declaração de construtor TextFieldHandler
      textField1.addActionListener(handler); //invocando o método e adicionando um escutador de ação (addActionListener) enviando como parametro o handler
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } //Final do bloco de código do construtor

   // declaração de classe privada TextFieldHandler implementando o AcitionListener onde está sendo transformado em componente o Handler / ActionListener = objeto
   private class TextFieldHandler implements ActionListener 
   { //Inicio do bloco de códigos da classe privada TextFieldHandler
      @Override // em ingles é o sobrescreva e o @ é para evitar notificações de alerta referene a ação.
      public void actionPerformed(ActionEvent event) // declara o método actionPerformed ou seja são as ações que irá acontecer dentro para ser executada dentro do bloco de códigos onde precisa estar com o parâmetro ActionEvent.
      {
         String string = ""; //Declarando a variável string do tipo String e atribuindo um texto vazio para ela.
         if (event.getSource() == textField1) // IF = comprador // quando exite 2 sinais de = é um operador de comparação ou seja comparando o lado esquerdo com o lado direito // evento do sistema de ação que é o ActionEvent da linha 53 //getSource = textfield1 (objeto) quando a comparação for igual voltará como verdadeira executando o código abaixo.
            string = String.format("textField1: %s", // a string que antes era vazia, agora vai receber um novo texto. // String.format é um método que vai entregar o texto formatado. // "textField1: %s" é o parâmetro de formatação declarado para a string // %s é um caracter coringa, o S significa que ele vai retornar uma string / texto .
               event.getActionCommand()); //significa pegar o comando de ação, capturando o texto que está dentro do elemento do parâmetro event.

         
         else if (event.getSource() == textField2) // comparador do evento do sistema com a textfiel2
            string = String.format("textField2: %s",
               event.getActionCommand());

         
         else if (event.getSource() == textField3)// comparador do evento do sistema com a textfiel3
            string = String.format("textField3: %s", 
               event.getActionCommand());

         
         else if (event.getSource() == passwordField)// comparador do evento do sistema com a passwordfiled
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         //Na linha abaixo estamos definindo o JOptionPane ou seja mostrar tela de diálogo referene a ação acima. caso as strings forem validadas ou não.
         JOptionPane.showMessageDialog(null, string); 
      } 
   }
}