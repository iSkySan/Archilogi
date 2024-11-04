package exoFactory;

public class WindowsButton implements Button {

    String text;

    public void SetText(String text) {
        this.text = text;
    }
    public void render() {
        System.out.println("|" + this.text + "|");
    }
}
