package treeTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yulinsheng
 * @time 2021-03-24 11:24
 */
public class TreeMiddleOrder94 {
}

class Solution {
    public List<Integer> inorderTraversal(TreeNodeTest root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    public void inorder(TreeNodeTest root,List res){
        if(root == null){
            return ;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}