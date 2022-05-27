package pruebaTecnica;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioNumeroDos {

	public static void main (String[] args) {
	
		//Se declara y se utiliza el TreeMap para ordenar de forma natural
		Map<Integer, String> estudiante = new TreeMap<Integer, String>();
		
		//Se utiliza metodo put para ingresar los valores
		estudiante.put(80, "Matematicas");
		estudiante.put(35, "Ciencias");
		estudiante.put(41, "Sociales");
		estudiante.put(67, "Algebra");
		estudiante.put(73, "Ingles");

		//Se declara iterador para recorrer 
		Iterator<Integer> it = estudiante.keySet().iterator();
		
		while(it.hasNext()){
			  //Se utiliza el next para guardar el valor y analizar el siguiente 
			  Integer calificacion = (Integer) it.next();
			  System.out.println("La calificaion es: " + calificacion + " para la materia: " + estudiante.get(calificacion));
		}
	}
}