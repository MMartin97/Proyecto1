
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		return x + y;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		return x - y;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		return x * y;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		return x % y;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{
	 if(x % 2 != 0)
		  
		return false;
		
		
		return true;
	  
	}
	
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		x = 4;
		if (x % 3 != 0)
		return false;
		
		
		return true;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if(x>y)
		
		return x;
		
		return y;
		
		
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		if(edad>=18)
		
			return true;
		
			return false;
		
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		if(x % 2 != 0)
			
		if(y % 2 != 0)
			
		if(z % 2 != 0)
			
		return false;
		
		return true;
		
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if (x > y)
			
		if (x > z)
			
			return x;
		
		if (y > x)
		
		if (y > z)	
		
			return y;
		
		
			return z;
		
		
	}
	
	public static void main(String[] args)
	{
		
	}

}
