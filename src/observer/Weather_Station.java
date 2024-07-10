package observer;

import java.util.ArrayList;
import java.util.List;

public class Weather_Station implements Subject {
    private List<Observer> observadores;
    private int temperatura;

    public Weather_Station() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(temperatura);
        }
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}
