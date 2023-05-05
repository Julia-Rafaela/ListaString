package br.juliarafaela.ListaInt;

public interface ILista {
	
	public boolean isEmpty();
	public int size();
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public String get(int pos) throws Exception;
	void addLast(String valor) throws Exception;
	void add(String valor, int pos) throws Exception;
	void addFirst(String valor);	
}
