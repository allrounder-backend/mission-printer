package mission.View;

import mission.Model.Ink;
import java.util.Scanner;

public class view {
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("프린터를 실행합니다.");
        System.out.print("사용할 기능을 입력해주세요. 1) 출력, 2) 잉크 잔량 확인, 3) 잉크 교체, 4) 프로그램 종료");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1:
                paperInfo();

            case 2:
                Ink.checkInk();
            case 3:
                Ink.refill();
            case 4:
                System.out.println("프로그램을 종료합니다.");
                break;
        }
    }

    public void paperInfo() {
        System.out.print("출력할 문자를 입력하세요: ");
        String paperText = scanner.next();
        System.out.print("용지 크기를 입력하세요: ");
        int paperSize = scanner.nextInt();
    }
}