package n1exercici1;


public class Producto {

	private String nombre; 
	private int precio;
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre; 
		this.precio = precio; 
	}
	

	// Getter
	  public String getNombre() {
	    return this.nombre;
	  }
	  
	  public int getPrecio() {
		    return this.precio;
		  }
	  
	  // Setter
	  public void setNombre(String nombre) {
		  this.nombre = nombre;
	  }
	  
	  public void setPrecio(int precio) {
		  this.precio = precio;
	  }
	  
	  @Override
	    public String toString() {
	        return "Producto: " + nombre + " Precio: " + precio;
	    }
}
