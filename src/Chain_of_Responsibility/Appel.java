package Chain_of_Responsibility;

public class Appel {
    private int level = 0;
    private String message = "";

    public Appel(int level, String message) {
        this.level = level;
        this.message = message;
    }

    public int getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

}
