package observer;

public class TemperatureDisplay implements Observer {
    @Override
    public void actualizar(int temperatura) {
        System.out.println("La temperatura es " + temperatura + " grados");
    }
}
