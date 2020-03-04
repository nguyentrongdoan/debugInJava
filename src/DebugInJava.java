import java.util.Scanner;

public class DebugInJava {
    public static void gPt(int a, int b){
        if (a == 0){
            if (b==0)
                System.out.println("phuong trinh co vo so nghiem.");
            else
                System.out.println("phuong trinh vo nghiem.");
        }else {
            if (b != 0)
                System.out.println("phuong trinh co nghiem" + -b/a);
            else
                System.out.println("phuong trinh vo nghiem.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = input.nextInt();
        System.out.println("nhap b: ");
        int b = input.nextInt();
        gPt(a, b);
    }

}
