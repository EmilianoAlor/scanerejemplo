import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nombre="Sin nombre";
		int edad=0;
		float altura=0;
		float peso=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la persona");
		Nombre = sc.nextLine();
		
		boolean sen = false;
		
		do {
			try {
				System.out.println("Ingrese la edad de la persona");
				edad = sc.nextInt();
				sen = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("La edad es incorrecta vuelva a ingresarla.");
				sc.next();
			}
		}while (!sen);
		
		
		sen = false;
		
		do {
			try {
				System.out.println("Ingrese la altura de la persona");
				altura = sc.nextFloat();
				
				if(altura==0 )
					 throw new Exception("Esta es una excepción intencional. altura igual a cero");
				if(altura<0 )
					 throw new Exception("Esta es una excepción intencional. altura menor a cero");
				sen = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("La altura es incorrecta vuelva a ingresarla.");
				sc.next();
			}
		}while (!sen);
			
		sen = false;
		
		do {
			try {
				System.out.println("Ingrese el  peso de la persona");
				peso = sc.nextFloat();
				sen = true;
				
				if(peso<0 )
					 throw new Exception("Esta es una excepción intencional. peso menor a cero");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("el peso es incorrecta vuelva a ingresarla.");
				sc.next();
			}
		}while (!sen);
			
		sen = false;
		
		Persona p1;
		

		p1 = new Persona(Nombre, edad, altura, peso);
	
		
		System.out.println("Persona 1:\n" + p1.toString());
		System.out.println("Persona 1:\nEstado:" + p1.DevolverIndice() + " -- Valor del indice:" + p1.getIndice());
	}
}
