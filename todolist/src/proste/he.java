package proste;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class he {

	public static void main(String[] args) {
	
		  JFrame frame = new JFrame("To Do List");  	
		  DefaultListModel<String> l1 =  new  DefaultListModel<>(); 
		  DefaultListModel<String> l2 =  new  DefaultListModel<>(); 
          JList<String> seznam =  new  JList<>(l1);  
          JList<String> seznam2 =  new  JList<>(l2);
          JButton b1=new JButton("přidat");  
          JButton b2=new JButton("splněno");  
          JButton b3=new JButton("odebrat");  
          JPanel panel=new JPanel();  
          JTextField t1;
          t1=new JTextField();
         	b1.addActionListener(new ActionListener(){  
         		public void actionPerformed(ActionEvent e){  
         		  String pridat = t1.getText();
         		  l1.addElement(pridat);
         		}  
         		});  
         
         	b2.addActionListener(new ActionListener(){  
         		public void actionPerformed(ActionEvent e){  
         			 int splneno = seznam.getSelectedIndex();
                     String neco = seznam.getSelectedValue();
                     l2.addElement(neco);
                     l1.removeElementAt(splneno);          
         		}  
         		});  
         
         	b3.addActionListener(new ActionListener(){  
         		public void actionPerformed(ActionEvent e){  
         			 int smazat1 = seznam2.getSelectedIndex();
                     l2.removeElementAt(smazat1);
                     
                     int a=JOptionPane.showConfirmDialog(frame,"Opravdu chcete");  
                     if(a==JOptionPane.YES_OPTION){  
                  
                     } 
         		}
                 });

         	
            t1.setBounds(50,50, 200,30);
          	seznam.setBounds( 50 , 150 ,  95, 150); 
          	seznam2.setBounds( 150 , 150 ,  95 , 150 ); 
          	b1.setBounds(50,100,95,30);  
          	b2.setBounds(150,100,95,30);  
         	b3.setBounds(250,100,95,30);
         	 panel.setBackground(Color.red); 
             panel.setBounds(255,125,90,10);    
          	frame.add(b1);	
        	frame.add(b2);	
        	frame.add(t1);
        	frame.add(panel);
        	frame.add(b3);		
        	frame.add(seznam);	
        	frame.add(seznam2);	
          	frame.getContentPane().setBackground(Color.BLACK);
          	frame.setLayout(null);
			frame.setSize(400, 400);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
	}

}
