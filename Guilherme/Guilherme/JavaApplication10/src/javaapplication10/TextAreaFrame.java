// Figura 14.47: TextAreaFrame.java
// Copiando texto selecionado de uma textarea para outra.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {
    private JTextArea textArea1; // exibe a string demo
    private JTextArea textArea2; // texto destacado é copiado aqui
    private JButton copyButton; // começa a copiar o texto

    // construtor sem argumentos
    public TextAreaFrame() {
        super("TextArea Demo");
        
        Box box = Box.createHorizontalBox(); // cria box
        
        String demo = "This is a demo string to\n" +
                      "illustrate copying text\n" +
                      "from one textarea to \n" +
                      "another textarea using an\n" +
                      "external event\n";
        
        textArea1 = new JTextArea(demo, 10, 15); // cria textArea1
        box.add(new JScrollPane(textArea1)); // adiciona JScrollPane
        
        copyButton = new JButton("Copy >>>"); // cria botão de cópia
        box.add(copyButton); // adiciona o botão de cópia à box
        
        copyButton.addActionListener(new ActionListener() {
            // configura texto em textArea2 como texto selecionado de textArea1
            public void actionPerformed(ActionEvent event) {
                textArea2.setText(textArea1.getSelectedText());
            }
        }); // fim da chamada para addActionListener
        
        textArea2 = new JTextArea(10, 15); // cria segunda JTextArea
        textArea2.setEditable(false); // desativa a edição
        box.add(new JScrollPane(textArea2)); // adiciona JScrollPane
        
        add(box); // adiciona box ao frame
    } // fim do construtor TextAreaFrame
} // fim da classe TextAreaFrame
