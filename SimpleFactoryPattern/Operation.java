package SimpleFactoryPattern;

public abstract class Operation {

    private double _numberA = 0;
    private double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }
    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }
    public double get_numberB() {
        return _numberB;
    }
    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public abstract double getResult();
    
}
