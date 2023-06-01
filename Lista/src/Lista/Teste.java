package Lista;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args)
	{
	Scanner teclado = new Scanner(System.in);
	String caminho = "c:\\lixo\\tabuada.txt";
	int i, n;
	
	System.out.printf("Informe o número para a tabuada:\n");
	n = teclado.nextInt();
	
	FileWriter arq;
	arq = null;
	
	try
	{
	arq = new FileWriter(caminho);
	PrintWriter gravarArq = new PrintWriter(arq);
	gravarArq.printf("+--Resultado--+%n");
	for (i=1; i<=10; i++)
	{
	gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
	}
	gravarArq.printf("+-------------+%n");
	try
	{
	arq.close();
	}
	catch (IOException e)
	{
	System.out.printf("Erro na tentativa de fechar o arquivo " + caminho + "\n");
	}
	System.out.printf("\nTabuada do %d foi gravada com sucesso em " + caminho + "\n", n);
	}
	catch (IOException e)
	{
	System.out.printf("Erro na tentativa de criar o arquivo " + caminho + "\n");
	}
	}

}
