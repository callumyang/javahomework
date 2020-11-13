public class ex2_3 {
    public static void main(String[] args) {
        int[] cnt = new int[10];
        for(int i = 0;i < 100;i++){
            cnt[(int)(Math.random() * 10)]++;
        }
        for(int i = 0;i < 10;i++){
            System.out.printf("%d出现了%d次\n",i,cnt[i]);
        }
    }
}
