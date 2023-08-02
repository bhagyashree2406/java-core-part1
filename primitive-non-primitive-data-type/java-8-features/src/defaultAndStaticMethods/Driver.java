package defaultAndStaticMethods;

class Test implements ExampleInterface {
    @Override
    public int randomCalculate(int a, int b) {
        return a+b;
    }

//    @Override
//    public void print() {
//
//    }

    @Override
    public void print() {
        ExampleInterface.super.print();
    }
}
class Test2 implements ExampleInterface {

    @Override
    public int randomCalculate(int a, int b) {
        return a*b;
    }

//    @Override
//    public void print() {
//
//    }
}
public class Driver {
    public static void main(String[] args) {
        ExampleInterface.showMsg();
    }
}