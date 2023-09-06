import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le premier nombre: ");
        float num1 = input.nextFloat();
        System.out.print("Entrez le deuxième nombre: ");
        float num2 = input.nextFloat();
        System.out.println("Somme: " + calc.additionner(num1, num2));
        System.out.println("Différence: " + calc.soustraire(num1, num2));
        System.out.println("Produit: " + calc.multiplier(num1, num2));
        System.out.println("Division: " + calc.diviser(num1, num2));
    }
}