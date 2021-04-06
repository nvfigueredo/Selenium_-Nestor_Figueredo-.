import java.util.Scanner;

public class Ejercicio3 {
    public static int mostrarDoble(int num) {
        return (num * 2);
    }

// PRUEBA DE METODO "mostrarDoble"

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num = input.nextInt();

        System.out.println("El doble de su numero es: " + mostrarDoble(num));


    }
}

