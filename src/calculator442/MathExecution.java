package calculator442;

public class MathExecution {
    
    public MathNumber mn1;
    public MathNumber mn2;
    
    public MathExecution(MathNumber mn1, MathNumber mn2) {
        this.mn1 = mn1;
        this.mn2 = mn2;
    }
    
    public void setMathNumber1(MathNumber mn1) {
        this.mn1 = mn1;
    }
    
    public void setMathNumber2(MathNumber mn2) {
        this.mn2 = mn2;
    }
    
    public MathNumber doAdd() {
        MathAddition result = new MathAddition(mn1, mn2);
        return result.executeMath();
    }
    
    public MathNumber doSubtract() {
        MathSubtraction result = new MathSubtraction(mn1, mn2);
        return result.executeMath();
    }
    
    public MathNumber doMult() {
        MathMultiplication result = new MathMultiplication(mn1, mn2);
        return result.executeMath();
    }
    
    public MathNumber doDivide() {
        MathDivision result = new MathDivision(mn1, mn2);
        return result.executeMath();
    }
}
