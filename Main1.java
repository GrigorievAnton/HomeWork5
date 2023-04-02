import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

    //Задача 2
            Scanner scan = new Scanner(System.in);
            int[] arrayOfNum = new int[10];
            for (int i = 0; i < arrayOfNum.length; i++) {
                arrayOfNum[i] = scan.nextInt();

            }
            for (int i = arrayOfNum.length - 1; i>= 0; i--) {
                System.out.print(arrayOfNum[i] + "  ");
            }
    //Задача 1
            int[] AllNum = new int[15];
            for (int j = 0; j < AllNum.length; j++) {
            AllNum[j] = (int) (Math.random() * 20 + 1);
                System.out.println(AllNum[j]);
            }
            double x =AllNum[0] + AllNum[1] + AllNum[2] + AllNum[3] + AllNum[4] + AllNum[5] +AllNum[6] + AllNum[7] + AllNum[8] + AllNum[9] + AllNum[10] + AllNum[11] + AllNum[12] + AllNum[13] + AllNum[14];
                System.out.println(x / 15);
    }
}

