package principal;

import javax.swing.SwingUtilities;
import vista.VideoJuegoForm;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VideoJuegoForm().setVisible(true));
    }

}
