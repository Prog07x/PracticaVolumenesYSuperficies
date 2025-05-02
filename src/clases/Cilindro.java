package clases;

public class Cilindro {
	
	int radio;
	int altura;
	
	/****
	 * Constructor sin parametros que inicializa a 1
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/****
	 * Constructor que recibe altura y radio.
	 * @param r
	 * @param alt
	 */
	public Cilindro(int r, int alt) {
		this.radio = r;
		this.altura = alt;
	}
	
	/****
	 * Metodo que devuelve la superficie
	 * @return int
	 */
	public int superficie() {
		return (int)(2*3.14*radio*radio+
				2*3.14 * this.radio * this.altura);
	}
	
	/****
	 * metodo que devuelve el volumen de un cilindro
	 * @return int
	 */
	public int volumen() {
		return (int)(this.altura * 3.14*radio*radio);
	}

}
