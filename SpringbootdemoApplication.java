package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {

    }

    public void countYear(){
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

    public void eightQueen(){
        int[] x=new int[]{0,1,2,3,4,5,6,7};
        int[] y=new int[]{0,1,2,3,4,5,6,7};
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){

            }

        }
    }
    public void eightQueen(List<Position> list){
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                for (Position p:list) {
                        int a=i-p.getxPosition();
                        int b=j-p.getyPosition();
                    if(p.getxPosition()==i||p.getxPosition()==j||a+b==0||a-b==0){
                        break;
                    }else{
                        Position position=new Position(i,j);
                        list.add(position);
                        eightQueen(list);
                    }
                }
            }
        }
    }
    public class Position{
        private int xPosition;
        private int yPosition;

        public int getxPosition() {
            return xPosition;
        }

        public void setxPosition(int xPosition) {
            this.xPosition = xPosition;
        }

        public int getyPosition() {
            return yPosition;
        }

        public void setyPosition(int yPosition) {
            this.yPosition = yPosition;
        }

        public Position(int xPosition,int yPosition){
            super();
            this.xPosition=xPosition;
            this.yPosition=yPosition;

        }
    }
}
