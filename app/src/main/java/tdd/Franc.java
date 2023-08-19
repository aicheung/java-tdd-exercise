package tdd;

public class Franc {
    private int amount;
    
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Franc)) {
            return false;
        }
        return ((Franc) object).amount == this.amount;
    }
}