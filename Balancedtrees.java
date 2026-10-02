class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean balance=height(root)!=-1;
        return balance;
    }
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        if(left==-1){
           return -1; 
        }
        int right=height(root.right);
        if(right==-1){
            return -1;
        }
        int h=Math.abs(left-right);
        if(h>1){
            return -1;
        }
        return 1+Math.max(left,right);
    }
}


       
