import java.util.Scanner;

public class ScoreAverage {
    // 각 시험점수를 입력받아 평균을 출력하는 프로그램
    // 과목은 5개 점수는 정수형
    // 출력 예시 ) A학생의 수학 : 90점, 영어 80점 , 국어 : 100점, 과학 : 70점, 사회 : 80점 이며 평균은 X 입니다.
    public static void main(String[] args) {
        ScoreAverage scoreAver = new ScoreAverage();
        
        // 1. 5개 과목을 적는다.
        String[] subject = {"수학","영어","국어","과학","사회"};
        // 2. 학생 이름을 입력받는다.
        String student = scoreAver.inputName();
        // 3. 5개 과목의 점수를 입력받는다.
        int[] score = scoreAver.inputScore(subject);
        // 4. 평균을 계산한다(점수를 모두 더하고 나눈다)
        double aver = scoreAver.averageCalculator(score);
        // 5. 구한 평균을 출력한다.
        System.out.print(student+"학생의");
        // 반복되는 부분은 for문으로 처리함 ( 줄바꿈 방지를 위해서 println안쓰고 print씀 )
        // subject[0]은 과목명 수학을 출력 score[0]은 입력받은 점수를 출력
        for(int i=0; i<subject.length; i++){
            System.out.print(" "+subject[i]+" : "+score[i]+"점");
            // 마지막 과목 전까지 ,쉼표처리
            if(i != subject.length -1){
                System.out.print(",");
            }
            // 마지막 과목은 띄어쓰기 처리
            else{
                System.out.print(" ");
            }
        }
        System.out.print("이며 평균은 "+aver+" 입니다.");
    }

    // 과목배열을 주면 과목의 점수를 입력받아서 배열로 반환하는 프로그램
    public int[] inputScore(String subject[]){
        // 1. 입력받을 장치 : 스캐너클래스
        Scanner scan = new Scanner(System.in);
        // 2. 입력받을 공간 : 배열
        int[] score = new int[5];
        // 3. 입력받기 for문
        for(int i = 0; i< subject.length;i++){
            System.out.println(subject[i]+"점수를 입력하세요 : ");
            score[i] = scan.nextInt();
        }
        // 4. 반환하기
        return score;
    } //////// inputScore ///////

    // 이름을 입력받는 프로그램
    public String inputName(){
        // 1. 입력받을 장치 : 스캐너클래스
        Scanner scan = new Scanner(System.in);
        System.out.println("학생명을 입력하세요 : ");
        // 2. 입력받을 공간 : String에 바로 입력값 넣기
        String name = scan.nextLine();
        // 3. 반환하기
        return name;
    } //////// inputName ///////

    // 점수배열을 주면 평균을 반환하는 프로그램
    public double averageCalculator(int num[]){
        // 1. 합계를 담을 공간
        int sumScore = 0;
        // 2. 합산하기
        for(int i = 0; i < num.length; i++){
            sumScore += num[i];
        }
        // 3. 평균 계산하기
        double average = (double)sumScore/(double)num.length;
        // 4. 반환하기
        return average;
    } ////// averageCalculator ///////
}
