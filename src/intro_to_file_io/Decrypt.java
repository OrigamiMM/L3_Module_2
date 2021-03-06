package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Decrypt {
	public static void main(String[] args) {
		String Name = "";
		String M = "";
		String newM = "";
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
			M = line;
			while (line != null) {
				System.out.println("Encrypted: " + line);
				line = br.readLine();
				
			}
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < M.length(); i++) {
			int c = M.charAt(i) - 1;
			newM += (char) c;
		}
		System.out.println();
		System.out.println("Decrypted Message: " + newM);
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3_de.txt");
			fw.write(newM);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
