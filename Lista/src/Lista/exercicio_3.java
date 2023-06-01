package Lista;
import java.util.*;

public class exercicio_3 {


		public static void main(String[] args) {

			List<String> lista = new ArrayList<String>();
			
			lista.add("aaa");
			lista.add("ddd");
			lista.add("bbb");
			
			System.out.println(lista);
			Collections.sort(lista);
			System.out.println(lista);
			
	}
}
