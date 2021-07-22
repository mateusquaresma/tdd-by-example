package money;

public class Sum implements Expression {

    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(addend.currency(), augend.currency()q);
        return new Money(augend.amount + addend.amount / rate, to);
    }
}
