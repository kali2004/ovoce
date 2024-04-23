package cyklus;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jlist {

	public static void main(String args[]) {
		JFrame f = new JFrame();
		JButton b = new JButton("zvol");
		b.setBounds(200, 150, 80, 30);
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Item1");
		l1.addElement("Item2");
		l1.addElement("Item3");
		l1.addElement("Item4");
		JList<String> list = new JList<>(l1);
		list.setBounds(100, 100, 75, 75);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (list.getSelectedIndex() != -1) {
					int selectedIndex = list.getSelectedIndex();
					l1.removeElementAt(selectedIndex);
				}
			}

		});
		f.add(list);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
