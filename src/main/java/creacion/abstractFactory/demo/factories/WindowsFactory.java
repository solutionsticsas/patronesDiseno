package creacion.abstractFactory.demo.factories;

import creacion.abstractFactory.demo.buttons.Button;
import creacion.abstractFactory.demo.buttons.WindowsButton;
import creacion.abstractFactory.demo.checkboxes.Checkbox;
import creacion.abstractFactory.demo.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
