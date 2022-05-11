import java.util.Scanner;

public class pigDice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int roll, ptot, ctot, turnTotal;
        String choice = "";

        ptot = 0;
        ctot = 0;

        do {
            turnTotal =0;
            System.out.println("You have " + ptot + " points.");

            do {
                roll = 1 + (int)(Math.random()*6);
                System.out.println("\t You rolled " + roll);
                if (roll == 1) {
                    System.out.println("\tThat ends your turn.");
                    turnTotal = 0;
                }
                else {
                    turnTotal += roll;
                    System.out.print("\t You have " + turnTotal + " points");
                    System.out.print(" so far this round.\n");
                    System.out.print("\tWould you like to \"roll\" again");
                    System.out.print(" or \"hold\"? ");
                    choice = keyboard.next();
                }
            } while (roll!=1&&choice.equals("roll"));
        
            ptot += turnTotal;
            System.out.println("\tYou end the round with "+ptot+" points.");
        
            if (ptot<100) {
                turnTotal = 0;
                System.out.println("Computer has " + ctot + " points.");

                do {
                    roll = 1 + (int)(Math.random()*6);
                    System.out.println("Computer rolled a " + roll);
                    if (roll == 1) {
                        System.out.println("That ends its turn");
                        turnTotal = 0;
                    }
                    else{
                        turnTotal+=roll;
                        cWinCheck+=(turnTotal+ctot);
                        System.out.println("\tComputer has "+turnTotal+" points so far this round");
                        if (turnTotal<20&&cWinCheck<123){
                            System.out.println("\tComputer will roll again.");
                        }
                    }
                } while (roll!=1&&turnTotal<20&&cWinCheck<123); //cWinCheck is put here to check the total points the computer WOULD have if they ended their turn then and there, to tell them to finish the turn if they DO win.
                
                ctot+=turnTotal;
                System.out.println("\tComputer ends the round with "+ctot+" points.");
            }
        } while (ptot<123&&ctot<123);
        
        if(ptot>ctot){
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer wins!");
        }
    }
}
