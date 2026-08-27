import java.util.*;

public class Main115A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // Use a 1-based array to match the employee numbers exactly
        int[] manager = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            manager[i] = sc.nextInt();
        }
        
        int maxGroups = 0;
        
        // Check the chain length for every single employee
        for (int i = 1; i <= n; i++) {
            int currentDepth = 1;
            int currentEmployee = i;
            
            // Walk up the chain of command until we hit someone with no manager (-1)
            while (manager[currentEmployee] != -1) {
                currentEmployee = manager[currentEmployee];
                currentDepth++;
            }
            
            // Keep track of the longest chain we've seen
            if (currentDepth > maxGroups) {
                maxGroups = currentDepth;
            }
        }
        
        System.out.println(maxGroups);
        
        sc.close();
    }
}