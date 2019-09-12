package clases.trifulcas.com;

public class Producto  implements Precios {

	private String nombre;
	private String referencia;
	private Double precio;
	private Double IVA=.21;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Producto(String nombre) {
		this.nombre = nombre;
	}
	
	public Double PVP() {
		return precio*(1+IVA);
	}
}
