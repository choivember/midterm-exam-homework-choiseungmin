package kr.ac.sahmyook.home.func;
import java.util.Scanner;
public class IfSample {
    public void maxNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;
        System.out.println("입력한 두 수 중 큰 값은 " + max + "입니다.");

        sc.close();
    }
    public void minNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수1을 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("정수2를 입력하세요: ");
        int num2 = scanner.nextInt();

        int min = num1 < num2 ? num1 : num2;
        System.out.println("두 수중 작은 값은 " + min + "입니다.");
    }
    public void threeMaxMin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 개의 정수를 입력하세요.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        System.out.println("가장 큰 수는 " + max + "입니다.");
        System.out.println("가장 작은 수는 " + min + "입니다.");

        scanner.close();
    }
    public void checkEven(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + "은(는) 짝수입니다.");
        } else {
            System.out.println(num + "은(는) 홀수입니다.");
        }
    }
    public void isPassFail(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요: ");
        int kor = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        int eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();

        double avg = (kor + eng + math) / 3.0;

        if (avg >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
    public void scoreGrade(){
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("점수를 입력하세요: ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
    }
    public void checkPlusMinusZero(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num > 0) {
            System.out.println("입력된 수는 양수입니다.");
        } else if (num < 0) {
            System.out.println("입력된 수는 음수입니다.");
        } else {
            System.out.println("입력된 수는 0입니다.");
        }
    }
    public void whatCaracter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        char c = scanner.nextLine().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            System.out.println("영어 대문자입니다.");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("영어 소문자입니다.");
        } else if (c >= '0' && c <= '9') {
            System.out.println("숫자 문자입니다.");
        } else {
            System.out.println("기타 문자입니다.");
        }
    }
}
