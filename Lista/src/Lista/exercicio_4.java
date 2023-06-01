package Lista;
import java.util.*;

public class exercicio_4  implements Comparable<exercicio_4>{
	private String nome;
	private String curso;
	double nota;

	exercicio_4(String nome, String curso, double nota){
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	public int compareTo(exercicio_4 aluno) {
		return this.nome.compareTo(aluno.getNome());
		
	}

	public String toString() {
		String informacao = null;
		informacao = this.nome + "(" + this.curso + ")" + this.nota;
		return informacao;
	}
	
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
