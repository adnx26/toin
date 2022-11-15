import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        boolean gameOver = false;
        while (gameOver == false){
            //Get command
            System.out.println("");
            player.run(sc.nextLine());
        }


        



    }
    
}
