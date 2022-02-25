package com.zyf.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekday="周八";
        switch (weekday){
            case "周一":
                System.out.println("干代码");
                break;
                case "周二":
                System.out.println("请大牛");
                break;
                case "周三":
                System.out.println("恰饭");
                break;
                case "周四":
                System.out.println("帮人");
                break;
                case "周五":
                System.out.println("打游戏");
                break;
                case "周六":
                System.out.println("宅家");
                break;
                case "周日":
                System.out.println("准备上班");
                break;
            default:
                System.out.println("数据有误");



        }
    }
}
