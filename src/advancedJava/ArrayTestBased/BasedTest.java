package advancedJava.ArrayTestBased;

/**
 * @author yulinsheng
 */

/*
    Arrays同样位于java.utils中
    使用同样要引入上述包
    填充数组
        Arrays.fill(数组名，需要填充的元素值);
    数组排序
        Arrays.sort()
        反向排序，同样需要利用Collecitons.reverseOrder(),仅仅支持String类型的元素
        Arrays.sort(arr,0,3)->按照数组的指定位置排序，从第0位开始不包含第3位排序
    将数组的内容全部显示出来
        Arrays.toString(),需要一个元素获得新的改变量才可以，不然的话输出的是地址值。
    判断两个数组元素是否相等
        Arrays.equals()
    利用二分法查找指定元素的索引值
        Arrays.binarySearch(数组，元素值)->需要数组提前排好顺序。
    截取数组的数据->提取的是一个数组，需要对应的数组，否则输出的是数组的首地址值。
        Arrays.copeOf(数组，前一个元素)
        Arrays.copeOfRange(数组，下标1，下标2（不包括）)
 */
import java.util.Arrays;
import java.util.Collections;

public class BasedTest {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int [] arrFill = new int[5];
//        Arrays.fill(arrFill,4);
//        for(int i = 0;i < arrFill.length;i++){
//            System.out.println(arrFill[i]);
//        }
////        Arrays.sort(arr);
//        String [] arr1 = new String[]{"a","b","cd","ce"};
//
//        Arrays.sort(arr1,Collections.reverseOrder());
//        for(int i = 0;i < arr1.length;i++){
//            System.out.print(arr1[i]);
//        }
//        Arrays.toString(arr);
//        System.out.println(arr);
//        String str = Arrays.toString(arr);
//        System.out.println(str);
//        System.out.println(Arrays.equals(arr,arrFill));
        System.out.println(Arrays.binarySearch(arr,3));
        int [] arr1 = Arrays.copyOf(arr,3);
        String arr1S = Arrays.toString(arr1);
        System.out.println(arr1S);
        System.out.println(Arrays.copyOfRange(arr,1,3));

    }
}
