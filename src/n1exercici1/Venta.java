package n1exercici1;

import java.util.ArrayList;

public class Venta {
	
	private static ArrayList<Producto> productos = new ArrayList<Producto>();  
	private int precioTotal; 
	
	
	public Venta(String nombre, int precio) {
		productos.add(new Producto(nombre, precio)); 
	}
	
	
	public int calcularTotal() throws VentaVaciaException {
		
		try {
			
			for(int i = 0; i <= productos.size(); i++) {
			
				precioTotal =  productos.get(i).getPrecio() + precioTotal; 	
			} 
		
		}catch (Exception e){
			
			
			throw new VentaVaciaException("Error: la lista de productos está vacía."); 
		}
		
		return precioTotal; 	
	}
	
	
}

 class VentaVaciaException extends Exception {
	 
	 public VentaVaciaException() {}
	 
	public VentaVaciaException(String mensaje_error) {
		 super(mensaje_error); 
	 } 
	
 }
