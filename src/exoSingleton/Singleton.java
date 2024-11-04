package exoSingleton;

public class Singleton {
    String message = "Hello world!";
    static Singleton instance = null;

    private Singleton() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    final public void SetMessage(String message) {
        this.message = message;
    }
    final public  String GetMessage() {
        return this.message;
    }

}

