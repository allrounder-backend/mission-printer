package mission.View;

public class PrinterView {
    public void printAscii(String asciiArt) {
        System.out.println(asciiArt);
    }

    public void printStatus(int inkAmount, int paperAmount) {
        System.out.println("남은 잉크: " + inkAmount + " / 남은 종이: " + paperAmount);
    }

    public void printError(String message) {
        System.out.println("오류: " + message);
    }

    public void printSuccess() {
        System.out.println("출력이 성공적으로 완료되었습니다!");
    }
}
