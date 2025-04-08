package mission.Control;

import mission.Model.PrinterModel;
import mission.View.PrinterView;

public class PrinterController {
    private PrinterModel model;
    private PrinterView view;

    public PrinterController(PrinterModel model, PrinterView view) {
        this.model = model;
        this.view = view;
    }

    public void print(int number) {
        if (!model.getInk().hasEnoughInk()) {
            view.printError("잉크가 부족합니다!");
            return;
        }

        if (!model.getPaper().hasEnoughPaper()) {
            view.printError("종이가 부족합니다!");
            return;
        }

        String asciiArt = model.getAsciiArt(number);
        view.printAscii(asciiArt);

        model.getInk().useInk();
        model.getPaper().usePaper();

        view.printSuccess();
        showStatus();
    }

    public void showStatus() {
        view.printStatus(model.getInk().getInkAmount(), model.getPaper().getPaperAmount());
    }
}
