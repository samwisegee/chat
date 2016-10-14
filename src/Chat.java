import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class Chat extends JFrame {
    private Chat() {
        super("Chat");
        try {
            SwingUtilities.invokeAndWait(() -> {
                setPreferredSize(new Dimension(800, 600));
                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setResizable(false);
                pack();
                setVisible(true);
                setLocationRelativeTo(null);
            });
        } catch (InterruptedException | InvocationTargetException e) {e.printStackTrace();}


    }

    public static void main(String[] args) {
        new Chat();
    }
}
