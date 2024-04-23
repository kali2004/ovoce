package cyklus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class opakovani {
	static int x;

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JTextArea field = new JTextArea();
		JTextArea pridej = new JTextArea();
		JButton button = new JButton();
		button.setText("Pøidej");
		button.setBounds(10, 10, 100, 20);
		field.setBounds(120, 10, 100, 20);
		pridej.setBounds(120, 40, 100, 20);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!pridej.getText().isEmpty()) {
					x = x + Integer.parseInt(pridej.getText());
					field.setText(Integer.toString(x));
				}else {
					System.out.print("prazdne");
				}
				
			}
		});
		frame.add(field);
		frame.add(pridej);
		frame.add(button);
		frame.setSize(300, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}