package tree;


  import java.*;
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
 
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        traverse(root,ans);
        return ans;
    }
    public void traverse(TreeNode curr,List<Integer> ans){
        if(curr!=null){
            traverse(curr.left,ans);
            ans.add(curr.val);
            traverse(curr.right,ans);
        }
        
    }
}