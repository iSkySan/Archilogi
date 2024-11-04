package exoFactory;

public class HTMLButton implements Button {
    String text;

    public void SetText(String text) {
        this.text = text;
    }
    public void render() {
        System.out.println("<button>" + this.text + "</button>");
    }

}
