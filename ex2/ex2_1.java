import java.util.Scanner;
public class ex2_1 {
    public static void reverse(int number){
        if(number < 0){
            System.out.printf("-");
            number = -number;
        }
        while(number != 0){
            System.out.printf("%d",number % 10);
            number /= 10;
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
        input.close();
    }
}
