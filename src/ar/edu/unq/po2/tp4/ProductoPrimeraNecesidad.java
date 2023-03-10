package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad {

	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	private double descuento;
	
	public ProductoPrimeraNecesidad(String string, double d, boolean b, double des) {
		super();
		this.setNombre(string);
		this.setPrecio(d);
		this.setEsPrecioCuidado(b);
		this.setDescuento(des);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getPrecio() {
		return this.precio * (1-(this.getDescuento()/100));
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	private boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	private void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	private double getDescuento() {
		return descuento;
	}

	private void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
