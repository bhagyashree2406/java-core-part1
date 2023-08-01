package functional.interface1;
@FunctionalInterface
public interface ExampleInterface {
    int randomCalculate(int a, int b);//method declaration for abstract method

    default void print(int result) {
        System.out.println(result);
    }//default method is a concrete method that written in functional interface.
}

