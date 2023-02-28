package creacion.factory.demo.factory;

import creacion.factory.demo.buttons.Button;
import creacion.factory.demo.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        imprime();
        return new HtmlButton();
    }

    public void imprime(){
        System.out.println("imprime un extra");
    }


}