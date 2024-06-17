

import java.util.Scanner;
public class chatGPTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Ingrese el primer número: ");
	    int num1 = leerNumero(scanner);
	    System.out.println("Ingrese el segundo número: ");
	    int num2 = leerNumero(scanner);
	    System.out.println("Ingrese el tercer número: ");
	    int num3 = leerNumero(scanner);

	    int mayor = mayorDeTres(num1, num2, num3);
	    System.out.println("El número mayor es: " + mayor);
	    System.out.println("git ");
	}

	 public static int mayorDeTres(int a, int b, int c) {
		    int mayor = a;
		    if (b > mayor) {
		      mayor = b;
		    }
		    if (c > mayor) {
		      mayor = c;
		    }
		    return mayor;
		  }
	 
	 public static int leerNumero(Scanner scanner) {
		    while (!scanner.hasNextInt()) {
		      System.out.println("Por favor ingrese un número válido");
		      scanner.next();
		    }
		    return scanner.nextInt();
		  }
}


/*
 * 
  driver.findElement(By.id("user-name")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.className("btn_action")).click();
if (driver.findElement(By.className("product_label")).isDisplayed()) {
    System.out.println("Inicio de sesión exitoso");
 * */
