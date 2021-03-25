package treeTest;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yulinsheng
 * @time 2021-03-24 11:09
 */
public class TreeFirstOrder144 {
    public static void main(String[] args) {
        System.out.println("hello tree");
    }
}
/*
        前序遍历，是从根节点，左子树，右子树的顺序完成的。
 */
class Solution242 {
    public List<Integer> preorderTraversal(TreeNodeTest root) {
//        定义个列表
        List<Integer> res = new ArrayList<>();
//        调用递归
        preOrder(root,res);
        return res;
    }
    public void preOrder(TreeNodeTest root,List<Integer> res){
//        只要根节点为空则返回
        if(root == null){
            return;
        }
        res.add(root.val);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }

}