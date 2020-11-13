import java.util.Date;
public class ex3_1{
    public static void main(String[] args) {
        Date date = new Date();
        for(long i = 10000;i <= 1e11;i *= 10){
            date.setTime(i);
            System.out.printf("%d:%s\n",i,date.toString());
        }
    }
}