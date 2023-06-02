package Lista;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class teste_3 {
	public static void main(String[] args)
	{
	try
	{
	OutputStream output = new FileOutputStream("/lixo/meuArquivobyte.txt");
	byte[] bytes = new byte[]
	{
	'A', 'B', 'D', 'E', 'F', 'G','H','I', 'J', (byte) 'Ç'
	};
	int count = bytes.length;
	while (count >= 0)
	{
	output.write(bytes);
	count--;
	}
	output.close();
	}
	catch (IOException e)
	{
	e.printStackTrace();
	}
	}

}
