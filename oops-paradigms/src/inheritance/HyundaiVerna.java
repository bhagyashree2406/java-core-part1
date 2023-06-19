package inheritance;

public class HyundaiVerna extends Car {
    boolean hasSumRoof;
    boolean isAutoMatic;

    public HyundaiVerna(boolean hasSumRoof, boolean isAutoMatic) {
        super();
        this.hasSumRoof = hasSumRoof;
        this.isAutoMatic = isAutoMatic;

    }

    public boolean isHasSumRoof() {
        return hasSumRoof;
    }

    public void setHasSumRoof(boolean hasSumRoof) {
        this.hasSumRoof = hasSumRoof;
    }

    public boolean isAutoMatic() {
        return isAutoMatic;
    }

    public void setAutoMatic(boolean autoMatic) {
        isAutoMatic = autoMatic;
    }

    @Override
    public String toString() {
        return "HyundaiVerna{" +
                "hasSumRoof=" + hasSumRoof +
                ", isAutoMatic=" + isAutoMatic +
                '}';
    }
}
