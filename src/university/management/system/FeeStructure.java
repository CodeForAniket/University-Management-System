/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1700,800);
        setLocation(100,100);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,56));
        i1.setBounds(600,10,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
     
     
        
        l6 = new JLabel("MBA");
        l6.setBounds(1080,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,26));
        add(l6);
        
        m1 = new JLabel("Rs 65000");
        m1.setBounds(1080,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,26));
        add(m1);
        
        m2 = new JLabel("Rs 65000");
        m2.setBounds(1080,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,26));
        add(m2);
        
        m3 = new JLabel("Rs 65000");
        m3.setBounds(1080,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,26));
        add(m3);
        
        m4 = new JLabel("Rs 65000");
        m4.setBounds(1080,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,26));
        add(m4);
        
        l7 = new JLabel("MCA");
        l7.setBounds(1280,100,100,40);
        l7.setFont(new Font("serif",Font.BOLD,26));
        add(l7);
        
        m5 = new JLabel("Rs 55000");
        m5.setBounds(1280,170,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,26));
        add(m5);
        
        m6 = new JLabel("Rs 55000");
        m6.setBounds(1280,240,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,26));
        add(m6);
        
        m7 = new JLabel("Rs 55000");
        m7.setBounds(1280,310,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,26));
        add(m7);
        
        m8 = new JLabel("Rs 55000");
        m8.setBounds(1280,380,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,26));
        add(m8);
        
     
        l10 = new JLabel("Semester 1");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        add(l13);
       
           getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
