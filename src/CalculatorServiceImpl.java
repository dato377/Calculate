public class CalculatorServiceImpl implements  CalculatorService{
    private int a;
    private int b;
    public CalculatorServiceImpl(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int sum() {
        int c = a+b;
        return c;
    }

    @Override
    public int prod() {
        int c= a*b;
        return c;
    }
}
