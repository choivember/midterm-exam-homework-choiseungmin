package kr.ac.sahmyook.home.func;
import java.util.Scanner;
import java.util.Random;
public class NonStaticMethodSample {
    public void testScanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수는 " + intValue + "입니다.");

        System.out.print("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수는 " + doubleValue + "입니다.");

        System.out.print("문자열을 입력하세요: ");
        String stringValue = scanner.next();
        System.out.println("입력한 문자열은 " + stringValue + "입니다.");

        System.out.print("논리값을 입력하세요(true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("입력한 논리값은 " + booleanValue + "입니다.");

        System.out.print("문자를 입력하세요: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("입력한 문자는 " + charValue + "입니다.");

        scanner.close();
    }
    public void testRandom(){
        Random random = new Random();
        int randomInt = random.nextInt();
        double randomDouble = random.nextDouble();
        System.out.println("Random integer: " + randomInt);
        System.out.println("Random double: " + randomDouble);
    }
}
