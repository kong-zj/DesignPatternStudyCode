package SimpleFactoryPattern;

import java.io.Console;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class main {
    public static void main(String[] args){

        // init input
        Scanner sc = new Scanner(System.in);
        // init factory
        OperationFactory operFac = new OperationFactory();
        // init operation's index
        Operation oper = null;

        // input
        System.out.println("请输入数字A:");
        double inputNumA = sc.nextDouble();
        System.out.println("请选择运算符号(+-*/):");
        String inputOperater = sc.next();
        System.out.println("请输入数字B:");
        double inputNumB = sc.nextDouble();
        
        // init operation
        oper = OperationFactory.createOperate(inputOperater);
        oper.set_numberA(inputNumA);
        oper.set_numberB(inputNumB);
        // operate
        double result = oper.getResult();

        // output
        System.out.println("结果是" + result);
        

    }
}
