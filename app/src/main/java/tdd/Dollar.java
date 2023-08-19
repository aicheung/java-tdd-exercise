package tdd;

public class Dollar {
   
    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Dollar)) {
            return false;
        }
        return ((Dollar) object).amount == this.amount;
    }
}