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
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;

public class SquareButton extends JButton {

    public SquareButton(String text) {
        super(text);
        setUI(new BasicButtonUI()); // usa a classe de interface de usuário básica do Swing
        setBorderPainted(false); // remove a borda do botão
    }
    
    public SquareButton() {
        super();
        setBorder(new LineBorder(Color.BLACK, 2));
        setPreferredSize(new Dimension(50, 50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
