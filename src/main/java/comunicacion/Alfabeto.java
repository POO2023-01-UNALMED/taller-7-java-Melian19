package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letra, String interpreta) {
		super(origen);
		letras = letra;
		interpretacion = interpreta;
	}
	
	//get y set
	
	public void setLetras(String[] letra) {
		letras = letra;
	}
	public String[] getLetras(){
		return letras;
	}
	public void setInterpretacion(String interpreta) {
		interpretacion = interpreta;
	}
	public String getInterpretacion() {
		return interpretacion;
	}

	//metodos abstractos
	
	public String interpretacion() {
		return getInterpretacion();
	}
	public String toString() {
		String alfabeto = "";
		for (int i = 0; i < letras.length; i++) {
			if(i != letras.length -1) {
				alfabeto += letras[i] + ", ";
			}else {
				alfabeto += letras[i];
			}
		}
		return alfabeto;
	}
	
	// metodos propios
	
	public int cantidadLetras() {
		return letras.length;
	}

}
