package com.company.Oops.staticFile;

public class Test {

    public static int H = -1;
    public static int B = 3;
    static boolean flag = false;

    static  {

        if (B < 0 || H < 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        if (B > 0 && H > 0) {
            int area;
            area = H * B;
            System.out.print(area);
        }
        System.exit(0);
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
