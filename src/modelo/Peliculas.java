package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Peliculas {
	
	
	// Atributos clase Peliculas
	
	
	
	private String titulo;
	private int duracion;
	private String protagonista;
	private String idioma;
	 
	ArrayList <Peliculas> pelis ;
	private int indice  = 0;

	
	// constructor clase peliculas vacio

	public Peliculas() {
		
		this.pelis = new ArrayList<>();
	}


	
	// constructor con Atributos
	
	
	public Peliculas(String titulo, int duracion, String protagonista, String idioma) {
		
		this.titulo = titulo;
		this.duracion = duracion;
		this.protagonista = protagonista;
		this.idioma = idioma;
	}
	
	// Metodo para insertar Peliculas en Arraylist
	
	 public void insertarPelicula() {
		 
		 
		
		
		 Scanner sc = new Scanner(System.in); // Scanner para recibir datos
		 String titulo;
		 String protagonista;    // variables para recoger los datos
		 String idioma;
		 int duracion;
		 String pag;
		 boolean bandera = false;
		 
		//recogida de datos con Scanner
		 
		 
		 System.out.println("Introduzca el Titulo de la película"); 
		 titulo = sc.nextLine();                                          
		 
		 System.out.println("Introduzca el Nombre del protagonista");    
		 protagonista = sc.nextLine();
		 
		 System.out.println("Indique el idioma de la Película");	
		 idioma= sc.nextLine();
		 
		 
		 while(bandera == false) { // while para controlar que el dato duracion se recoge correctamente
			 
			 
		 System.out.println("Indique la duración de la pelicula el minutos");
		 
		 
		 try {   // controlamos que no se rompa el programa recogiendo la posible excepcion
		 
		 duracion = sc.nextInt();
		 
		 
		 /* Creamos un objeto Peliculas con Atributos y lo guardamos en el Arraylist "pelis"
		  le añadimos un indice con la variable "indice"*/
		 
		 pelis.add(indice, new  Peliculas(titulo,duracion,protagonista,idioma));
		 
		 // aumentamos el indice para la siguiente pelicula
		 indice ++;
		 // bandera a True para salir del while
		 bandera = true;
		 sc.nextLine();
		 
		 System.out.println("Pelicula Insertada  Correctamente ");
         System.out.println("");
		 System.out.println("Pulse ENTER para seguir");
          
		  pag = sc.nextLine();
		 
		 
		 
		 // si salta la excepcion se recoge y se avisa al usuario , se entra de nuevo en el while
		 }catch(Exception e) {
			 
			System.out.println("Introduzca un valor correcto en la Duracion de la pelicula");
			System.out.println("Pulse INTRO  para seguir");
			
			pag = sc.nextLine();
			 
			 
		   }
		
		 }
		 
		 
		
	}      
	 
	 public void datosPelicula() {
		 // Metodo para imprimir los datos de una pelicula en concreto
		
		  
		 Scanner sc = new Scanner(System.in);  // variable para recoger datos
		 String nombre ;
		 String titulo;   // variables para recogida de datos 
		 String pag;
		 boolean find = false;
		 
		 
		 System.out.println("Introduzca el nombre de la pelicula ");
		 nombre = sc.next();    //recoge el nombre de la pelicula a buscar
		 
		 
		 
		 for (int i = 0; i< pelis.size(); i++) {  // iteramos la lista
		 
		 titulo = pelis.get(i).getTitulo();    // entramos a cada objeto almacenado
		   if (nombre.equalsIgnoreCase(titulo)) {   // si coincide el titulo con alguna pelicula entra en el if 
			   
			   pelis.get(i).informacion();  /* si entra en el if saca la informacion de esa pelicula llamando 
			                                   al metodo informacion()*/
			   find= true;
			   
		   }    
		     
		 
		 }
		 
		 
		 // si no encuentra silimitudes entra en el if
		 
		 if(find == false) {
			   System.out.println(" No se encuentra ninguna Pelicula con ese nombre ");
			   
			   }
		 
		 
         sc.nextLine(); // limpia buffer
		 
		 System.out.println("Pulse ENTER para seguir");   // para el programa para pulsar enter
          
		  pag = sc.nextLine();
		 
		 
	 }
	 
	  public void contaPelis() {  // metodo para decirnos las peliculas almacenadas
		  
		
		  
		  
		  
		  Scanner sc = new Scanner(System.in);
		  String pag;
		  
		
		 // se accede al total de las peliculas con .size() sobre la lista
		  
		  System.out.println(" El total de peliculas almacenadas son " + pelis.size());
		  
		  /* tambien se podria hacer llamano a la variable "indice" que utilizamos para dar de alta 
		  las peliculas */ 
		  // System.out.println(" El total de peliculas almacenadas son " + this.indice);
		  
		  
		  System.out.println("Pulse ENTER para seguir"); // paramos el programa para dar enter
           
		  pag = sc.nextLine();
		  
		  
		  
		  
		  
	  }  
	  
	  public void imprimirPeliculas() // metodo para imprimir los datos de todas las peliculas almacenadas
	  {
		
		  System.out.println("");

		  Scanner sc = new Scanner(System.in);
		  String pag;
		  
		  Iterator iter = pelis.iterator(); // iteramos la lista con la clase Iterator y creamos El objeto "Iter" 
		  
		  
		  while (iter.hasNext())// mientras Iter encuentre un objeto va a seguir en el while
		  {
			  
			 Peliculas pel =  (Peliculas)iter.next(); // pasamos de object a Películas el objeto encontrado
			 pel.informacion(); // llamamos al metodo informacion() que imprime la informacion de ese objeto
			  
			  	  
		  }
		  
		  
		  System.out.println("Pulse ENTER para seguir");  // paramos el programa para pulsar intro
          
		  pag = sc.nextLine();
		  
		  
	  }
	 
	 
	 
	  
	  
	  
	  
	 
	   public void informacion(){  //  metodo que imprime la informacion de un objeto Peliculas
		   
		  
		   System.out.println("******************************************");  
		   System.out.println("");
		   System.out.println(" Titulo de la Pelicula : " + this.titulo);
		   System.out.println(" Actor Principal : "+ this.protagonista);
		   System.out.println(" Idioma de la pelicula : " + this.idioma);
		   System.out.println(" Duracion de la pelicula : "+ this.duracion);
		   System.out.println("");
		   System.out.println("******************************************");  

		   
		   
	   }

                           //getters

	public String getTitulo() {
		return titulo;
	}



	public int getDuracion() {
		return duracion;
	}



	public String getProtagonista() {
		return protagonista;
	}



	public String getIdioma() {
		return idioma;
	}
	 
	   
	   
	 
	
	
	
}
