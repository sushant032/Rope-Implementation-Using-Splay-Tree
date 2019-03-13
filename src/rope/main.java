package rope;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sushant Sinha
 */
public class main {
    
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           //Variable Declaration
           Node initialParent = new Node();
           String word = "my name is sushant kumar sinha";
           initialParent.weight = word.length();
           Node root = null;
           Rope myRope = new Rope();
           
           System.out.println("Create string");
           root = myRope.createRope(root,word, null, 0,word.length()-1);
           myRope.printLeafs(root);
           System.out.println("");
           
           myRope.printLeafsWeights(root);
           System.out.println("");
           System.out.println("Level Order: ");
           Node.printLevelOrder(root);
           System.out.println("Indexing Starts:");
           for(int i=0;i<word.length();i++)
            System.out.print(myRope.index(root,root,i));
           System.out.println("");

           menu main_menu = new menu();
           int response,inner_res;
           ArrayList<Node> all_ropes = new ArrayList<>();
           Node r1=null,r2=null;
           do{
               main_menu.displayMenu();
               response = sc.nextInt();
               switch(response){
                   case 0:
                        System.out.println("Thank you for using the program.");
                        break;
                   case 1:
                        all_ropes.add(main_menu.create_rope());
                        break;
                   case 2:
                       if(r1!=null){
                       System.out.println("Enter the index to search in rope 1: ");
                       inner_res = sc.nextInt();
                       if(inner_res < r1.weight)
                        System.out.println("The character at index( "+inner_res+") is " + Rope.index(root,r1, inner_res));
                       else
                        System.out.println("Index out of range!");
                       }else{
                           System.out.println("Set the ropes first!");
                       }
                       break;
                   case 3: 
                       System.out.println("Select rope 1: ");
                       inner_res = main_menu.selectRope(all_ropes);
                       r1 = all_ropes.get(inner_res-1);
                       System.out.println("Select rope 2: ");
                       inner_res = main_menu.selectRope(all_ropes);
                       r2 = all_ropes.get(inner_res-1);
                       System.out.println("Ropes set for operations!");
                       break;
                   case 4:
                       System.out.println("Concatenating Rope 1 and Rope 2");
                       main_menu.concat(r1, r2);
               }
           }while(response!=0);
        }
}
