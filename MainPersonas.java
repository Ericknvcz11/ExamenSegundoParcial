import java.util.Random;

public class MainPersonas {
	public static void main(String[] args) {
		//RandomP people = new RandomP(); 
		//people.randomPerson();
		String nombre0; 
		String nombre1 = null;
		String nombre2;
		String nombre3;
		String nombre4;
		String nombre5;
		String nombre6;
		String nombre7;
		String nombre8;
		String nombre9;
		
		Persona person = new Persona(0); 
		person.getlentes();
 		
		String[] nombres = {"Livan", "Jesus", "Andre", "Eli", "Miguel", "Pablo", "Rosa", "Jony", "Ruba", "Fany"};
		int cantidad = 10, rango = nombres.length; 
		String arreglo[] = new String[cantidad]; 
		
		Random random = new Random();{
		arreglo[0] = nombres[random.nextInt(rango)];
		for(int i = 1; i < cantidad; i++) {
			arreglo[i] = nombres[random.nextInt(rango)]; 
			for(int j = 0; j < i; j++) {
				if(arreglo[i].equals(arreglo[j])) {
					i--; 
					break;
				}
			}
		}
		
		for(int k = 0; k < cantidad; k++) {
			//System.out.println(arreglo[k]); 
			Persona myStack = new Persona(20); 
			//for(int s = 0; s < myStack.stack.length; s++)
			//{
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				myStack.Push(arreglo[k]); 
				System.out.println(myStack.stack[k]); 	
				
				nombre1 = myStack.Push(arreglo[1]);
				
		//	}
		}
	}		
		//if(nombre1 == "Livan") {
			//System.out.println("Hola livan"); 
		//}
		String persona = null; 
		switch (nombre1) {
	    case "Livan":
	        System.out.println("Hoy es lunes");
	        break;
	    case "Jesus":
	        System.out.println("Hoy es martes");
	        break;
	    case "Andre":
	        System.out.println("Hoy es miércoles");
	        break;
	    case "Eli":
	        System.out.println("Hoy es jueves");
	        break;
	    case "Miguel":
	        System.out.println("Hoy es viernes");
	        break;
	    case "Pablo":
	        System.out.println("Hoy es sábado");
	        break;
	    case "Rosa":
	        System.out.println("Hoy es domingo");
	        break;
	    case "Jony":
	        System.out.println("Hoy es domingo");
	        break;
	    case "Ruba":
	        System.out.println("Hoy es domingo");
	        break;
	    case "Fany":
	        System.out.println("Hoy es domingo");
	        break;
	    default:
	        System.out.println("Valor inválido para día");
	        break;
	}
		
		
		//}
	}//Main	
}//Final