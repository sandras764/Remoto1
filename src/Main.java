import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int platosMenu = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int menuCompleto = 0;
        double total = 0;

        do{
            System.out.println("1 para el primer plato");
            System.out.println("2 para el segundo plato");
            System.out.println("3 para el postre");
            System.out.println("4 para pedir cuenta");
            System.out.println("Introduce que número quieres pedir:");
            platosMenu = scan.nextInt();

            switch (platosMenu) {
                case 1:
                    contador1 ++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    System.out.println("Cuenta pedida");
                    break;
                default:
                    System.out.println("Opción no valida");
            }

            if (contador1 > 0 && contador2 > 0 && contador3 > 0) {
                menuCompleto++;
                contador1--; contador2--; contador3--;
            }
        }while(platosMenu < 4);

        total = (menuCompleto * 20) + (contador1 * 8) + (contador2 * 10) +
                (contador3 * 5);

        if (total >= 51) {
            total -= total * 10 / 100;
        }
        System.out.println(total);
    }
}