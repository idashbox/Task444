package Task4;
//Вычислить наименьшее число трибоначчи, большее или равное n.
import java.util.Scanner;

public class Tribbonachi {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getN();
        int result = sum_tribbonachi(n);
        System.out.println("Сумма всех четных чисел Трибоначчи, больших или равных данному числу N равна " + result);
    }
    static int sum_tribbonachi(int n) {
        int I1 = 0;
        int I2 = 0;
        int I3 = 1;
        int num1;
        int num2;
        int num3;
        for (;;){
            num3 = I1 + I2 + I3;
            num2 = I3;
            num1 = I2;
            I1 = num1;
            I2 = num2;
            I3 = num3;
            if (I3 >= n){
                return num3;
            }
        }
    }
    static int getN() {
        System.out.println("Введите число N:");
        int num;
        num = scanner.nextInt();
        return num;
    }
}

