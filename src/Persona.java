
public class Persona {

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	String Nombre;
	int edad;
	float altura;
	float peso;
	
	public Persona(String nombre, int edad, float altura, float peso) {
		super();
		Nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}
	
	float indice;
	
	public float getIndice() {
		return indice;
	}


	public void setIndice(float indice) {
		this.indice = indice;
	}


	public String DevolverIndice()
	{
			indice = peso / (altura*altura);

		if (indice < 18.5)
			return "Por debajo";
		else
		{
			if (indice< 24.9)
				return "Normal";
			else
			{
				if (indice< 29.9)
					return "Sobrepeso";
				else
				{
					return "OBESO";
				}
			}
		}
		
	}
	
	@Override
	public String toString()
	{
		return "Nombre=" + Nombre + " - Edad=" + edad + "-Altura=" + altura + "-Peso=" + peso;
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	
	
	
	
	
}
