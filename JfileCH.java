package cyklus;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;

public class JfileCH<ActionEvent> {
	static JLabel l;

	public static void main(String[] args) {
		JFrame f = new JFrame(" JavaTpoint");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("open dialog");
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent e) {
				JFileChooser jf = new JFileChooser();
				int r = jf.showOpenDialog(null);
				if (r == JFileChooser.APPROVE_OPTION) {
					l.setText(jf.getSelectedFile().getAbsolutePath());

					try {
						File myObj = new File(jf.getSelectedFile().getAbsolutePath());
						Scanner myReader = new Scanner(myObj);
						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
						}
						myReader.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else
					l.setText("zruseno");
			}
		});

		
		JPanel p = new JPanel();

		p.add(b1);
		//p.add(b2);
		l = new JLabel("<html><body>nic<br>nevybrano</body></html>");
		p.add(l);
		f.add(p);
		f.setVisible(true);
	}

}