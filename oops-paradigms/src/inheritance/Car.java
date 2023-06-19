package inheritance;

public class Car {

    String BrandName;
    String YearOfMan;
    int cc;
    boolean ispetrol;
    public Car(){
        System.out.println(this.getClass().getName() + " called");

    }

    public Car(String brandName, String yearOfMan, int cc, boolean ispetrol) {
        System.out.println(this.getClass().getName() + " called");
        this.BrandName = brandName;
        this.YearOfMan = yearOfMan;
        this.cc = cc;
        this.ispetrol = ispetrol;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getYearOfMan() {
        return YearOfMan;
    }

    public void setYearOfMan(String yearOfMan) {
        YearOfMan = yearOfMan;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isIspetrol() {
        return ispetrol;
    }

    public void setIspetrol(boolean ispetrol) {
        this.ispetrol = ispetrol;
    }

    @Override
    public String   toString() {
        return "Car{" +
                "BrandName='" + BrandName + '\'' +
                ", YearOfMan='" + YearOfMan + '\'' +
                ", cc=" + cc +
                ", ispetrol=" + ispetrol +
                '}';
    }
}


