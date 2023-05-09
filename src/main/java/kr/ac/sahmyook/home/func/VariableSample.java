package kr.ac.sahmyook.home.func;
import java.util.Scanner;
public class VariableSample {
    public void myProfile(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("성별을 입력하세요: ");
        char gender = sc.nextLine().charAt(0);

        System.out.print("주소를 입력하세요: ");
        String address = sc.nextLine();

        System.out.println("=== 내 신상 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("주소: " + address);

        sc.close();
    }
    public void empInformation(){
            Scanner sc = new Scanner(System.in);

            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();

            System.out.print("직급을 입력하세요: ");
            String position = sc.nextLine();

            System.out.print("연락처를 입력하세요: ");
            String phone = sc.nextLine();

            System.out.print("이메일을 입력하세요: ");
            String email = sc.nextLine();

            System.out.println("입력하신 정보는 다음과 같습니다.");
            System.out.println("이름: " + name);
            System.out.println("직급: " + position);
            System.out.println("연락처: " + phone);
            System.out.println("이메일: " + email);
    }
}
