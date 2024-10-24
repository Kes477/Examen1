package Clases;
import java.util.Date;

public class ProductoAlimenticio extends Producto {
 private Date fecha_expiracion;

public ProductoAlimenticio(String nombre, double precio, double stock, Date fecha_expiracion) {
	super(nombre, precio, stock);
	this.fecha_expiracion = fecha_expiracion;
}
 
 
 
}
