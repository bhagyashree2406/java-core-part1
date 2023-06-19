package inheritance;

public class HondaCity extends Car  {
    boolean hasSunRoof;
    boolean isAutoMatic;

    public HondaCity(boolean hasSunRoof, boolean isAutoMatic) {
        super("Honda","2023",1300,true);
        System.out.println(this.getClass().getName() + " called");
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isAutoMatic() {
        return isAutoMatic;
    }

    public void setAutoMatic(boolean autoMatic) {
        isAutoMatic = autoMatic;
    }

    @Override
    public String toString() {
        return "HondaCity{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                '}';
    }
}
