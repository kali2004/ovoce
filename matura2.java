package projekt;

import javax.swing.*; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  


public class matura2 {
	public static int i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 JFrame frame = new JFrame("JFrame Example");  
	        JPanel panel = new JPanel();  
	        
	        panel.setLayout(null);  
	        
	        
	        JLabel label = new JLabel("JFrame By Example");  
	        
	        JTextField a = new JTextField ("");
	        JTextField b = new JTextField ("zadej cislo");
	        
	        
	        
	        
	        JButton button = new JButton();  
	        button.setText("+Kč");  
	        button.setBounds(10, 10, 100, 100);
	        
	        label.setBounds(190, 100, 250, 250);
	        a.setBounds(190, 150, 200, 50);
	        b.setBounds(190, 250, 200, 50);
	      
	        button.addActionListener(new ActionListener(){  
	            public void actionPerformed(ActionEvent e){  
	            	
	            	String s1=b.getText();
	    	        int h=Integer.parseInt(s1);
	    	        
	            	i= i +h;
	            	String s = String.valueOf(i);
	                    a.setText(s + " Kč");  
	            }  
	            });  
	        
	        panel.add(b);
	        panel.add(a); 
	        panel.add(label);  
	        panel.add(button);  
	        frame.add(panel);  
	        
	        
	        
	        frame.setSize(800, 800);  
	        
	        
	        frame.setLocationRelativeTo(null);  
	        
	        
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
	        
	        
	        
	        
	    }  
		
		
		
		
		
	}


