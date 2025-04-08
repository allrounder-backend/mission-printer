package mission.Model;

public class PrinterModel {
    private Ink ink;
    private Paper paper;
    private AsciiNumber asciiNumber;

    public PrinterModel() {
        this.ink = new Ink();
        this.paper = new Paper();
        this.asciiNumber = new AsciiNumber();
    }

    public Ink getInk() {
        return ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public String getAsciiArt(int number) {
        return asciiNumber.getAsciiArt(number);
    }
}
