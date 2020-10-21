import java.util.Scanner;
public class ex2_5 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for(int i = 0;i < m.length;i++){
            sum += m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a 4-by-4 matrix row by row:\n");
        final int n = 4;
        double[][] m = new double[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                m[i][j] = input.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(m);
        System.out.println("Sum of the elements in the major diagonal is "+sum);
        input.close();
    }
}
