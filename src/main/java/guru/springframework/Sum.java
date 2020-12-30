package guru.springframework;

public class Sum implements Expression {

    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        int amount = augend.reduce(bank, toCurrency).amount
                + addend.reduce(bank, toCurrency).amount;
        return new Money(amount, toCurrency);
    }
}
