package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
	public Supermercado(String string, String string2) {
		this.setNombre(string);
		this.setDireccion(string2);
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private ArrayList<Producto> getProductos() {
		return productos;
	}

	public void agregarProducto(Producto p) {
		this.getProductos().add(p);
	}

	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public Double getPrecioTotal() {
		return this.getProductos()
				   .stream()
				   .collect(Collectors.summingDouble(Producto::getPrecio));
	}
}
