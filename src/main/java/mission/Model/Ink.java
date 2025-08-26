package mission.Model;

public class Ink {
    private int inkAmount = 10;

    public int getInkAmount() {
        return inkAmount;
    }

    public boolean hasEnoughInk() {
        return inkAmount > 0;
    }

    public void useInk() {
        inkAmount--;
    }
}
