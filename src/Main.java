
class Box<T> {

    private T value;


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public void display() {
        System.out.println("Stored Value: " + value);
    }
}


class GenericMethod {

    public static <T> void printData(T data) {
        System.out.println("Data: " + data);
    }
}


class Calculator<T extends Number> {

    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}


class WildcardDemo {

    public static void showNumbers(Box<? extends Number> box) {
        System.out.println("Wildcard Value: " + box.getValue());
    }
}


public class Main {

    public static void main(String[] args) {


        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Java Generics");
        stringBox.display();

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        intBox.display();

        GenericMethod.printData("Java");
        GenericMethod.printData(500);

        Calculator<Integer> calc = new Calculator<>();
        System.out.println("Square: " + calc.square(5));

        WildcardDemo.showNumbers(intBox);
    }
}