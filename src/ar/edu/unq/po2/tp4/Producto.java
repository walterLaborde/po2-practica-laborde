package ar.edu.unq.po2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	public Producto(String string, double d, boolean b) {
		super();
		this.setNombre(string);
		this.setPrecio(d);
		this.setEsPrecioCudado(b);
	}

	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected double getPrecio() {
		return this.precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	protected boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	private void setEsPrecioCudado(boolean esPrecioCudado) {
		this.esPrecioCuidado = esPrecioCudado;
	}

	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio()+d);
	}

}
