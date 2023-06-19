package inheritance.upCastingAndDownCasting;

public class Printer extends Machine{
    public void print(){
        System.out.println(this.getClass().getName() + "Printer is printing document .");
    }
}
