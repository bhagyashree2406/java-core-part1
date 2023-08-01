package functional.interface1;
class Test  implements ExampleInterface{
    @Override
    public int randomCalculate(int a, int b) {
        return 0;
    }
public class Driver {
    public static void main(String[] args) {
        ExampleInterface instanceUsingAC = new ExampleInterface() {
            @Override
            public int randomCalculate(int a, int b) {
                System.out.println("randomCalculate() method called inside anonymous class!!!");
                return 0;
            }
        };
        instanceUsingAC.print(100);
        instanceUsingAC.randomCalculate(10,20);


        ExampleInterface instanceUsingLambdaExp = (a, b) -> {
            System.out.println("Lambda called");
            return 0;
        };

        /*
        (a, b) -> {
            System.out.println("randomCalculate() method called inside lambda exp!!!");
            return 0;
        }; this is a lambda expression which is nothing but definition for abstract method
        of functional interface.
        This lambda expression automatically creates an object of interface and returns it.
        Which is very similar to anonymous class.
         */

        instanceUsingLambdaExp.print(200);
        System.out.println("Return value : " + instanceUsingLambdaExp.randomCalculate(100,200));


    }
}
}


