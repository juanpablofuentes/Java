package clases.trifulcas.com;

public class Servicios implements Precios {

	private String nombre;
	private Double Precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	@Override
	public Double PVP() {
		// TODO Auto-generated method stub
		return Precio*1.1;
	}
	
}
