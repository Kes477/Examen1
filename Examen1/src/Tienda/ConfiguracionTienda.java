package Tienda;

public class ConfiguracionTienda {
 private String nombreTienda;
 private String direccion;
 private String moneda;
 private String espacio;
 
 private static ConfiguracionTienda instanciaUnica;
 
private ConfiguracionTienda() {
	System.out.println("Instancia creada");
}
 
public static ConfiguracionTienda modificador() {
	if(instanciaUnica==null) {
		instanciaUnica = new ConfiguracionTienda();	
	}
	else {
		System.out.println("YA");			
	}
	return instanciaUnica;	
}
 
}
