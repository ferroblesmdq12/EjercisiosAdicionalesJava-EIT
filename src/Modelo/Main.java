package Modelo;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/* EJERCISIO ADICIONAL - EDUCACION IT */

/**********************************************
 * By Fernando Robles
 * 
 * 
 * 
 **********************************************/

public class Main {

	public static void main(String[] args) {
		
		// Carga lista de Prendas //
		
//		Scanner scanner = new Scanner(System.in);
		
			List<Prenda> prendas = new ArrayList<>();
			
			prendas.add(new Prenda(1, "pantalon", 580.22));
			prendas.add(new Prenda(2, "remera", 456.78));
			prendas.add(new Prenda(3, "medias", 52.36));
			prendas.add(new Prenda(4,"Buzo",322.96));
			
			
			System.out.println("Prendas: ");
			
			for(Prenda Prenda : prendas)
			{
				System.out.println(Prenda.getIdPrenda()+ ", "+ Prenda.getNombrePrenda() + ", " + Prenda.getPrecioUnitario());
			}

			
		// Calculo Cotizacion //
			
//			public Cotizacion realizarCotizacion(Prenda prenda, int cantidad)
//			{
//				Cotizacion idCotizacion = historialCotizaciones.size() + 1;
//				
//				
//			}
//			
			
			

	}

}
