package view;

import br.juliarafaela.ListaInt.ILista;
import br.juliarafaela.ListaInt.Lista;

public class main {
	public static void main(String[] args) {
		ILista lista = new Lista();
		try {
			lista.addFirst("Pedro");
			lista.addLast("Caio");
			lista.add("Julia", 1);
			lista.add("Sofia", 3);
			lista.addFirst("Leo");
			String valor = (String) lista.get(2);
			System.out.println(valor);
			lista.removeFirst();
			lista.removeLast();
			lista.remove(1);
			valor = lista.get(0);
			System.out.println(valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
