import java.util.Scanner;
// 두 수와 연산부호를 입력받아서 처리하는 계산기 만들기
public class CalculatorBasic{
    public static void main(String[] args) {
        // 입력 받기
        Scanner in = new Scanner(System.in);
        CalculatorBasic calc = new CalculatorBasic();
        // 숫자를 입력받을 변수
        int firstNumber,secondNumber = 0;
        System.out.println("/////////////////계산기////////////////");
        // 첫번째 숫자를 입력 받기
        try {
            System.out.println("숫자를 입력 하세요: ");
            firstNumber = in.nextInt();
        } catch (Exception e) { // 숫자가 아닌경우 에러처리해서 프로그램 종료
            calc.exitMessage("숫자가 너무 어려워서");
            return;
        }
        // 연산부호를 입력 받기
        System.out.println("연산 부호를 입력하세요: ");
        String operation = in.next();
        // 연산부호인지 확인
        if(!operation.equals("+")&&!operation.equals("-")&&!operation.equals("*")&&!operation.equals("/")){
            calc.exitMessage("연산 부호는 +,-,*,/가 아니면");
        }
        // 두번째 숫자를 입력 받기
        try {
            System.out.println("두번째 숫자를 입력 하세요: ");
            secondNumber = in.nextInt();
        } catch (Exception e) {
            calc.exitMessage("숫자가 너무 어려워서");
            return;
        }
        // 입력 값 유저에게 출력하기(확인용)
        System.out.println("입력한 계산식 "+firstNumber+" "+operation+" "+secondNumber+" 을 진행합니다. ");
        // calculator 메서드에 보내서 처리
        double result = calc.calculator(firstNumber,secondNumber,operation);
        // 반환 값 출력하기
        System.out.println("////////////////결과출력////////////////");
        System.out.println(firstNumber+" "+operation+" "+secondNumber+" = "+result);
    }
    // 값을 계산해서 반환하는 메서드
    public double calculator(int x, int y, String operation){
        double result = 0;
        if(operation.equals("+")) result = (double)x+y;
        else if(operation.equals("-")) result = (double)x-y;
        else if(operation.equals("*")) result =  (double)x*y;
        else if(operation.equals("/")) result =  (double)x/(double)y;
        return result;
    }
    // 오류메세지를 출력하는 메서드
    public void exitMessage(String cautionString){
        System.out.println(cautionString);
        System.out.println("제가 계산 할 수 없어요.");
        System.out.println("프로그램을 종료할게요ㅠㅠ.");
    }
}