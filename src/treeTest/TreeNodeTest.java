package treeTest;

/**
 * @author yulinsheng
 * @time 2021-03-24 11:09
 */

//Definition for a binary tree node.
public class TreeNodeTest {
//    定义树节点的参数值
    int val;
//    定义树节点的左子树
    TreeNodeTest left;
//    定义树节点的右子树
    TreeNodeTest right;
//    定义数节点的空参构造器
    TreeNodeTest() {}
//    带参构造器
    TreeNodeTest(int val) { this.val = val; }
    TreeNodeTest(int val, TreeNodeTest left, TreeNodeTest right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
