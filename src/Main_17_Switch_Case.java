import java.util.Scanner;

public class Main_17_Switch_Case {
    public static void main(String[] args) {
        /*
        swith (op) {
         case durum1:
          islemler
          break
         case durum2:
          islmler
          break
          //
          //
         default:
          islemler
          break
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Islem sayi no: ");
            int islem = scanner.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("1.islem");
//                    break;
                case 2:
                    System.out.println("2.islem");
//                    break;
                case 3:
                    System.out.println("3.islem");
//                    break;
                case 4:
                    System.out.println("4.islem");
                    break;
                default:
                    System.out.println("Gecersiz islem");
                    break;
            }
        }



    }
