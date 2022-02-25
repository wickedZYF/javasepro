package com.zyf.loop;

public class BreakAndCountionDemo1 {
    public static void main(String[] args) {
        //目标：理解break和continue的作用
        //场景：假如你又有老婆了，然后你犯错了，罚你做5天家务，每天洗碗，洗到第三天心软了，不用洗了
        for (int i = 0; i < 5; i++) {
            System.out.println("快乐的洗碗");
            if (i==2){
                break;
            }
        }

        //场景：假如你又有老婆了，然后你犯错了，罚你做5天家务，每天洗碗，洗到第三天心软了，不用洗了,但依然不解恨，45两天接着洗
        for (int i = 1; i <=5; i++) {
            if (i==3){
                continue;
            }
            System.out.println("x洗碗"+i);
        }
    }
}
