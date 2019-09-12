package clases.trifulcas.com;

public class Bebida extends Producto {
	
	private Boolean alcohol;

	public Boolean getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}

	public Bebida(String nombre) {
		super(nombre);
		
	}

}
