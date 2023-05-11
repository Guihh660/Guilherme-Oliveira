package GridLayoutFrame;

// Figura 14.43: GridLayoutFrame.java
// Demonstrando GridLayout.

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private JButton[] buttons; // array de botões
    private static final String[] names = { "one", "two", "three", "four", "five", "six" };
    private boolean toggle = true; // alterna entre dois layouts
    private Container container; // contêiner do frame
    private GridLayout gridLayout1; // primeiro gridlayout
    private GridLayout gridLayout2; // segundo gridlayout

    public GridLayoutFrame() {
        super("GridLayout Demo");

        gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 linhas, 3 colunas, 5 pixels de espaço
        gridLayout2 = new GridLayout(3, 2, 5, 5); // 3 linhas, 2 colunas, 5 pixels de espaço
        container = getContentPane(); // obtém painel de conteúdo
        setLayout(gridLayout1); // configura o layout JFrame

        buttons = new JButton[names.length]; // cria array de JButtons
        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this); // registra listener
            add(buttons[count]); // adiciona o botão ao Frame
        } // fim do for

    } // fim do construtor GridLayoutFrame

    // trata eventos de botão alternando entre layouts
    public void actionPerformed(ActionEvent event) {
        if (toggle) {
            container.setLayout(gridLayout2); // configura layout como segundo
        } else {
            container.setLayout(gridLayout1); // configura layout como primeiro
        }
        toggle = !toggle; // alterna para valor oposto
        container.validate(); // refaz o layout do contêiner
    } // fim do método actionPerformed
} // fim da classe GridLayoutFrame
