import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[0];
        int count = 0;
        int i = 1;
        int index = 0;
       byte op;
       while (true){
           System.out.println("""
                   1. Input
                   2. View
                   3. Exit""");
           op = scanner.nextByte();
           if (op == 1){
               System.out.println("Specific Number of Element:");
               int size = scanner.nextInt();
               num = new int[size];
               System.out.println("Input the Element(-1 to exit)");
            while (true) {
                if (count == num.length){
                    int newSize = num.length + 1;
                    num = Arrays.copyOf(num, newSize);
                }
                System.out.println("E[" + i++ + "]: ");
                int input = scanner.nextInt();
                if (input == -1){
                    break;
                }
                num[index++] = input;
                count++;

            }

           } else if (op == 2)   {
               if (num.length == 0){
                   System.out.println("The List is Empty!");
               }else {
               for (i = 0; i < num.length-1; i++){
                   System.out.println("E["+(i+1)+"] = "+num[i]);
               }
               }
           } else if (op == 3) {
               scanner.close();
               return;
           }
       }

    }
}
