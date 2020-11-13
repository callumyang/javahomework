import java.util.ArrayList;
public class ex3_3 {
    public static void qsort(ArrayList<Number> List,int l,int r){
        if(l < r){
            int pos = getqsort(List, l, r);
            qsort(List, l, pos-1);
            qsort(List, pos+1, r);
        } 
    }
    public static int getqsort(ArrayList<Number> List,int l,int r){
        Number x = List.get(l);
        while(l < r){
            while(l < r && List.get(r).doubleValue() >= x.doubleValue()){
                r--;
            }
            List.set(l,List.get(r));
            while(l < r&& List.get(l).doubleValue() <= x.doubleValue()){
                l++;
            }
            List.set(r,List.get(l));
        }
        List.set(r,x);
        return l;

    }
    public static void sort(ArrayList<Number> List){
        qsort(List, 0, List.size()-1);
    }
    public static void main(String[] args) {
        
        ArrayList<Number> list = new ArrayList<>();
        for(int i = 0;i < 50;i++){
            list.add((int)(Math.random()*(100-1)+1));
        }
        sort(list);
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
