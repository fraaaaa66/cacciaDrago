import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di battiti d'ali per il drago: ");
        int battiti = scanner.nextInt();

        // Creazione e avvio del thread Drago
        Drago dragoRunnable = new Drago(battiti);
        Thread threadDrago = new Thread(dragoRunnable);
        threadDrago.start();

        // Creazione del Cacciatore
        Cacciatore cacciatore = new Cacciatore();

        // Ciclo del main per osservare il drago
        for (int i = 1; i <= battiti; i++) {
            System.out.println("Main: Sto osservando il drago (battito " + i + ")");

            try {
                Thread.sleep(200); // Sleep nel main
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Il cacciatore colpisce il drago a metà percorso
            if (i == battiti / 2) {
                cacciatore.colpisciDrago(threadDrago);
            }
        }

        scanner.close();
    }
}
