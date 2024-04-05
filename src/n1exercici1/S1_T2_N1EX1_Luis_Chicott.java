package n1exercici1;

public class S1_T2_N1EX1_Luis_Chicott {

	public static void main(String[] args) {
		
	
		Venta venta1 = new Venta(); 
		 
		 
		//Venta venta2 = new Venta("Harina", 5); 
		//Venta venta3 = new Venta("Aceite", 10); 
		
		  try {
	            venta1.calcularTotal();
	        } catch (VentaVaciaException e) {
	            System.out.println(e.getMessage());
	        }
		  
		  
		 System.out.println(venta1.getPrecioTotal()); 
	}
}
