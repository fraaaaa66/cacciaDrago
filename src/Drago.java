public class Drago implements Runnable {
    private int battiti;

    public Drago(int battiti) {
        this.battiti = battiti;
    }

    @Override
    public void run() {
        for (int i = 1; i <= battiti; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Drago: Sono stato colpito! Muoio definitivamente...");
                return;
            }
            System.out.println("Drago: Volo... battito d'ali " + i);
        }
        System.out.println("Drago: Volo completato in sicurezza!");
    }
}