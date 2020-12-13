package calculator442;

public class MathAddition {
    
    MathNumber first;
    MathNumber second;
    
    public MathAddition(MathNumber first, MathNumber second) {
        this.first = first;
        this.second = second;
    }
    
    public MathNumber executeMath() {
        return new MathNumber(first.getNumber() + second.getNumber());
    }
    
}
