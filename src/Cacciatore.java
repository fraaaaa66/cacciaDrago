public class Cacciatore {
    public void colpisciDrago(Thread drago) {
        System.out.println("\n[CACCIATORE] Scaglio una freccia verso il drago!");
        drago.interrupt(); // Interrompe il thread del drago
    }
}