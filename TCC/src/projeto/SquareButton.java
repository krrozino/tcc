/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;
/**
 *
 * @author User
 */
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;

public class SquareButton extends JButton {
    public SquareButton() {
    super();
    setBorder(new LineBorder(Color.BLACK, 2));
    setPreferredSize(new Dimension(50, 50));
    setBackground(Color.WHITE);
    }
    public void setProperties(int width, int height, Color color) {
        setPreferredSize(new Dimension(width, height));
        setBackground(color);
    }
}
