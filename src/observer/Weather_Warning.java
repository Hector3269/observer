package observer;

public class Weather_Warning implements Observer {
    private static final int Alvertencia = 30;

    @Override
    public void actualizar(int temperatura) {
        if (temperatura > Alvertencia) {
            System.out.println("advertencia la temperatura es mayor al limite  " + Alvertencia + " grados");
        }
    }
}