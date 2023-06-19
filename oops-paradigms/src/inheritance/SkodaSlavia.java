package inheritance;

public class SkodaSlavia extends Car {
    int NoOfBags;


    public SkodaSlavia(int noOfBags) {
        System.out.println(this.getClass().getName() + " called");
        NoOfBags = noOfBags;
    }

    public SkodaSlavia(String brandName, String yearOfMan, int cc, boolean ispetrol, int noOfBags) {
        super(brandName, yearOfMan, cc, ispetrol);
        System.out.println(this.getClass().getName() + " called");
        NoOfBags = noOfBags;
    }

    public int getNoOfBags() {
        return NoOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        NoOfBags = noOfBags;
    }

    @Override
    public String toString() {
        return "SkodaSlavia{" +
                "NoOfBags=" + NoOfBags +
                '}';
    }
}
