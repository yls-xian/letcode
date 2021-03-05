package javaLetcode.chain;

/**
 * @author yulinsheng
 * @time 2021-03-04-11:20
 * @email yls4314300@163.com
 */
public class ChainOffer52 {
}

class SolutionOffer52 {
    public ListNodeSingle getIntersectionNode(ListNodeSingle headA, ListNodeSingle headB) {
//        首先利用A,B获得新的节点值
        ListNodeSingle A = headA,B = headB;
//        当A与B的节点值不相等时，开始循环
        while(A!=B){
//            首先循环A，循环A之后，循环B，只要有相同的节点，两次循环后A与B的值就一定会重和
            if(A != null){
                A = A.next;
            }
            else{ A = headB;}
            if(B!=null){
                B = B.next;
            }
            else{  B = headA;}
        }
        return A;


    }
}

