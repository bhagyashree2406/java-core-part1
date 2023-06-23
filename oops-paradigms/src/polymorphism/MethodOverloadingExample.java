package polymorphism;
/*
poly- many
morphism - form
 */
public class MethodOverloadingExample  {

    void displayMsg(){
        System.out.println("A method with no argument called.");
    }


    void displayMsg(String msg){
        System.out.println("A method with one param called with msg"  + msg);

    }

    void displayMsg(int num){
        System.out.println("A method with one param called with num"  + num);

    }
    void displayMsg(int num,String msg){
        System.out.println("A method with one param called with num"  + num + "msg" + msg );

    }


    void displayMsg(String msg,int num) {
        System.out.println("A method with one param called with num" + num);
    }

        public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.displayMsg();

    }
}
