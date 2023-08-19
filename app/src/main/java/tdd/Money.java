package tdd;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Money) || !this.getClass().equals(object.getClass())) {
            return false;
        }
        return ((Money) object).amount == this.amount;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public abstract Money times(int amount);

    public String currency() {
        return this.currency;
    }
}
