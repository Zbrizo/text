package com.example.springbootdemo;

import java.util.HashMap;
import java.util.Map;
//天干地支纪年
public class Years {

    public static void main(String[] args) {
        countYear();
    }

    public static void countYear(){
        String[] a=new String[]{"甲","乙","丙","丁","戊","己","庚","辛","壬","癸"};
        String[] b=new String[]{"子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥"};
        Map< String,Integer> map=new HashMap<>();
        for(int i=0;1==1;i++){
            String ab=a[i%10]+b[i%12];
            if(map.get(ab)!=null){
                break;
            }
            map.put(ab,i);
            int year=i+1984;
            System.out.println(year+","+ab);
        }
    }
}
