package priklad1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class nakup {
	static int x = 0;
	public static void main(String[] args) {
		  JFrame frame = new JFrame("Správa objednávek – Restaurace Zlatý jelen");
		  ImageIcon icon = new ImageIcon("C:\\Users\\marek\\eclipse-workspace\\l.jpg");
	      JLabel label = new JLabel(icon);
	      DefaultListModel<String> l1 = new DefaultListModel<>();   
          JList<String> list = new JList<>(l1);  
          String jidlo[]={"Hovězí guláš", "Smažený sýr", "Grilovaný kuřecí steak", "Vepřové koleno"};        
          JComboBox cb=new JComboBox(jidlo);
          String piti[]={"Pivo", "Víno", "Kofola", "Káva"};  
          JTextField t1;
          t1=new JTextField("");  
          JComboBox cb2=new JComboBox(piti);
          JLabel label2 = new JLabel("Cena:");
          JButton b1=new JButton("Přidat");  
          JButton b2=new JButton("Export do txt");  
		  
          b1.addActionListener(new ActionListener(){  
        	  public void actionPerformed(ActionEvent e){  
        	String a = (String) cb.getSelectedItem();
        	String b= (String)cb2.getSelectedItem();
        	String c = t1.getText();
        	l1.addElement(a+" + "+b+"  "+"("+c+ " Kč)");
        	x++;
        	  }  
        	  });  
          b2.addActionListener(new ActionListener(){  
        	  public void actionPerformed(ActionEvent e){  
        		  JFileChooser jf = new JFileChooser(); 
        	        int y = jf.showSaveDialog(null);
        	        if(y==JFileChooser.APPROVE_OPTION){  
        	        File g = jf.getSelectedFile();
        	        try {
        	            FileWriter myWriter = new FileWriter(g.getPath());
        	            for(int i = 0;i<x;i++) {
        	            	  myWriter.write(l1.getElementAt(i));
        	            	  
        	            }
        	            myWriter.close();
        	            System.out.println("Successfully wrote to the file.");
        	          } catch (IOException ex) {
        	            System.out.println("");
        	            ex.printStackTrace();
        	          }
        	        }      
        	  }  
        	  });  
	   
	      
	      
	      
	      	
          b1.setBounds(10,325, 155,30);  
          b2.setBounds(10, 365,155,30); 	
          t1.setBounds(10,280, 155,30);  
          cb2.setBounds(10, 230,155,30);  
          cb.setBounds(10, 190,155,30);
          list.setBounds(190,10, 235,395); 
	      label.setBounds(30,44, 120, 144);
	      label2.setBounds(10,198, 120, 144);
	      	frame.add(cb);
	    	frame.add(b1);
	      	frame.add(b2);
	      	frame.add(t1);
	      	frame.add(cb2);
	      	frame.add(label2);
	      	frame.getContentPane().setBackground(Color.lightGray);
	      	frame.add(list);
	      	frame.add(label);
		  	frame.setLayout(null);
		   	frame.setSize(450, 450);  
	        frame.setLocationRelativeTo(null);  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        frame.setVisible(true);  
		
		
	}

}
