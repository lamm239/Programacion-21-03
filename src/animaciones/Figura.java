/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaciones;
import java.awt.*;

/**
 *
 * @author Jorge
 */
public abstract class Figura implements Animable {

    private Color color;

    public abstract void mover();
    public abstract void dibujar(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
