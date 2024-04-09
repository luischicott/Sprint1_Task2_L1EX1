package n1exercici1;

import java.util.ArrayList;

public class Venta {
	
	private static ArrayList<Producto> productos = new ArrayList<Producto>();  
	private static int precioTotal; 
	
	
	public Venta() {}; 
	
	public Venta(String nombre, int precio) {
		productos.add(new Producto(nombre, precio)); 
	}; 
	
	
	public int calcularTotal () throws VentaVaciaException{
		
		 if (productos.isEmpty()) {
		        throw new VentaVaciaException("Para hacer una venta primero debes agregar productos.");
		 }

		for(int i = 0; i < productos.size(); i++) {
			
			precioTotal =  productos.get(i).getPrecio() + precioTotal; 	
		} 
		
		return precioTotal; 	
	}
	
	public int getPrecioDeUnProducto(int producto) {
		
		return productos.get(producto).getPrecio(); 
	}
	
	public int getPrecioTotal() {
		return precioTotal;
	}
	
	 @Override
	  public String toString() {
	   StringBuilder sb = new StringBuilder();
	    sb.append("Productos vendidos: \n");
	    for (Producto producto : productos) {
	        sb.append(producto.toString()).append("\n");       
	    }
	    return sb.toString();
	 }


	
	
}

 