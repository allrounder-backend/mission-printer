package mission.Model;

public class Ink {
    final static int Max = 1000;
    static int ink = Max;

    public static void refill(){
        ink = Max;
        System.out.println("잉크를 교체하였습니다.");
    }

    public static void checkInk(){
        System.out.print("잉크 잔량: " + ink + "/1000");
    }

    public static void useInk(int amount){
        if(ink >= amount){
            ink -= amount;
        }
        else{
            ink = 0;
        }
    }
}
