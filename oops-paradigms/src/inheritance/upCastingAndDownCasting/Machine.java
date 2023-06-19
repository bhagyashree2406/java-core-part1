package inheritance.upCastingAndDownCasting;

public class Machine {
    public void startup(){
        System.out.println(this.getClass().getName() + "Machine is starting up." );
    }
    public  void shutDown(){
        System.out.println("MAchine is shuttting ");
    }
}
