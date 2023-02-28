package creacion.abstractFactory.demo.factories;

import creacion.abstractFactory.demo.checkboxes.Checkbox;
import creacion.abstractFactory.demo.buttons.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}