package FlowLayoutFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {

    private JButton leftButton;   // botão para configurar alinhamento à esquerda
    private JButton centerButton; // botão para configurar alinhamento centralizado
    private JButton rightButton;  // botão para configurar alinhamento à direita
    private FlowLayout layout;    // objeto de layout

    private Container container;  // contêiner para configurar layout

    // configura GUI e registra listeners de botão
    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();              // cria FlowLayout
        container = getContentPane();           // obtém contêiner para layout
        container.setLayout(layout);            // configura o layout do frame

        // configura leftButton e registra listener
        leftButton = new JButton("Left");       
        container.add(leftButton);              // adiciona o botão Left ao frame
        leftButton.addActionListener(new ActionListener() {
            // classe interna anônima para processar o evento leftButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(container);  // realinha os componentes anexados
            }
        });

        // configura centerButton e registra o listener
        centerButton = new JButton("Center");
        container.add(centerButton);            // adiciona o botão Center ao frame
        centerButton.addActionListener(new ActionListener() {
            // classe interna anônima para processar o evento centerButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(container); // realinha os componentes anexados
            }
        });

        // configura rightButton e registra o listener
        rightButton = new JButton("Right");
        container.add(rightButton);             // adiciona o botão Right ao frame
        rightButton.addActionListener(new ActionListener() {
            // classe interna anônima para processar o evento rightButton
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(container); // realinha os componentes anexados
            }
        });
    }

    public static void main(String[] args) {
        FlowLayoutFrame frame = new FlowLayoutFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
