package tdd;

public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Money) || !this.getClass().equals(object.getClass())) {
            return false;
        }
        return ((Money) object).amount == this.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int amount);
}
