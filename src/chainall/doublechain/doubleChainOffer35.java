package chainall.doublechain;

/**
 * @author yulinsheng
 * @time 2021-03-09-15:45
 * @email yls4314300@163.com
 */
public class doubleChainOffer35 {
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class SolutionOffer35 {
    public Node copyRandomList(Node head) {
        // 第一种情况，头节点为空，返回Null
        if(head == null){
            return null;
        }
        // 建立一个新的节点指向头节点->循环读取原始的节点数据
        Node curNode = head;
        while(curNode != null){
            // 循环读取节点的数据，并且建立新的节点
            Node tempNode = new Node(curNode.val);
            // 将新的节点写入到原始的链表中
            // 1->2  加入节点1    首先将要加入的节点1的next变成2
            // 然后原始节点中1的next变成当前加入节点1
            // 然后当前指针到达了2重复进行复制操作
            tempNode.next = curNode.next;
            curNode.next = tempNode;
            curNode = tempNode.next;
        }

        // 重新回到头节点
        curNode = head;
        while(curNode != null){
            if(curNode.random != null){
                // 写入上述新节点的random指针
                // 当前原始节点的下一个的random
                // 指向原始节点的random的下一个（新的写入节点）
                curNode.next.random = curNode.random.next;}
            // 读取下一个原始节点
            curNode = curNode.next.next;

        }
        // 拆分两种节点
        // 重新回到原始链表的节点
        curNode = head.next;
        Node preNode = head,resNode = head.next;
        while(curNode.next!=null){
            // 原始节点
            preNode.next = preNode.next.next;
            // 新的节点
            curNode.next = curNode.next.next;
            preNode = preNode.next;
            curNode = curNode.next;
        }
        // 原始链表的尾节点的下一个为空
        preNode.next = null;
        return resNode;
    }


}