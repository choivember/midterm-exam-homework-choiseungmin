package kr.ac.sahmyook.home.func;
import java.util.Scanner;
import java.util.HashMap;
public class SwitchSample {
    public void calculator(){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.print("연산자를 입력하세요(+,-,*,/ 중 하나): ");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }
        System.out.printf("%d %c %d = %d\n", num1, operator, num2, result);
    }
    public void fruitPrice(){
        HashMap<String, Integer> fruitPrices = new HashMap<String, Integer>();
        fruitPrices.put("사과", 1000);
        fruitPrices.put("바나나", 1500);
        fruitPrices.put("딸기", 3000);
        fruitPrices.put("오렌지", 2000);

        // 입력받은 과일 이름으로 가격 정보 검색
        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요: ");
        String fruitName = scanner.nextLine();
        if (fruitPrices.containsKey(fruitName)) {
            int price = fruitPrices.get(fruitName);
            System.out.println(fruitName + "의 가격은 " + price + "원 입니다.");
        } else {
            System.out.println(fruitName + "은(는) 존재하지 않는 과일 이름입니다.");
        }
        scanner.close();
    }
}
