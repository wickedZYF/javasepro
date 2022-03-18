package com.zyf.run;

import ch.qos.logback.core.joran.conditional.ElseAction;
import com.zyf.bean.Business;
import com.zyf.bean.Customer;
import com.zyf.bean.Movie;
import com.zyf.bean.User;

import java.sql.SQLOutput;
import java.util.*;

/**
 * 定义系统的数据容器用户存储数据
 * 1.存储很多用户（客户对象，商家对象 ）
 */
public class MovieSystem {
    /**
     定义系统的数据容器用户存储数据
     1、存储很多用户（客户对象，商家对象）
     */
    public static final List<User>ALL_USERS=new ArrayList<>();

    /**
     2、存储系统全部商家和其排片信息 。
     商家1 = [p1,p2,p3,...]
     商家2 = [p2,p3,...]
     ...
     */

    public static Map<Business,List<Movie>> ALL_MOVIES=new HashMap<>();

    public static final Scanner SYS_SC=new Scanner(System.in);

    public static User loginUser;//定义一个静态的Uesr类型变量记住当前登录成功的用户对象


    /**
     3、准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b , movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2 , movies3); // b2 = []
    }

    public static void main(String[] args) {
        showmain();
    }

    private static void showmain() {
        while (true) {
            System.out.println("===============羿凡电影首页=================");
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("请输入操作命令：");
            String command=SYS_SC.nextLine();
            switch (command){
                case "1":
                    //登录了
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请确认");
            }
        }
    }

    /**
     * 登录功能
     */
    private static void login() {
        while (true) {
            System.out.println("请您输入登录名称：");
            String loginName=SYS_SC.nextLine();
            System.out.println("请你输入登录密码");
            String passWord=SYS_SC.nextLine();

            //根据登录名称查询用户对象
            User u=getUserByLoginName(loginName);
            //判断用户对象是否存在，存在说明登录名正确了
            if(u!=null){
                //对比密码是否正确
                if(u.getPassWord().equals(passWord)){
                    //真正登录成功了
                    loginUser=u;//记录登录成功的用户
                    //判断是用户登录还是商家登录
                    if(u instanceof Customer){
                        //登录为普通用户
                        showCustomerMain();
                    }else {
                        //登录为商家用户
                        showBusinessMain();
                    }
                    return;
                }else {
                    System.out.println("密码有问题");
                }

            }else {
                System.out.println("登录名称错误，请确认");
            }
        }

    }

    /**
     * 商家后台操作界面
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============羿凡电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex()=='男'? "先生":"女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息

                    break;
                case "2":
                    // 上架电影信息

                    break;
                case "3":
                    // 下架电影信息

                    break;
                case "4":
                    // 修改电影信息

                    break;
                case "5":

                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============羿凡电影客户界面===================");
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    // 展示全部排片信息

                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能

                    break;
                case "4":
                    // 购票功能

                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    public static User getUserByLoginName(String loginName){
        for (User user : ALL_USERS) {
            //判断这个用户的登录名是否是我们想要的
            if(user.getLoginName().equals(loginName)){
                return user;
            }
        }
        return null;
    }

}
