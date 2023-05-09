package kr.ac.sahmyook.home.func;

public class StaticMethodSample {
    public void testMathRandom(){
        int min = 1;
        int max = 45;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(randomNum);
    }
    public void testMathAbs(){
        double num = -12.77;
        double absNum = Math.abs(num);
        System.out.println("Absolute value of " + num + " is " + absNum);
    }
    public void testMathMax(){
        int max = Math.max(120, 54);
        System.out.println("큰 값: " + max);
    }
}
