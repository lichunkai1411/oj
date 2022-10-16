import java.util.Scanner;

public class bintree {
    private bintree left,right;
    private char data;
    public bintree
    creat(String des){
        Scanner scanner=new Scanner(System.in);
        System.out.println("des:"+des);
        String str=scanner.next();
        if(str.charAt(0)<'a')return null;
        bintree root=new bintree();
        root.data=str.charAt(0);
        root.left=creat(str.charAt(0)+"左子树");
        root.right=creat(str.charAt(0)+"右子树");
        return root;
    }
    public void midprint(bintree btree){
//        中序遍历
        if(btree!=null){
            midprint(btree.left);
            System.out.print(btree.data+"  ");
            midprint(btree.right);
        }
    }
    public void firprint(bintree btree){
//        先序遍历
        if(btree!=null){
            System.out.print(btree.data+" ");
            firprint(btree.left);
            firprint(btree.right);
        }
    }
    public void lastprint(bintree btree){
//        后序遍历
        if(btree!=null){
            lastprint(btree.left);
            lastprint(btree.right);
            System.out.print(btree.data+"  ");
        }
    }

    public static void main(String[] args) {
        bintree tree = new bintree();
        bintree newtree=tree.creat("根节点");
        tree.firprint(newtree);
        System.out.println();
        tree.midprint(newtree);
        System.out.println();
        tree.lastprint(newtree);
    }
}