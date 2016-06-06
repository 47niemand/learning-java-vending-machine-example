package vending;

/**
 * Coins supported by Vending Machine.
 *
 * @author Javin Paul
 */
public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}

