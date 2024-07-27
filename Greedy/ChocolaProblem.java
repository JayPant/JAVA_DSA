package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n =4 , m =6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0,v=0;
        int hP =1,vP=1;
        int finalValue =0;

        while (h< costHor.length && v< costVer.length) {
            if(costVer[v] <= costHor[h]){
                finalValue+= costHor[h++]*vP;
                hP++;
            }else{
                finalValue+= costVer[v++]*hP;
                vP++;
            }
        }

        while (h< costHor.length){
            finalValue+= costHor[h++]*vP;
                hP++;
        }

        while (v< costVer.length){
            finalValue+= costVer[v++]*hP;
                vP++;
        }

        System.out.println(finalValue);

    }
}
