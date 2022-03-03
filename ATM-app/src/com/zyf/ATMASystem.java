package com.zyf;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMASystem {
    public static void main(String[] args) {
        //1.准备系统需要的容器对象，用于存储账户对象
        ArrayList<Account> accounts =new ArrayList<>();

        //2.准备系统的首页，登录 开户
        showMain(accounts);

    }


    public static void showMain(ArrayList<Account> accounts){
        System.out.println("==============欢迎进入首页==============");

        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您想做的操作：");
            System.out.println("1.登录：");
            System.out.println("2.开户：");
            System.out.println("您可以输入命令了");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //登录
                    login(accounts,sc);
                    break;
                case 2:
                    register(accounts,sc);
                    //开户
                    break;
                default:
                    System.out.println("您当前输入的操作命令不被支持");
            }
        }
    }

    /**
     * 登录功能
     * @param accounts
     */
    private static void login(ArrayList<Account> accounts,Scanner sc) {
        //必须系统中存在账户才可以登录
        if (accounts.size()==0){
            //没有任何账户
            System.out.println("当前系统无任何账户，您需要先注册！");
            return;//直接结束方法的执行
        }
        //2.让用户键盘输入卡号，根据卡号查询账户对象
        while (true) {
            System.out.println("请您输入登录的卡号：");
            String cardId =sc.next();
            Account acc=getAccountByCardId(cardId,accounts);

            //3.判断用户对象是否存在，存在说明卡号没问题
            if (acc!=null) {
                while (true) {
                    //4.让用户继续输入密码
                    System.out.println("请您输入登录的密码：");
                    String password = sc.next();
                    //5.判断密码是否正确
                    if (acc.getPassWord().equals(password)){
                        //密码正确，登录成功
                        //展示系统登录后的操作页面
                        System.out.println("恭喜您"+acc.getUserName()+"成功进入系统,您的卡号是："+acc.getCardId());
                        //展示操作页面
                        showUserCommand(sc,acc);
                        //结束登录方法
                        return;
                    }else {
                        System.out.println("您输入的密码有误");
                    }
                }
            }else {
                    System.out.println("对不起，不存在该卡号的账户");
                }
            }
        }

    /**
     * 操作页面
     */
    private static void showUserCommand(Scanner sc,Account acc) {
        System.out.println("==================用户操作页面====================");
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        while (true) {
            System.out.println("请您输入操作命令：");

            int command =sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    break;
                case 3:
                    //取款
                    break;
                case 4:
                    //转账
                    break;
                case 5:
                    //修改密码
                    break;
                case 6:
                    //退出
                    System.out.println("欢迎下次光临！！");
                    return;//结束当前操作的方法
                case 7:
                    //注销账户
                    break;
                default:
                    System.out.println("您的命令输入有误");
            }
        }
    }

    private static void showAccount(Account acc) {
        System.out.println("卡号："+acc.getCardId());
        System.out.println("姓名："+acc.getUserName());
        System.out.println("余额："+acc.getMoney());
        System.out.println("当次限额："+acc.getQuotaMoney());
    }


    /**
     * 开户功能
     * @param accounts
     */
    private static void register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("==============用户开户功能==============");
        //2.键盘录入 姓名 密码 确认密码
        System.out.println("请您输入开户名称");
        String name=sc.next();
        String password="";

        while (true) {
            System.out.println("请您输入开户密码");
             password=sc.next();

            System.out.println("请您输入确认密码");
            String okPassword=sc.next();

            //判断两次输入的密码是否一致
            if(okPassword.equals(password)){
                break;
            }else {
                System.out.println("两次密码必须一致~~~~");
            }
        }

        System.out.println("请您输入当次限额：");
        double quotaMoney =sc.nextDouble();


        //3.生成一个账户的卡号，卡号是8位，而且不能与其他账户的卡号重复
        String cardId = createCardId(accounts);

        //4.创建一个账户对象封装账户信息
        Account account=new Account(cardId,name,password,quotaMoney);

        //5.把账户对象添加到集合中去
        accounts.add(account);
        System.out.println("恭喜您，您开户成功，您的卡号是："+account.getCardId()+"。请您妥善保管");

    }

    public static  String createCardId(ArrayList<Account> accounts){
        while (true) {
            //生成8位随机的数字代表卡号
            String cardId="";
            Random r =new Random();
            for (int i = 0; i < 8; i++) {
                cardId +=r.nextInt(10);
            }
            //判断卡号是否重复了
            Account acc = getAccountByCardId(cardId,accounts);
            if (acc==null){
                //说明当前卡号没有重复
                return cardId;
            }
        }
    }


    public static Account getAccountByCardId(String cardId,ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc =accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }
}
