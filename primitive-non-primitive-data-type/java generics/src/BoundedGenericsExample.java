class Hardware<T extends Machine> {
}

class Machine {
}

class Laptop extends Machine {
}

class Mobile extends Machine {
}

class Printer {
public class BoundedGenericsExample {
    public static void main(String[] args) {
        Hardware<Machine> machineHardware = new Hardware<>();
        Hardware<Mobile> mobileHardware = new Hardware<>();
        Hardware<Laptop> laptopHardware = new Hardware<>();
//        Hardware<Printer> printerHardware = new Hardware<>();//this is not allowed
        //because Printer is not a subclass of Machine class
        //and Hardware<E extends Machine> so E can only be Machine or Mobile or Laptop but not Printer
        //because printer is not a subclass of Machine.
    }
}
}
