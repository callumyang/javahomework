import java.util.Scanner;
public class ex2_2 {
    public static void printMatrix(int n) {
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.printf("%d ",(int)(Math.random()*2));
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter n：");
        int n = input.nextInt();
        printMatrix(n);
        input.close();
    }
}
