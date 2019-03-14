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
    public static int balanceWeights(Node root){
       //Code to insert string 
       if(root.lchild == null && root.rchild == null)
           return root.weight;
      int w1 =  balanceWeights(root.lchild);
      int w2 = balanceWeights(root.rchild);
      root.weight = w1+w2;
      return root.weight;
   }
   
   public static Node index(Node root,Node node, int i){
//       System.out.println(node);
    if(i >node.weight)
        return index(root,node.rchild, i - node.weight);
    else if(node.lchild!=null && node.lchild.weight>i)
        return index(root,node.lchild, i);
    else if(node.rchild!=null)
        return index(root,node.rchild, i-node.lchild.weight);
    char ret = node.data.charAt(i);
//    System.out.println("parent node to splay: "+node.parent);
    root = splay(root, node.parent);
       System.out.print(ret);
       System.out.println("");
//    System.out.println("root in index: "+root);
//    System.out.println("Indexing done!");
    balanceWeights(root);
    return root;
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
    public static void leftRotate(Node root,Node x){
      Node y = x.rchild;
      
        x.rchild = y.lchild;
        y.lchild.parent = x;
        y.parent = x.parent;
      if(x.parent == null){
        root = y;
      }else{
        if(x == x.parent.lchild)
          x.parent.lchild = y;
        else
          x.parent.rchild = y;
      }
      y.lchild = x;
      x.parent = y;
    }
    
    public static void rightRotate(Node root,Node x){
        Node y = x.lchild;
      
            x.lchild = y.rchild;
            y.rchild.parent = x;
            y.parent = x.parent;
        if(x.parent == null){
          root = y;
        }else{
          if(x == x.parent.lchild)
            x.parent.lchild = y;
          else
            x.parent.rchild = y;
        }
        y.rchild = x;
        x.parent = y;
    }
    
    public static Node splay(Node root,Node node){
//        System.out.println(node.data);
        while(node.parent!=null){
            Node p,gp;
            System.out.println(node);
            p = node.parent;
            gp = p.parent;
            //left subtree
            if(node == p.lchild){
                //Child of root
                if(gp == null){
//                    System.out.println("Child of root!");
                    rightRotate(root, p);
                }
                //zig-zag
                else if(p == gp.rchild){
//                    System.out.println("Left Zig-Zag");
                    rightRotate(root, p);
                    leftRotate(root, gp);
                }else if(p == gp.lchild){
//                    System.out.println("Left Zig-ZIg");
                    rightRotate(root, p);
                    rightRotate(root, gp);
                }       
            }else{
             //right subtree
               //Child of root
                if(gp==null){
//                    System.out.println("Child of root!");
                    leftRotate(root, p);
                }
                //zig-zag
                else if(p == gp.lchild){
//                    System.out.println("Left Zig-Zag");
                    leftRotate(root, p);
                    rightRotate(root, gp);
                }else if(p == gp.rchild){
//                    System.out.println("Left Zig-ZIg");
                    leftRotate(root, p);
                    leftRotate(root, gp);
                }
            }   
        }
        
        root =  node;
        return root;
//        System.out.println("in splay: "+root);
    }
}
