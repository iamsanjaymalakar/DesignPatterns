package behavioral.observer;

public class List implements Observer {

    public void setListValue(int value) {
        System.out.println("Set list value : " + value);
    }

    @Override
    public void update() {
        setListValue(1);
    }
}
