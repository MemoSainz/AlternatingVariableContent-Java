
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("I'm going to demonstrate how someone can change the content of the variable to another.");


        int num1 = 40;
        int num2 = 20;
        int aux;
        System.out.println("----------Antes-----------");
        System.out.println("----------Before-----------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);


        aux = num2;

        num2 = num1;
        num1 = aux;

        System.out.println("----------Después-----------");
        System.out.println("----------After-----------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);




    }
}