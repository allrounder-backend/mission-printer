package mission.Model;

public class Paper {
    private int paperAmount = 10;

    public int getPaperAmount() {
        return paperAmount;
    }

    public boolean hasEnoughPaper() {
        return paperAmount > 0;
    }

    public void usePaper() {
        paperAmount--;
    }
}
