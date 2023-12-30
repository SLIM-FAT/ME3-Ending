package Mehrbod.MassEffect.ending;
import java.util.Objects;
import java.util.Scanner;
//TODO: Write the complete documentation for Input from ground up.
public class Input {
    Scanner scn = new Scanner(System.in);
    String playerInput;
    int playerChoice;
    boolean isChoiceValid;

    public Input(int numOptions){
        isChoiceValid = true;
        while(isChoiceValid) {
            playerInput = scn.nextLine().toLowerCase();
            isValid(numOptions);
        }
    }
    public Input(int numOptions, String playerInput){
        this.playerInput = playerInput;
        isValid(numOptions);
    }
    protected void printData(){
        System.out.println(playerInput);
    }

    protected void isValid(int options){
        int i = 0;
        try{
            i = Integer.parseInt(playerInput);
            if((i <= options) && (i > 0)){
                playerChoice = i;
                isChoiceValid = false;
            }
            else{
                //throw new RuntimeException("please use an appropriate option");
                System.out.println("please use an appropriate option");
            }
        } catch (NumberFormatException e) {
            //throw new RuntimeException("please use a not retarded option");
            System.out.println("please use a not retarded option");
            // i = options + 1;
        }
    }
}
