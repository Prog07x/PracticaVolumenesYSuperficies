package clases;

public class Cubo {
	
	int lado;
	
	/****
	 * Contructor que recibe el lado.
	 * @param lado
	 */
	public Cubo(int lado){
		this.lado = lado;
	}
	
	/****
	 * Contructor vacio que inicializa a 1 el lado.
	 */
	public Cubo() {
		this.lado = 1;
	}
	
	/****
	 * Metodo que devuelve la superficie.
	 * @return int 
	 */
	public int superficie() {
		return this.lado*this.lado*6;
	}
	
	/****
	 * Metodo que devuelve un int del volumen del cubo.
	 * @return int
	 */
	public int volumen() {
		return (int)(lado*lado*lado);
	}
	

}
