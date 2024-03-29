// Figura 14.45: PanelFrame.java
// Utilizando um JPanel para ajudar a fazer o layout dos componentes.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame {
    private JPanel buttonJPanel; // painel para armazenar botões
    private JButton[] buttons; // array de botões

    // construtor sem argumentos
    public PanelFrame() {
        super("Panel Demo");

        buttons = new JButton[5]; // cria botões de array
        buttonJPanel = new JPanel(); // configura painel
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // cria e adiciona botões
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]); // adiciona botão ao painel
        }

        add(buttonJPanel, BorderLayout.SOUTH); // adiciona painel ao JFrame
    } // fim do construtor PanelFrame
} // fim da classe PanelFrame
