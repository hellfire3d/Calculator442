package calculator442;

public class MathMultiplication {
    
    MathNumber first;
    MathNumber second;
    
    public MathMultiplication(MathNumber first, MathNumber second) {
        this.first = first;
        this.second = second;
    }
    
    public MathNumber executeMath() {
        return new MathNumber(first.getNumber() * second.getNumber());
    }
    
}
