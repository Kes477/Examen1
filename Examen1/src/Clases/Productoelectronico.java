package Clases;

public class Productoelectronico extends Producto {
 private int garantia;

public Productoelectronico(String nombre, double precio, double stock, int garantia) {
	super(nombre, precio, stock);
	this.garantia = garantia;
}

	
}
