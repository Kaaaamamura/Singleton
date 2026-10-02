package Factory;
// Logistica.java
// La clase base define el "esqueleto" del proceso y delega la creacion
// del transporte concreto a las subclases mediante el Factory Method.
public abstract class Logistica {

    public abstract Transporte crearTransporte();

    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        System.out.println("Planificando entrega...");
        transporte.entregar();
    }
}
