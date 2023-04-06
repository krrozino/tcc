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
    public SquareButton(String text) {
        super(text);
        setUI(new BasicButtonUI()); // usa a classe de interface de usuário básica do Swing
        setBackground(Color.WHITE); // define o fundo do botão como branco
        setBorderPainted(false); // remove a borda do botão
        setContentAreaFilled(false); // remove o fundo do botão
    }
}
