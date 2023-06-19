package inheritance;

public class DriverClass {
    public static void main(String[] args) {

        HondaCity hondaCity = new HondaCity(true,true);


        System.out.println(hondaCity.toString());

        HyundaiVerna hyundaiVerna = new HyundaiVerna(false,false);

        System.out.println(hyundaiVerna.toString());



         }
}
