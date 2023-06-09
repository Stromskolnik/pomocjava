import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class kalkulacka{
    String mezipocet="0";
    String mezipocet2="0";
    float vysledek1=0f;
    float vysledek2=0f;
    int nejdeboolean=0;
    boolean plus=false;
    boolean minus=false;
    boolean krat=false;
    boolean deleno=false;
    float vysledek=0;
    String vysledekstr="0";
    public kalkulacka(){
        JFrame frame = new JFrame();
        JPanel panel =new JPanel();
        JLabel label = new JLabel();
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8= new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttontecka = new JButton(".");
        JButton buttonrovno = new JButton("=");
        JButton buttonplus = new JButton("+");
        JButton buttonminus = new JButton("-");
        JButton buttonkrat = new JButton("*");
        JButton buttondeleno = new JButton("/");
        JButton vymaz = new JButton("C");
        panel.setBorder(BorderFactory.createEmptyBorder(50, 10, 30, 30));
        panel.setLayout(new GridLayout(5,4));
        panel.add(button7);panel.add(button8);panel.add(button9);panel.add(buttondeleno);panel.add(button4);panel.add(button5);panel.add(button6);panel.add(buttonkrat);panel.add(button1);panel.add(button2);panel.add(button3);panel.add(buttonminus);panel.add(button0);panel.add(buttontecka);panel.add(buttonrovno);panel.add(buttonplus);panel.add(vymaz);
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Kalkulačka");
        frame.setVisible(true);
        frame.add(panel,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        label.setText(vysledekstr);
        panel.add(label);


        vymaz.addActionListener(new ActionListener() {
 

            @Override
            public void actionPerformed(ActionEvent e) {
                mezipocet="0";
                mezipocet2="0";
                vysledek1=0f;
                vysledek2=0f;
                nejdeboolean=0;
                plus=false;
                minus=false;
                krat=false;
                deleno=false;
            }
        });
        button0.addActionListener(new ActionListener() {
 

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+0;
                }
                else{
                    mezipocet2=mezipocet2+""+0;
                }

   
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+1;
                }
                else{
                    mezipocet2=mezipocet2+""+1;
                }
            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+2;
                }
                else{
                    mezipocet2=mezipocet2+""+2;
                }
            }
        });
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+3;
                }
                else{
                    mezipocet2=mezipocet2+""+3;
                }
            }
        });
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+4;
                }
                else{
                    mezipocet2=mezipocet2+""+4;;
                }
            }
        });
        button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+5;;
                }
                else{
                    mezipocet2=mezipocet2+""+5;
                }
            }
        });
        button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+6;
                }
                else{
                    mezipocet2=mezipocet2+""+6;
                }
            }
        });
        button7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+7;
                }
                else{
                    mezipocet2=mezipocet2+""+7;
                }
            }
        });
        button8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+8;
                }
                else{
                    mezipocet2=mezipocet2+""+8;
                }
            }
        });
        button9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean>0){
                    mezipocet=mezipocet+""+9;
                }
                else{
                    mezipocet2=mezipocet2+""+9;
                }
            }
        });
        buttonrovno.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Float vysledek1 =Float.parseFloat(mezipocet);
                Float vysledek2 =Float.parseFloat(mezipocet2);
                System.out.println(vysledek1);
                System.out.println(vysledek2);
                System.out.println(mezipocet);
                System.out.println(mezipocet2);
                if (plus==true){
                    vysledek=vysledek1+vysledek2;
                    vysledekstr = Float.toString(vysledek);
                    label.setText(vysledekstr);
                    plus=false;
                    minus=false;
                    krat=false;
                    deleno=false;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    mezipocet2=vysledekstr;
                    mezipocet="0";
                    
                    
                    
                }
                if (minus==true){
                    vysledek=vysledek2-vysledek1;
                    vysledekstr = Float.toString(vysledek);
                    label.setText(vysledekstr);
                    plus=false;
                    minus=false;
                    krat=false;
                    deleno=false;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    mezipocet2=vysledekstr;
                    mezipocet="0";
                }
                if (krat==true){
                    vysledek=vysledek1*vysledek2;
                    vysledekstr = Float.toString(vysledek);
                    label.setText(vysledekstr);
                    plus=false;
                    minus=false;
                    krat=false;
                    deleno=false;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    mezipocet2=vysledekstr;
                    mezipocet="0";
                    
                }
                if (deleno==true){
                    vysledek=vysledek2/vysledek1;
                    vysledekstr = Float.toString(vysledek);
                    label.setText(vysledekstr);
                    plus=false;
                    minus=false;
                    krat=false;
                    deleno=false;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    vysledek1=0f;
                    vysledek2=0f;
                    nejdeboolean=0;
                    mezipocet2=vysledekstr;
                    mezipocet="0";
                    
                    
                }
                
                
            }
        });
        buttonminus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nejdeboolean+=1;
                minus=true;
                
            }
        });
        buttonplus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nejdeboolean+=1;
                plus=true;
            }
        });
        buttonkrat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nejdeboolean+=1;
                krat=true;
            }
        });
        buttondeleno.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nejdeboolean+=1;
                deleno=true;
            }
        });
        buttontecka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nejdeboolean > 0) {
                    mezipocet = mezipocet + ".";
                    
                } else {
                    mezipocet2 = mezipocet2 + ".";
                    
                }
            }
        });
    }


    
    public static void main(String[] args){
        new kalkulacka();
    }
    

}

