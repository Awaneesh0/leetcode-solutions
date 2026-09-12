import java.util.*;

public class Main1742C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            char winner = 'B'; // Assume Blue won by default
            
            // Read exactly 8 rows for the 8x8 grid
            for (int i = 0; i < 8; i++) {
                String row = sc.next();
                
                // If we find a perfectly intact Red stripe, Red is the winner
                if (row.equals("RRRRRRRR")) {
                    winner = 'R';
                }
            }
            
            System.out.println(winner);
        }
        
        sc.close();
    }
}