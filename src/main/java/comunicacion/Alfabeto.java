package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String[] getLetras() {
		return this.letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String toStringStr = "";
		
		for (String letra: this.letras) {
			toStringStr += letra + ", ";
		}
		
		return toStringStr;
	}

}
