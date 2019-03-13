package rope;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sushant Sinha
 */
public class menu {
    public static Scanner sc = new Scanner(System.in);
    public void displayMenu(){
        System.out.println("------------------Rope Data Structure Menu------------------");
        System.out.println("1. Create new rope \t2. Char at Index\t3. Select Ropes");
        System.out.println("4. Concat Rope ");
        System.out.println("0. Exit");
        System.out.println("------------------------------------------------------------");
    }
    
    public Node create_rope(){
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        Rope newRope = new Rope();
        Node root = null;
        root = newRope.createRope(root,word, null, 0,word.length()-1);
        return root;
    }
    
    public void concat(Node rope1, Node rope2){
        Node concatNode = Rope.concat(rope1, rope2);
        Rope.printLeafs(concatNode);
        System.out.println("");
    }
    
    public int selectRope(ArrayList<Node> allRopes){
        int count = 1;
        System.out.println("Displaying all ropes: ");
        for(Node n:allRopes){
            System.out.print(count+". ");
            Rope.printLeafs(n);
            System.out.println("");
            count+=1;
        }
        int selection = sc.nextInt();
        return selection;
        
    }
}
