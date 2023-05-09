package kr.ac.sahmyook.home.func;
import java.util.Scanner;
import java.util.Random;
public class WhileSample {
    public void printUniCode(){
        Scanner input = new Scanner(System.in);
        char c;

        do {
            System.out.print("문자를 입력하세요 (종료는 '0'): ");
            c = input.next().charAt(0);

            if (c != '0') {
                System.out.println("'" + c + "'의 유니코드: " + (int) c);
            }
        } while (c != '0');

        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
    public void sum1To100(){
        int num = 1;
        int sum = 0;

        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("1부터 100까지의 합계: " + sum);
    }
    public void numberGame(){
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        int numGuesses = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("1부터 100 사이의 숫자를 맞춰보세요.");

        do {
            System.out.print("숫자를 입력하세요: ");
            guess = in.nextInt();
            numGuesses++;

            if (guess < numberToGuess) {
                System.out.println("그 숫자보다 큽니다.");
            } else if (guess > numberToGuess) {
                System.out.println("그 숫자보다 작습니다.");
            }
        } while (guess != numberToGuess);

        System.out.println("축하합니다! " + numGuesses + "번 만에 맞추셨습니다.");
    }
    public void countCharacter(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        int length = str.length();
        System.out.println("입력한 문자열의 길이는 " + length + "입니다.");
    }
    public void countInChar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.print("문자를 입력하세요: ");
        char ch = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("문자열 \"" + str + "\"에는 \"" + ch + "\"가 " + count + "개 있습니다.");
    }
}
