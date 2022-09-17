package Practice_day01;

import java.util.Scanner;

public class Q13_IfStatement03 {
    /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen ünvanınızı girin");

        String unvan= scan.nextLine().toUpperCase();
        // unvan.equalsIgnoreCase(unvan);

        switch (unvan){
            case "QA":
                System.out.println("Quality Analyst");
                break;
            case "DEV":
                System.out.println("Developer");
                break;
            case "BA":
                System.out.println("Business Analyst");
                break;
            case "PM":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("geçerli kısaltma girin");
        }
    }
}
