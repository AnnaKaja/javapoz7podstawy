package oop.shapes;


public interface Shape {

    String NAME_OF_SOMETHING = "monsters";

    static void test() {
        System.out.println("test");
    }

    String getName();
    int field();
    int circuit();
    double diagonal();

    void printAllSides();
}
