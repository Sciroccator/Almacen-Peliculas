package vista;

import java.util.Scanner;

import modelo.Peliculas;

public class PantallaInicio {
	
	
	
	
	
	
	
	public static void arrancalaPalanca() { // Metodo para iniciar el menu del programa

		Scanner sc = new Scanner(System.in); // recogida de datos con scanner

		int opcion ;   // registra la opcion elegida
          boolean bandera = false;  // le da salida del while
		
		
		
		
		
		Peliculas pel = new Peliculas(); // objeto peliculas que inicia el ArrayList y permite el aceso a la clase

	
			do {  // do while  para ciclar el menu de inicio
				
				try {   // try para controlar las excepciones numericas de la seleccion de el menu

				 
				
				
					
					// Menu de inicio .......que "Gonito" a quedado....... 
				System.out.println("*************************************************");
				System.out.println("**             MENU PELICULAS                  **");
				System.out.println("*************************************************");
				System.out.println("");
				System.out.println("Opcion 1/                          Insertar película");
				System.out.println("");
				System.out.println("Opcion 2/                     Extraer datos película");
				System.out.println("");
				System.out.println("Opcion 3/      Numero total de peliculas Almacenadas");
				System.out.println("");
				System.out.println("Opcion 4/  Imprimir todas los datos de las Peliculas");
				System.out.println("");
				System.out.println("Opcion 5/                                   SALIR");
				System.out.println("");

				System.out.println("*****************************************************");
				System.out.println("");
				System.out.println("       ELIJA UNA OPCION Y PULSE 'INTRO'   ");
				System.out.println("");
				System.out.println("");
				
				opcion = sc.nextInt();  // recogemos la opcion elegida
				
				switch (opcion) {    // Abrimos un Switch para gestionar la elección
				
				case 1:{
					
					
					pel.insertarPelicula();  // llamamos al metodo insertarPelicula
					
					
					
					break;
					
				
				   }
				case 2 :{
					
					
					pel.datosPelicula();  // llamamos al metodo datosPelicula
					
					break;
				}
				
				
				case 3 :{
					
					
					pel.contaPelis();   // llamamos al metodo  contaPelis
					
					break;
					
					
				}
				case 4 :{
					
					
					pel.imprimirPeliculas(); // llamamos al metodo ImprimirPeliculas
					
					
					break;
				}
				
				case 5:{
					bandera = true;  // Salida del Programa
					System.out.println("Hasta luego Guapiiiii");
					;
					break;
					
				}
				default:{
					              // recogemos las opciones numericas incorrectas
					System.out.println(" Marque una opcion Correcta");
					break;
				}
				
		      }
				 // borra pantalla
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  
				
				
			} catch (Exception e) { // recogemos las opciones no numericas que generan una excepcion

				System.out.println(" Error Elija una opcion Numérica correcta");
			     sc.nextLine();
             
			
				
			}
	

			} while (bandera == false); // condicion del while

	
			
			
			sc.close(); // cerramos scaner
	}

}
