package Lista;
import java.util.*;
import Lista.exercicio_4;

public class exercicio_4_1 {
	public static void main(String[] args) {
		
		List<exercicio_4> lista = new ArrayList<exercicio_4>();
		
		exercicio_4 a = new exercicio_4 ("aaa", "sss", 6);
		exercicio_4 b = new exercicio_4 ("vvv", "yyy", 6);
		exercicio_4 c = new exercicio_4 ("ddd", "vvv", 9);
		
		Collections.sort(lista);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
	}
}
