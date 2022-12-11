package SimpleFactoryPattern;

import java.io.Console;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class main {
    public static void main(String[] args){

        // init
        Scanner sc = new Scanner(System.in);

        // input
        System.out.println("请输入数字A:");
        double inputNumA = sc.nextDouble();
        System.out.println("请选择运算符号(+-*/):");
        String inputOperater = sc.next();
        System.out.println("请输入数字B:");
        double inputNumB = sc.nextDouble();

        // operate
        double result = 1;

        // output
        System.out.println("结果是" + result);
        

    }
}
