import javax.swing.JFrame;

public class TextAreaDemo {
    public static void main(String[] args) {
        // Cria uma instância do TextAreaFrame
        TextAreaFrame textAreaFrame = new TextAreaFrame();
        
        // Define a operação padrão de fechamento do JFrame
        textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Configura o tamanho do frame
        textAreaFrame.setSize(425, 200);
        
        // Exibe o frame
        textAreaFrame.setVisible(true);
    }
}

// A classe TextAreaFrame é definida em outro arquivo
