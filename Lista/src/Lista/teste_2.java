package Lista;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;

public class teste_2 {
public static void main(String[] args) {
	try {
		OutputStream output = new FileOutputStream("/lixo/meuArquivo.txt");
		String s ="ABCDEFGHIJ";
		int count = 0;
		while(count <= (s.length() - 1)) {
			output.write(s.charAt(count));
			count++;
		}
		output.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
