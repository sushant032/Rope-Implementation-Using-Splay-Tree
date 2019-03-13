package rope;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sushant Sinha
 */
public class Node {
    String data;
    int weight;
    Node parent;
    Node lchild;
    Node rchild;
    
    public static void printLevelOrder(Node root) 
    {  
        if(root == null) 
            return; 
        Queue<Node> q =new LinkedList<>();  
        q.add(root); 
        while(true) 
        { 
            int nodeCount = q.size(); 
            if(nodeCount == 0) 
                break; 
            while(nodeCount > 0) 
            { 
                Node node = q.peek(); 
                System.out.print(node.weight); 
                q.remove(); 
                if(node.lchild != null) 
                    q.add(node.lchild); 
                if(node.rchild != null) 
                    q.add(node.rchild); 
                nodeCount--; 
            } 
            System.out.println(); 
        } 
    } 
}
