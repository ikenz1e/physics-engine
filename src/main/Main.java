package main;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();

        window.setUpWindow();
        window.getMainPanel().startThread();
    }
}
