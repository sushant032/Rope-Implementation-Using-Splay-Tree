package rope;

/**
 *
 * @author Sushant Sinha
 */

public class Rope {
   static int LEAF_LENGTH = 2;
   Node createRope(Node st,String s ,Node parent,int start, int end){
           Node n = new Node();
           if(end-start> LEAF_LENGTH){
            int mid;
            mid = (end+start)/2;
            n = new Node();
            n.data = null;
            n.parent = parent;
            n.weight = s.substring(start, end).length()+1;
            n.lchild = null;
            n.rchild = null;
            st = n;
            n.lchild = createRope(n.lchild,s, n, start, mid);
            n.rchild = createRope(n.rchild,s, n, mid+1,end);
           }else{
               String ss = "";
               for(int i=start;i<=end;i++)
                   ss+=s.charAt(i);
            n.data = ss;
            n.weight = ss.length();
            n.lchild = null;
            n.rchild = null;
            n.parent = parent;
            st = n;
           }  
           return n;
   }
   public static char index(Node root,Node node, int i){
    if(i >node.weight)
        return index(root,node.rchild, i - node.weight);
    else if(node.lchild!=null && node.lchild.weight>i)
        return index(root,node.lchild, i);
    else if(node.rchild!=null)
        return index(root,node.rchild, i-node.lchild.weight);
    char ret = node.data.charAt(i);
//    splay(root, node.parent);
    return ret;
 
   }
   
   public static Node concat(Node rope1, Node rope2){
        Node newNode = new Node();
        newNode.weight = rope1.weight + rope2.weight;
        newNode.lchild = rope1;
        newNode.rchild = rope2;
        newNode.data = null;
        newNode.parent = null;
        return newNode;
   }
   void printLeafsWeights(Node n){
       if(n==null)
           return;
       if(n.lchild==null && n.rchild== null)
           System.out.print(n.weight+" ");
       printLeafsWeights(n.lchild);
       printLeafsWeights(n.rchild);
   }
   public static void printLeafs(Node n){
       if(n==null)
           return;
       if(n.lchild==null && n.rchild== null)
           System.out.print(n.data);
       printLeafs(n.lchild);
       printLeafs(n.rchild);
   }
  
   void insert_word(String str){
       //Code to insert string 
       
   }
   
    public static void leftRotate(Node root,Node x){
      Node y = x.rchild;
      if(y!=null){
          if(y.lchild!=null){
            x.rchild = y.lchild;
            y.lchild.parent = x;
          }
        y.parent = x.parent;
      }
      if(x.parent == null){
        root = y;
      }else{
        if(x == x.parent.lchild)
          x.parent.lchild = y;
        else
          x.parent.rchild = y;
      }
      if(y!=null)
        y.lchild = x;
      x.parent = y;
    }
    
    public static void rightRotate(Node root,Node x){
        Node y = x.lchild;
         if(y!=null){
            if(y.rchild!=null){
                x.lchild = y.rchild;
                y.rchild.parent = x;
            }
            y.parent = x.parent;
         }
        if(x.parent == null){
          root = y;
        }else{
          if(x == x.parent.lchild)
            x.parent.lchild = y;
          else
            x.parent.rchild = y;
        }
        if(y!=null)
            y.rchild = x;
        x.parent = y;
    }
    
    public static void splay(Node root,Node node){
//        System.out.println(node.data);
        while(node.parent!=null){
            Node p;
            System.out.println(node.parent);
            p = node.parent;
            if(node == p.lchild){
                System.out.println("right");
                rightRotate(root,node);
            }
            else if(node == p.rchild){
                System.out.println("left");
                leftRotate(root, node);
            }
        }
    }
}
