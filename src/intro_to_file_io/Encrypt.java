package intro_to_file_io;


import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encrypt {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog(null, "Type a Message");
		String newMessage = "";
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < message.length(); i++) {
			int c = message.charAt(i)+1;
			newMessage += (char)c;
		}
		System.out.println(newMessage);
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3_en.txt");
			fw.write(newMessage);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
