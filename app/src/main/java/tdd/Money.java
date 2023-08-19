package tdd;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        if(object == null || !(object instanceof Money)) {
            return false;
        }
        return ((Money) object).amount == this.amount;
    }
}
