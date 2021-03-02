package java.face;

/**
 * @author yulinsheng
 * @time 2021-03-01-20:42
 * @email yls4314300@163.com
 */
public class equal_denghao {




    public static void main(String [] args){
        String x = "Hello";
        String y = "Hello";
        String z = new String("Hello");
        System.out.println(x==y);
        System.out.println(x==z);
        System.out.println(x.equals(z));
        System.out.println(x.equals(y));
    }
}

