import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class piskvorky {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private boolean hrac1 = true;

    public piskvorky() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        button1 = new JButton("");
        button2 = new JButton("");
        button3 = new JButton("");
        button4 = new JButton("");
        button5 = new JButton("");
        button6 = new JButton("");
        button7 = new JButton("");
        button8 = new JButton("");
        button9 = new JButton("");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(3, 3));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Piškvorky");
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label, BorderLayout.SOUTH);

       

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button1.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button1.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button2.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button2.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button3.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button3.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button4.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button4.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button5.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button5.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button6.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button6.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button7.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button7.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button8.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button8.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hrac1==true){
                    button9.setText("0");
                    hrac1=false;
                    vyhrals();
                }
                else{
                    button9.setText("X");
                    hrac1=true;
                    vyhrals();
                }

            }
        });

    }
    private void vyhrals() {
        if(button1.getText().equals("0")&& button2.getText().equals("0") && button3.getText().equals("0")){
                label.setText("Hráč 1 vyhrál");
                frame.revalidate();
                frame.repaint();
            return;
            }
        if(button1.getText().equals("0")&& (button5.getText().equals("0") && (button9.getText().equals("0")))){
                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button3.getText().equals("0")&& (button5.getText().equals("0") && (button7.getText().equals("0")))){

                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button7.getText().equals("0")&& (button8.getText().equals("0") && (button9.getText().equals("0")))){

                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button1.getText().equals("0")&& (button4.getText().equals("0") && (button7.getText().equals("0")))){

                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button2.getText().equals("0")&& (button5.getText().equals("0") && (button8.getText().equals("0")))){

                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button3.getText().equals("0")&& (button6.getText().equals("0") && (button9.getText().equals("0")))){

                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
        if(button4.getText().equals("0")&& (button5.getText().equals("0") && (button6.getText().equals("0")))){
                    label.setText("Hráč 1 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
            }
            if(button1.getText().equals("X")&& button2.getText().equals("X") && button3.getText().equals("X")){
                    label.setText("Hráč 2 vyhrál");
                    frame.revalidate();
                    frame.repaint();
                return;
                }
            if(button1.getText().equals("X")&& (button5.getText().equals("X") && (button9.getText().equals("X")))){
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    return;
                }
            if(button3.getText().equals("X")&& (button5.getText().equals("X") && (button7.getText().equals("X")))){
            
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    return;
                }
            if(button7.getText().equals("X")&& (button8.getText().equals("X") && (button9.getText().equals("X")))){
            
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    return;
                }
            if(button1.getText().equals("X")&& (button4.getText().equals("X") && (button7.getText().equals("X")))){
            
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    return;
                }
            if(button2.getText().equals("X")&& (button5.getText().equals("X") && (button8.getText().equals("X")))){
            
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    
                    return;
                }
            if(button3.getText().equals("X")&& (button6.getText().equals("X") && (button9.getText().equals("X")))){
            
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    
                    return;
                }
            if(button4.getText().equals("X")&& (button5.getText().equals("X") && (button6.getText().equals("X")))){
                        label.setText("Hráč 2 vyhrál");
                        frame.revalidate();
                        frame.repaint();
                    
                    return;
                }
    }

        public static void main(String[] args){
        new piskvorky();
    }
}