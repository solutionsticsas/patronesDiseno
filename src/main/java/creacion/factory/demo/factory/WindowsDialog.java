package creacion.factory.demo.factory;

import creacion.factory.demo.buttons.Button;
import creacion.factory.demo.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}