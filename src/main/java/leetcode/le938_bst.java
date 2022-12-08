package leetcode;

class TreeNode {
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

public class le938_bst {
    public static void main(String args[]){
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        int[] as = new int[]{1, 2, 3};

        TreeNode bst = new TreeNode(1,left,right);

        System.out.println(bst.val);
        System.out.println(bst.getClass());
    }


}
//
//class Solution {
//    public int rangeSumBST(TreeNode root, int low, int high) {
//        TreeNode left = new TreeNode(low);
//        TreeNode right = new TreeNode(high);
//        TreeNode bst = new TreeNode(root.val,left,right);
//        int sum = 0;
//        while(bst.val<=bst.right.val){
//            if(bst.left.val > bst.val ){
//                left.val = root.val;
//                root.val = left.val;
//
//                sum = sum + left.val;
//            }
//        }
//        return sum;
//    }
//}