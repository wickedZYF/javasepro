package demo;

public class Test1 {
    public static void main(String[] args) {
        //需求：数组元素求和
        int[] money={16,42,3,100,35};
        int sum=0;
        for (int i = 0; i <money.length ; i++) {
            sum+=money[i];
        }
        System.out.println(sum);
    }
}
