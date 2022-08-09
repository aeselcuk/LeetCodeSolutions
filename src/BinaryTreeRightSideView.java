import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

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

    private int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    void printCurrentLevel(List<Integer> result,TreeNode root, int level)
    {
        if (root == null){
            level++;
            return;
        }
        if (level == 1)
            result.add(root.val);
        else if (level > 1) {
            printCurrentLevel(result, root.right, level - 1);
            if(root.right == null) printCurrentLevel(result, root.left, level - 1);
        }
    }

    public List<Integer> rightSideView3(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(result, root, i);

       return result;
    }

    private void rightSide(List<Integer> result, TreeNode root) {
        if(root == null){

        }
        result.add(root.val);
        if(root.right != null){
            rightSide(result, root.right);
        }else {
            rightSide(result, root.left);
        }
    }

    private int maxDepth = -1;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
       
        helper(result,root,0);

       return result;
    }

    private void helper(List<Integer> result, TreeNode root, int currDepth) {

        if(root == null) return;

        if(currDepth > maxDepth){
            result.add(root.val);
            maxDepth = currDepth;
        }

        helper(result, root.right, currDepth+1);
        helper(result, root.left, currDepth+1);
    }
    public static void main(String[] args) {
        BinaryTreeRightSideView st = new BinaryTreeRightSideView();
        TreeNode four = st.new TreeNode(4);
        TreeNode three = st.new TreeNode(3);
        TreeNode twoLeft = st.new TreeNode(2,four, null);
        TreeNode twoRight = st.new TreeNode(2, four, three);
        TreeNode one = st.new TreeNode(1, twoLeft, three);



        st.rightSideView(one);
    }
}
