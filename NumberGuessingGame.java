import java.util.Scanner;
public static void  NumberGuessingGame(){
    Scanner sc = new Scanner(System.in);
    int GeneratedNumber = 1 + (int)(100 * Math.random()); // 1 + (int) (100 * 0.254) => 1 + (int)(25.4) => 1+25 => 26
    int GuessTime = 3 ;

    System.out.println("Welcome to Number Guessing Game");
    System.out.print("The Guessing Numbers are (1 - 100) so  you can guess any number : ");
    
    for(int i = 0 ; i< GuessTime ; i++){
        int GuessNumber = sc.nextInt();
        if(GuessNumber == GeneratedNumber){
            System.out.print("Congratutions!!, You have choosed correct number and you are win this game");
            sc.close();
            return ;
        }
        else if(GuessNumber < GeneratedNumber){
            System.out.println("The Number is greater than "+ GuessNumber);
            
        }
        else {
            System.out.println("The Number is less than "+GuessNumber);
        }

           
    }
    System.out.print("You have exhausted all attempts, The Correct Number was  " + GeneratedNumber);
    sc.close();
}   

public static void main(String[] args){
    NumberGuessingGame();
}