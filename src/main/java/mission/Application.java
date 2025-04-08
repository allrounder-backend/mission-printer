package mission;

import mission.Control.PrinterController;
import mission.Model.PrinterModel;
import mission.View.PrinterView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PrinterModel model = new PrinterModel();
        PrinterView view = new PrinterView();
        PrinterController controller = new PrinterController(model, view);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("출력할 숫자를 입력하세요 (종료: -1): ");
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            controller.print(number);
        }
    }
}
