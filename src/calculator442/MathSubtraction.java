package calculator442;

public class MathSubtraction {
    
    MathNumber first;
    MathNumber second;
    
    public MathSubtraction(MathNumber first, MathNumber second) {
        this.first = first;
        this.second = second;
    }
    
    public MathNumber executeMath() {
        return new MathNumber(first.getNumber() - second.getNumber());
    }
    
}
