import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 求数的二进制之中1的个数，负数用补码形式保存
 * @Auther danni
 * @Date 2019/7/26 19:51]
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n=scanner.nextInt();
        int num1=0;
        int num2=0;
        //方法1
        for (int i = 0; i <32 ; i++) {
            if((n&(1<<i))!=0){
                num1++;
            }
        }
        //方法2
        while(n!=0){
            n=n&(n-1);
            num2++;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
