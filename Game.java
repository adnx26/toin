import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        while (true){
            System.out.println("");
            String inp = sc.nextLine();
            player.run(inp);
            break;
        }

    }
    
}
