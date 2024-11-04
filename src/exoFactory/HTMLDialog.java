package exoFactory;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }

}
