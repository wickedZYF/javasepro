package demo;

public class Test2 {
    public static void main(String[] args) {
        int[] face={15,234444,35453,987,436,500000};

        int max=0;

        for (int i = 0; i < face.length; i++) {
            if (face[i]>max){
                max=face[i];
            }
        }
        System.out.println(max);
    }
}
