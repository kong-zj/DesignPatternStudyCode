package SimpleFactoryPattern;

public class OperationSub extends Operation{
    public double getResult(){
        double result = 0;
        result = get_numberA() - get_numberB();
        return result;
    }
}
