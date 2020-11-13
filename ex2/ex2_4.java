import java.util.Scanner;
public class ex2_4 {
    public static int indexOfSmallestElement(double[] array) {
        int pos = 0;
        double minn = 0x3f3f3f3f;
        for(int i = 0;i < array.length;i++){
            if(array[i] < minn){
                pos = i;
                minn = array[i];
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("请输入十个数字：");
        double[] array = new double[10];
        for(int i = 0;i < array.length;i++){
            array[i] = input.nextDouble();
        }
        int pos = indexOfSmallestElement(array);
        System.out.printf("最小元素的下标为%d\n",pos);
        input.close();
    }
}
