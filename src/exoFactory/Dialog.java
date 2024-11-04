package exoFactory;

public abstract class Dialog implements ButtonFactory{
    public void render() {
        Button okButton = createButton();
        okButton.SetText("OK");
        okButton.render();

        Button annulerButton = createButton();
        annulerButton.SetText("Annuler");
        annulerButton.render();
    }
}

