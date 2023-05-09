package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (i == 100) {
                break;
            }
        }
        System.out.println("1부터 100까지의 합계는 " + sum + "입니다.");
    }
    public void guguDanBreak(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.print(i + " x " + j + " = " + result);
                if (result == 5) {
                    break;
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("구구단 출력 종료!");
    }
}
