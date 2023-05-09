package kr.ac.sahmyook.home.func;
import java.util.Scanner;
public class DoWhileSample {
    public void addDashToken(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i != str.length() - 1) {
                sb.append('-');
            }
        }
        System.out.println(sb.toString());
    }
    public void burgerKingMenu(){
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Whopper", "Bacon King", "Tendercrisp Chicken Sandwich", "Impossible Whopper"};
        int[] price = {6900, 7900, 5900, 6900};
        int[] order = new int[menu.length];
        int total = 0;

        System.out.println("Welcome to Burger King!");
        System.out.println("=== MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + price[i] + " won");
        }

        while (true) {
            System.out.print("Select a menu (1-" + menu.length + ", 0 to exit): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= menu.length) {
                System.out.print("How many? ");
                int num = sc.nextInt();
                order[choice - 1] += num;
                System.out.println(menu[choice - 1] + " x " + num + " added to the order.");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("=== ORDER SUMMARY ===");
        for (int i = 0; i < menu.length; i++) {
            if (order[i] != 0) {
                System.out.println(menu[i] + " x " + order[i] + " - " + price[i] * order[i] + " won");
                total += price[i] * order[i];
            }
        }

        System.out.println("Total: " + total + " won. Thank you for ordering at Burger King!");
    }
    public void isStringAlphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        boolean isAllAlphabet = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                isAllAlphabet = false;
                break;
            }
        }

        if (isAllAlphabet) {
            System.out.println("모든 글자 영문자입니다.");
        } else {
            System.out.println("영문자가 아닙니다.");
        }
    }
}
