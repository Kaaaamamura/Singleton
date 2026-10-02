package AbstractFactory;

// CheckboxWindows.java
public class CheckboxWindows implements Checkbox {
    @Override
    public void renderizar() {
        System.out.println("Renderizando checkbox estilo Windows.");
    }
}
