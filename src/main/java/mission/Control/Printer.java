package mission.Control;

import mission.Model.Ink;
import java.util.Scanner;

public class Printer {
    Scanner scanner = new Scanner(System.in);
    private Ink ink;

    public static void printer() {
        System.out.print("출력할 문자를 입력하세요: ");
        String paperText = scanner.next();
        System.out.print("용지 크기를 입력하세요: ");
        int paperSize = scanner.nextInt();
    }
}
