import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    private boolean symmetric = true;
    private void checkSymmetry(TreeNode tree1, TreeNode tree2){
        if(tree1 == null && tree2 == null) return;
        if(tree1.val != tree2.val){
            symmetric = false;
            return;
        }

        checkSymmetry(tree1.left, tree2.right);
        checkSymmetry(tree1.right, tree2.left);

    }

    public boolean isSymmetric(TreeNode root) {
        
        checkSymmetry(root.left, root.right);
        return symmetric;

    }

    public static void main(String[] args) {
        SymmetricTree st = new SymmetricTree();
        TreeNode four = st.new TreeNode(4);
        TreeNode three = st.new TreeNode(3);
        TreeNode twoLeft = st.new TreeNode(2,three, three);
        TreeNode twoRight = st.new TreeNode(2, four, three);
        TreeNode one = st.new TreeNode(1, twoLeft, twoRight);
        
        System.out.println(st.isSymmetric(one));

    }
}
