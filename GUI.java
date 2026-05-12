import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    Cookies logic = new Cookies();
    CColor myCColor = new CColor(186, 99, 246);
    JFrame frame;
    JButton Button;
    JButton Impr1Button;
    JPanel panel;
    JLabel CountLabel;
    ImageIcon Image = new Icon("GoodCookie.png");

    public GUI() {
        frame = new JFrame("Cookie War");
        Button = new JButton(Icon);
        Button.setPreferredSize(new Dimension(250, 250));
        Button.addActionListener(e -> {
            logic.Click();
            UpdateCountLabel();
        });
        Impr1Button = new JButton("Price: "+logic.getImpr1Price()+" cookies");
        Impr1Button.addActionListener(e -> {
        if(logic.buyImpr1()){
            UpdateCountLabel();
            Impr1Button.setText("Price: "+logic.getImpr1Price()+" cookies");
        }else{
            JOptionPane.showMessage
logic.click
logic.click
