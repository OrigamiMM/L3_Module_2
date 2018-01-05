package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class To_Do_List_Tracker implements ActionListener {
	ArrayList<String> tasks = new ArrayList<String>();
	ArrayList<String> loadedtask = new ArrayList<>();
	String task = "";
	JFrame jF = new JFrame("To Do List");
	JPanel jP = new JPanel();
	JButton add = new JButton("Add");
	JButton remove = new JButton("Remove");
	JButton save = new JButton("Save");
	JButton load = new JButton("load");
	String Name = "";

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
			String tk = JOptionPane.showInputDialog(null, "Type in your task");
			tasks.add(tk);
			System.out.println(tk);
		}
		if (e.getSource() == remove) {
			String rem = JOptionPane.showInputDialog("What was the task you wanted to remove?");
			int i = 0;
			for (String task : tasks) {
				if (task.contains(rem)) {
					System.out.println("Removed: " + tasks.get(i));
					tasks.remove(i);
				} else {
					System.out.println(task);
				}
				i = i + 1;
			}
		}
		if (e.getSource() == save) {
			String Name = JOptionPane.showInputDialog("Name your file (No Spaces)");
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/" + Name + ".txt");
				for (String Task1 : tasks) {
					fw.write(Task1 + "\n");
				}
				fw.close();
			} catch (IOException y) {
				y.printStackTrace();
			}
		}
		if (e.getSource() == load) {
			JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String fileName = jfc.getSelectedFile().getAbsolutePath();
				System.out.println(fileName);
				Name = fileName;
			}
			try {
				BufferedReader br = new BufferedReader(new FileReader(Name));
				System.out.println();
				String line = br.readLine();
				loadedtask.add(line);
				while (line != null) {
					line = br.readLine();
					loadedtask.add(line);
				}

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException y) {
				// TODO Auto-generated catch block
				y.printStackTrace();
			}
			for (int i = 0; i < loadedtask.size()-1; i++) {
				System.out.println(loadedtask.get(i));
			}
		}

	}
}
