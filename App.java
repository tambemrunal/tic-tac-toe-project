import board.Board;
import player.Player;
import game.Game;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Board b=new Board(3);
        b.PrintMatrix();
        Player p=new Player();
        
        
        //p.SetDetails("mrunal", 20,'m', "jeur", 786432278, "mruhfdsx2gmail.com");
        //p.displayDetails();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the player");
        String name=sc.nextLine();
        System.out.println("Enter the character of the player");
        char symbol=sc.nextLine().charAt(0);
        System.out.println("Player 1 Details");
        
        Player p1=new Player();
        p1.setNameAndSymbol("rucha", 'x');
        p1.displayNameAndSymbol();

        Player p2=new Player();
        System.out.println("Player 2 Details");
        p2.setNameAndSymbol("mrunal", 'O');
        p2.displayNameAndSymbol();

        Game game= new Game(new Player[]{p1,p2}, b);
        game.play();

    }
}
