package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Copyright {
	public static void main(String[] args) {
		String Name = "";
		JFileChooser jfc = new JFileChooser();
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			Name = jfc.getSelectedFile().getAbsolutePath();
		}
		try {
			FileWriter fw = new FileWriter(Name, true);
			fw.write("\n //Copyright © 2017 by Bill Jobs");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
