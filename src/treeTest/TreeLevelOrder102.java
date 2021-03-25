package treeTest;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yulinsheng
 * @time 2021-03-25 21:20
 */
public class TreeLevelOrder102 {
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNodeTest root) {
        // 建立存储结果的双列表结构
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // 根节点为空返回空列表
        if(root == null){
            return res;
        }
        // 定义队列列表
        Queue<TreeNodeTest> queue = new LinkedList<TreeNodeTest>();
//        首先将根元素入队列
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer>  level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for(int i = 1;i <= currentLevelSize;i++){
                TreeNodeTest node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}