import java.util.*;

public class CpAssignment {
    static void reverse(int[] x, int i, int j){
        if(i<j){//Swap
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }
    public static void main(String[] args) {
        int[] s = new int[]{1,2,3,4,5};
        reverse(s,0,s.length-1);
        System.out.println(Arrays.toString(s));
    }
}
