package com.zyf.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int month =7;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(
                        month +"是31天！"
                );
                break;
            case 2:
                System.out.println(month +"月闰年为29天，非闰年为28天!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"是30天");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
