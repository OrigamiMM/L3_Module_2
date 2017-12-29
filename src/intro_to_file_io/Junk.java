package intro_to_file_io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Junk {
	
public static void main(String[] args) {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	String m = JOptionPane.showInputDialog("Type in Anything");
	jf.add(jp);
	jf.setVisible(true);
	jf.pack();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton jb = new JButton(m);
	jp.add(jb);
}
}

 //Copyright © 2017 by Bill Jobs