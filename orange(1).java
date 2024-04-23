package projekt2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.*; 
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 



public class matura5 {
	public static int f = 0;
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Auto Styl");  
        JPanel panel = new JPanel();  
        
        panel.setLayout(null);  
        panel.setBackground(Color.GRAY);
        
        
        JLabel label = new JLabel("Rozměr pneu");  
        label.setBounds(260,80,110,30);
        
        JLabel label2 = new JLabel("Značka pneu");  
        label2.setBounds(260,30,110,30);
        
        JLabel label3 = new JLabel("(Barum, Michelin)");  
        label3.setBounds(260,50,110,30);
        
        
        JTextField a = new JTextField("Michelin");
        a.setBounds(30,30,190,30);
        
        JTextField b = new JTextField("R18");
        b.setBounds(30,70,190,30);
        
        DefaultListModel<String> l1 = new DefaultListModel<>();  
      
        JList<String> list = new JList<>(l1);  
        list.setBounds(30,110, 190,190);  
        
        
        
        
        ImageIcon image = new ImageIcon("pneu.jpg");
        JLabel imagelabel = new JLabel(image);
        imagelabel.setBounds(250,290, 120,50); 
        
        
        
        JButton button = new JButton();  
        button.setText("Přidej pneu");  
        button.setBounds(260,120,110,30);
        
        JButton button2 = new JButton();  
        button2.setText("Info");  
        button2.setBounds(260,160,110,30);
        
        JButton button3 = new JButton();  
        button3.setText("Smaž pneu");  
        button3.setBounds(260,200,110,30);
        
        JButton button4 = new JButton();  
        button4.setText("Zavři");  
        button4.setBounds(260,240,110,30);
        
        JButton button5 = new JButton();  
        button5.setText("uloz");  
        button5.setBounds(260,280,110,30);
        
        
        
        
        button3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){    
            	int index = list.getSelectedIndex();		
                if (index != -1) {
                    l1.remove(index); 
                    f -= 1;
            }  
            } });  
        
        
        button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){    
            	String slovo = a.getText();
            	String slovo2 = b.getText();
                    l1.addElement(slovo+ " " + slovo2);  
                    f += 1;
            }  
           
             });  
        
        
        button2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){    
            	
            	JOptionPane.showMessageDialog(frame,"Adresa:		Bezručova 106, 339 00 Klatovy\r\n"
            			+ "Tel.:   	 	377 240 144    \r\n"
            			+ "IČ:			33050127\r\n"
            			+ "DIČ:			CZ33050127\r\n"
            			+ "E-mail:		autostyl@gmail.cz\r\n"
            			+ "Web:		www.autostyl.cz\r\n"
            			+ "Č. účtu:	 	427511262/0300\r\n"
            			+ "");  
            	
            	
            	
            }  
             });  
        
        
        button4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){    
            	 frame.dispose(); 
            	 JOptionPane.showMessageDialog(frame,"Filip Nebehaj");  
            	 System.exit(1);
            }  
             });  
        
        button5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){    
            	try {
            	      FileWriter myWriter = new FileWriter("filename.txt");
            	      for (int i = 0; i < f; i++) {
            	    	  myWriter.write(l1.getElementAt(i)+"\n");
            	    	}
            	      
            	      myWriter.close();
            	      System.out.println("Successfully wrote to the file.");
            	    } catch (IOException e1) {
            	      System.out.println("An error occurred.");
            	      e1.printStackTrace();
            	    }
            	
            }  
             });  
        
        
        
        
        JPanel panel2=new JPanel();  
        panel2.setBounds(250,130,110,30);    
        panel2.setBackground(Color.blue); 
        
        JPanel panel3=new JPanel();  
        panel3.setBounds(250,170,110,30);    
        panel3.setBackground(Color.green);
        
        JPanel panel4=new JPanel();  
        panel4.setBounds(250,210,110,30);    
        panel4.setBackground(Color.yellow);
        
        JPanel panel5=new JPanel();  
        panel5.setBounds(250,250,110,30);    
        panel5.setBackground(Color.red);
        
        
        panel.add(imagelabel);
        panel.add(list);
        panel.add(label3);
        panel.add(label2);
        panel.add(label);  
        panel.add(button);  
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(a);
        panel.add(b);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        
        
        frame.add(panel);  
        
        
        
        
        frame.setSize(400, 400);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
		
		
		
		
	}

}
