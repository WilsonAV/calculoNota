import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String sair = "Sim";
        Scanner sc;
        do {
            System.out.print(" Digite a nota ");
            sc = new Scanner(System.in);
            int nota = sc.nextInt();

            if (nota > 40) {

                int proxMultiplo = (int) Math.ceil(nota / 5.0) * 5;
                int diferencaNota = proxMultiplo - nota;

                nota = diferencaNota < 3 ? proxMultiplo : nota;
            }
            
            System.out.println("Sua Nota e: " + nota);
            System.out.println("Digite Sim para sair: ");
            sair = sc.next();
            
        }while (!sair.equals("Sim"));
        sc.close();

    }
}