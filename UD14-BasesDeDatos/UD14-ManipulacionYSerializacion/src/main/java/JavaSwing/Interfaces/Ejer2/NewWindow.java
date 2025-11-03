package JavaSwing.Interfaces.Ejer2;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
    public NewWindow (){

        setSize(new Dimension(500,500));
        dispose();
        setLayout(null);

        JLabel etiquetaConfir = new JLabel("Usuario y contraseña correctos");
        etiquetaConfir.setOpaque(true);
        etiquetaConfir.setBounds(50,50,200,200);
        add(etiquetaConfir);

        setVisible(true);
    }
}

