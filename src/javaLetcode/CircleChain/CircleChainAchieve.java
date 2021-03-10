package javaLetcode.CircleChain;

/**
 * @author yulinsheng
 * @time 2021-03-10-16:01
 * @email yls4314300@163.com
 */
//创建一个环形的单项链表
public class CircleChainAchieve {
//    创建第一个节点
    Boy first = new Boy(-1);
//    添加节点，构建环形链表,nums对应添加的节点
    public void addBoy(int nums){
        if(nums < 1){
            System.out.println("nums的值不合适");
            return;
        }
        Boy cur = null;
//        创建环形链表
        for(int i = 1;i <= nums;i++){
            Boy boy = new Boy(i);
            if(i == 1){
                first = boy;
                first.setNext(boy);//构成一个环
                cur = first;//cur指向第一个节点
            }
            else{
//                原始节点的下一个元素指向新的boy节点
                cur.setNext(boy);
//                新的节点的下一个节点指向first节点
                boy.setNext(first);
//                指针指向当前新添加的节点
                cur = boy;

            }

        }
    }

}

class Boy{
    private int no;

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }

    private Boy next;
    public Boy(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}


