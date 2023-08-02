package defaultAndStaticMethods;

//functional interface is an interface that has at most one abstract method -> exhibits only one feature.
//it can have any number static methods
//it can also have any number of default methods
@FunctionalInterface
public interface ExampleInterface {
    int randomCalculate(int a, int b);//method declaration for abstract method
    //    void print();//if this is new abstract method added in ExampleInterface then
//    //all the implementing classes must have to override this method.
//    //so this is tedious task and unnecessarily classes have to provide implementation
//    //for this method even though they don't this method.
    default void print(){
        System.out.println("print in functional interface");
    }

    static void showMsg(){
        System.out.println("static showMsg called");
    }
}