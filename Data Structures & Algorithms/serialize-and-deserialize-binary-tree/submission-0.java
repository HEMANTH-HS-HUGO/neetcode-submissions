/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    private int i=0;
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        sdfs(root,str);
        return str.toString();
        
    }
    public void sdfs(TreeNode node, StringBuilder str){
            if(node == null){
                str.append("N,");
                return;
            }
            str.append(node.val).append(",");
            sdfs(node.left,str);
            sdfs(node.right,str);
        }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        i=0;
        return ddfs(str);

    }
    public TreeNode ddfs(String[] str){
            if(str[i].equals("N")){
                i++;
                return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(str[i]));
            i++;
            node.left = ddfs(str);
            node.right = ddfs(str);
            return node;
        }
}
