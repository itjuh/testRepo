import java.util.Scanner;

public class ForPractice {
    public static void main(String[] args) {
        ForPractice for1 = new ForPractice();
        // 구구단 출력하기
        // for1.showGugu();

        // 숫자받아 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 구구단 단수를 입력하세요!(2~9단까지 가능합니다.)");
        int selectedNum = scan.nextInt();
        for1.makeGugu(selectedNum);
    }
    // 구구단 단수 받아서 출력하기 프로그램
    public void makeGugu(int num){
        // 구구단 출력하기
        System.out.println("구구단 "+num+"단");   
        for (int j = 1; j <= 9; j++) {
            System.err.println(num + " * " + j + " = " + num * j);
        }
    }
    // 구구단 전체 출력하는 프로그램
    public void showGugu(){
        for(int i = 2; i <= 9; i++) {
            System.out.println("구구단 "+i+"단");   
            for (int j = 1; j <= 9; j++) {
                System.err.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
