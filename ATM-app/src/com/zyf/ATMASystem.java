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
                        showUserCommand(sc,acc,accounts);
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
    private static void showUserCommand(Scanner sc,Account acc,ArrayList<Account> accounts) {
        while (true) {
        System.out.println("==================用户操作页面====================");
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        System.out.println("请您输入操作命令：");

        int command =sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(sc,acc,accounts);
                    break;
                case 5:
                    //修改密码
                    updatePassword(sc,acc);
                    return;//结束当前操作的方法，跳出去
                case 6:
                    //退出
                    System.out.println("欢迎下次光临！！");
                    return;//结束当前操作的方法，跳出去
                case 7:
                    //注销账户
                   if (deleteAccount(acc,sc,accounts)){
                       //销户成功了，回到首页
                       return;//结束当前操作的方法，跳出去
                   }
                    else {
                        //没有销户成功，还在操作页玩
                        break;
                   }
                default:
                    System.out.println("您的命令输入有误");
            }
        }
    }

    /**
     * 销户功能
     * @param acc
     * @param sc
     * @param accounts
     */
    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("==============用户销户=============");
        //从当前账户集合中，删除当前账户集合，销毁就完成了
        System.out.println("您真的要销户？y/n");
        String rs=sc.next();
        switch (rs){
            case "y":
                if (acc.getMoney()>0){
                    System.out.println("您的账户还有钱没取，不许销户，达咩~");
                }else {
                    //真要销户了，开销
                    accounts.remove(acc);
                    System.out.println("您的账户已被销毁了");
                    return true;//销户成功
                }
                break;
            default:
                System.out.println("好的，当前账户继续保留");
        }
        return false;
    }

    /**
     * 修改密码
     * @param sc 扫描器
     * @param acc  当前登录成功对象
     */
    private static void updatePassword(Scanner sc, Account acc) {
        while (true) {
            System.out.println("==============修改密码=============");
            System.out.println("请您输入当前密码：");
            String password= sc.next();
            //1.判断密码是否正确
            if (acc.getPassWord().equals(password)){
                while (true) {
                    //密码正确
                    //2.输入新密码
                    System.out.println("请您输入新密码：");
                    String newPassword= sc.next();
                    System.out.println("请您再次输入新密码：");
                    String okPassword= sc.next();
                    if (newPassword.equals(okPassword)){
                        //两次密码一致，可以修改
                        acc.setPassWord(newPassword);
                        System.out.println("恭喜你，密码修改成功");
                        return;
                    }else {
                        System.out.println("两次密码不一致~~");
                    }
                }
            }
            else {
                System.out.println("您输入的密码不正确");
            }
        }
    }


    /**
     * 转账功能
     * @param sc 扫描器
     * @param acc 自己的账户对象
     * @param accounts 全部账户集合
     */
    private static void transferMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
        System.out.println("============用户转账操作================");
        //1.判断是否有足够2个账户
        if (accounts.size()<2){
            System.out.println("当前账户系统中，不足2个账户，不能进行转账，请去开户吧~~~");
            return;//结束当前方法
        }
        if (acc.getMoney()==0){
            System.out.println("对不起，你自己都没钱，就别转了吧~~");
            return;//结束当前方法
        }

        while (true) {
            //3.真正开始转账
            System.out.println("请您输入对方账户的卡号");
            String cardId =sc.next();

            //这个卡号不能是自己的卡号
            if(cardId.equals(acc.getCardId())){
                System.out.println("对不起，您不可以给自己进行转账！");
                continue;
            }

            //判断卡号是存在的，根据卡号去查询对方账户对象
            Account account=getAccountByCardId(cardId,accounts);
            if (account==null){
                System.out.println("对不起，您输入的这个卡号不存在~~");
            }
            else {
                //这个账户对象存在,继续认证他的姓氏
                String userName =account.getUserName();
                String tip="*"+userName.substring(1);
                System.out.println("请您输入["+tip+"]的姓氏");
                String preName=sc.next();
                //认证姓氏是否输入正确。
                if(userName.startsWith(preName))//startsWith()判断文本是否以某个字符开始
                {


                    while (true) {
                        //确认通过，真正开始转账了
                        System.out.println("请您输入转账金额");
                        double money = sc.nextDouble();
                        //判断余额是否足够
                        if (money>acc.getMoney()){
                            System.out.println("对不起，您的余额不足，您最多可以转账："+acc.getMoney());
                        }else {
                            //余额足够，可以转账
                            acc.setMoney(acc.getMoney()-money);
                            account.setMoney(acc.getMoney()+money);
                            System.out.println("转账成功！您的账户余额还剩："+acc.getMoney());
                            return;//直接干掉转账方法
                        }
                    }


                }else {
                    System.out.println("对不起，您输入的信息有误~~");
                }

            }
        }


    }


    /**
     * 取款功能
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("====================用户取钱操作===================");
        //1.判断是否足够100元
        if(acc.getMoney()<100){
            System.out.println("对不起，当前账户不够100元，不能取钱");
            return;
        }
        //2.提示用户输入取钱金额
        System.out.println("请您输入取款金额：");
        double money =sc.nextDouble();

        //3.判断这个金额是否满足要求
        if(money>acc.getQuotaMoney()){
            System.out.println("对不起，您当前取款金额超过每次限额，每次最多可取："+acc.getQuotaMoney());
        }else {
            //没有超过当次限额
            //4.判断是否超过了账户的余额
            if (money>acc.getMoney()){
                System.out.println("余额不足，您目前的账户总余额是："+acc.getMoney());
            }else {
                //可以取钱了
                System.out.println("恭喜你，取钱"+acc.getMoney()+"成功");
                //更新余额
                acc.setMoney(acc.getMoney()+-money);
                //取钱结束
                showAccount(acc);
                return;//干掉取钱方法
            }
        }

    }



    /**
     * 存钱
     * @param acc  当前账户对象
     * @param sc       扫描器
     */
    private static void depositMoney(Account acc,Scanner sc) {
        System.out.println("===============用户存钱操作================");
        System.out.println("请您输入存款金额：");
        double money=sc.nextDouble();
        //更新账户：原来的钱+新存入的钱
        acc.setMoney(acc.getMoney()+money);
        System.out.println("恭喜你，存钱成功，当前账户信息如下：");
        showAccount(acc);
    }

    /**
     * 展现卡内信息
     * @param acc
     */
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


    /**
     * 生成8位卡号
     * @param accounts
     * @return
     */

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

    /**
     * 判断卡号是否重复
     * @param cardId
     * @param accounts
     * @return
     */
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
