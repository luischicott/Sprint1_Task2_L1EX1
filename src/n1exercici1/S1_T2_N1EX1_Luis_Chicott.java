package n1exercici1;

public class S1_T2_N1EX1_Luis_Chicott {

	public static void main(String[] args) {
		
	
		Venta venta1 = new Venta("Harina", 10); 
		Venta venta2 = new Venta("Aceite", 20);
		 
		 
		 try {
		 System.out.println(venta2.calcularTotal());
		 } catch (Exception e) {
			System.out.println(e.getMessage()); 
		 }
		 
	}
}
