import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero 1");
        numero1=scanner.nextInt();
        System.out.println("Ingresa el numero 2");
        numero2=scanner.nextInt();

        System.out.println("Select the operation that you want/Ingresa la operacion a hacer");
        System.out.println("1-Suma-Add up");
        System.out.println("2-Resta-Rest");
        System.out.println("3-Multiplicacion-Multiplication");
        System.out.println("4-Divicion/Division");
        int operacion = scanner.nextInt();

        switch (operacion){
            case 1:
                System.out.println("La suma es->"+(numero1+numero2));
                break;
                case 2:
                    System.out.println("La resta es->"+(numero1-numero2));
                break;
            case 3:
                System.out.println("La multiplicacion es->"+numero1*numero2);
                break;
                case 4:
                    System.out.println("La divicion es->"+numero1/numero2);
                break;

        }
    }
}
