package components;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author byronjimenez
 */
import javax.swing.*;
import java.awt.*;

public class JImage extends JPanel {
    private Image backgroundImage;

    public JImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja el fondo de imagen
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}

