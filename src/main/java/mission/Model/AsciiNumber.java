package mission.Model;

public class AsciiNumber {
    public String getAsciiArt(int number) {
        switch (number) {
            case 1:
                return "  #  \n ##  \n  #  \n  #  \n ### \n";
            case 2:
                return " ### \n#   #\n  ## \n #   \n#####\n";
            case 3:
                return " ### \n    #\n  ## \n    #\n ### \n";
            // 필요한 숫자 더 추가 가능
            default:
                return "숫자를 다시 입력하세요.";
        }
    }
}
