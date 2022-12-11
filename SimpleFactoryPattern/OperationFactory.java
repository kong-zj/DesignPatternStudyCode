package SimpleFactoryPattern;

// 工厂类
public class OperationFactory {
    
    public static Operation createOperate(String _operate){

        Operation oper = null;
        switch(_operate){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
