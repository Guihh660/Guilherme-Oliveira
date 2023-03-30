// Figura 14.46: PanelDemo.java
// Testando Panel Frame.
import javax.swing.JFrame;

public class PanelDemo extends JFrame {
    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200); // configura o tamanho do frame
        panelFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe PanelDemo
