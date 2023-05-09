package kr.ac.sahmyook.home.func;
import java.util.Scanner;
public class ForSample {
    public void sum1To10(){
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합계는 " + sum + "입니다.");
    }
    public void sumEven1To100(){
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1부터 100까지의 짝수의 합계: " + sum);

    }
    public void oneGugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
    public void sumMinToMax(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(min + "부터 " + max + "까지의 합계는 " + sum + "입니다.");
        sc.close();
    }
    public void printStar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 줄을 출력할까요?: ");
        int rows = scanner.nextInt();

        System.out.print("한 줄에 몇 개의 별표를 출력할까요?: ");
        int cols = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printNumberStar(){
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                if(j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void printTriangleStar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 줄 출력할까요?: ");
        int n = sc.nextInt();
        int absN = Math.abs(n);

        if (n < 0) {
            for (int i = 1; i <= absN; i++) {
                for (int j = 1; j <= absN - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= absN; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
    public void guguDan(){
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
