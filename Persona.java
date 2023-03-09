import java.util.Random;

public class Persona {
	public String nombre; 
	public boolean lentes; 
	public boolean gorra; 
	public boolean barba; 
	public boolean cabello; 
	
	Random random = new Random(); 
	int randomNum = random.nextInt(10); 
	boolean lentesBoo = random.nextBoolean(); 
	boolean gorraBoo = random.nextBoolean(); 
	boolean barbaBoo = random.nextBoolean(); 
	boolean cabelloBoo = random.nextBoolean(); 
	
	public Persona(int nombre, boolean lentesBoo, boolean gorraBoo, boolean barbaBoo, boolean cabelloBoo) {
		this.lentes = lentesBoo; 
		this.gorra = gorraBoo; 
		this.barba = barbaBoo; 
		this.cabello = cabelloBoo; 
		
	}
	
	public boolean getlentes() {
		return lentes; 
	}
	
	public boolean getgorra() {
		return gorra; 		
	}
	
	public boolean getbarba() {
		return barba; 
	}
	
	public boolean getcabello() {
		return cabello; 
	}
			
	
	
//}//Final
	
	
	/*private String name;
	private Boolean lentes; 
	private Boolean gorra; 
	private Boolean barba; 
	private Boolean cabello; 
	public Persona(String name, Boolean lentes, Boolean gorra, Boolean barba, Boolean cabello) {
		this.name = MainPersonas
	}*/
	
	
	
	
	
	int max; 
	int top; 
	public String[] stack; 
	
	public Persona(int stackSize) {
		this.stack = new String [ stackSize]; 
		this.max = this.stack.length; 
		this.top = 0; 
	}
	
	public String Push(String value) {
		if (top == max) {
			System.out.println("FUERA !!!"); 
			return value; 
		}
		stack[top] = value;
		top++;
		return value; 				
	}
	}
