package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class To_Do_List_Tracker implements ActionListener {
	String task = "";
	JFrame jF = new JFrame("To Do List");
	JPanel jP = new JPanel();
	JButton add = new JButton("Add");
	JButton remove = new JButton("Remove");
	JButton save = new JButton("Save");
	JButton load = new JButton("load");
	JLabel text = new JLabel();

	public static void main(String[] args) {
		To_Do_List_Tracker to = new To_Do_List_Tracker();
		to.GUI();
	}

	void GUI() {
		jF.setVisible(true);
		jF.add(jP);
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jP.add(add);
		jP.add(remove);
		jP.add(save);
		jP.add(load);
		jP.add(text);
		add.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		jF.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			task = JOptionPane.showInputDialog(null, "Type in your task");
			text.setText(task);
		}
		if (e.getSource() == remove) {

		}
		if (e.getSource() == save) {

		}
		if (e.getSource() == load) {

		}

	}
}
