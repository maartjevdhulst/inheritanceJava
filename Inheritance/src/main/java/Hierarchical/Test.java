package Hierarchical;

public class Test {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.room();
        kitchen.kitchen();

        Livingroom livingroom = new Livingroom();
        livingroom.room();
        livingroom.livingroom();
    }
}
