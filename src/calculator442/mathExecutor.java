package calculator442;

public class mathExecutor {
    
    public double double1;
    public double double2;
    
    public mathExecutor(double double1, double double2) {
        this.double1 = double1;
        this.double2 = double2;
    }
    
    public void setInt1(double double1) {
        this.double1 = double1;
    }
    
    public void setInt2(double double2) {
        this.double2 = double2;
    }
    
    public double doAdd() {
        return double1 + double2;
    }
    
    public double doSubtract() {
        return double1 - double2;
    }
    
    public double doMult() {
        return double1 * double2;
    }
    
    public double doDivide() {
        return double1 / double2;
    }
}
