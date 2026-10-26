import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner in= new Scanner(System.in);
        int rndDie1=0;
        int rndDie2=0;
        int crapsRoll=0;
        int crapsRoll2=0;
        String done= "";
        String roll= "";
        do{
            System.out.println("Die1 Die2 Sum");
            System.out.println("-------------------");
           for (int x = 1; x<=1; x++){
              rndDie1= rnd.nextInt(6)+1;
              rndDie2= rnd.nextInt(6)+1;
              crapsRoll= rndDie1+rndDie2;
               System.out.printf("%2d %4d %4d %n", rndDie1, rndDie2, crapsRoll);
               if(crapsRoll == 2){
                   System.out.println("You crapped out. Try again next time.");
               }
               else if(crapsRoll == 3){
                   System.out.println("You crapped out. Try again next time.");
               }
               else if(crapsRoll == 12){
                   System.out.println("You crapped out. Try again next time.");
               }
               else if(crapsRoll == 7){
                   System.out.println("You got a natural. You won!");
               }
               else if (crapsRoll == 11){
                   System.out.println("You got a natural. You won!");
               }
               else{
                   System.out.println("You got the point, keep going! 7 = lose, Same Num = Win.");
                       for (int i = 1; i<=2; i++){
                           rndDie1= rnd.nextInt(6)+1;
                           rndDie2= rnd.nextInt(6)+1;
                           crapsRoll2 = rndDie1+rndDie2;
                           System.out.printf("%2d %4d %4d %n", rndDie1, rndDie2, crapsRoll2);
                           if(crapsRoll == crapsRoll2){
                               System.out.println("You won!");
                               done= "N";
                           } else if (crapsRoll2 == 7) {
                               System.out.println("You lost");
                               done = "N";
                           }
                           else{
                               continue;
                           }
                       }
               }
           }

            System.out.println("Continue playing?");
            done= in.nextLine();
        }while(done.equalsIgnoreCase("Y"));
    }
}
