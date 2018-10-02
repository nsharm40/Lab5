/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * An enum to set type of bank account.
     */
    public enum BankAccountType {
        /** Enum for checking account. */
        CHECKINGS,
        /** Enum for savings account. */
        SAVINGS,
        /** Enum for student account. */
        STUDENT,
        /** Enum for workplace account. */
        WORKPLACE
    }

    /** Int for account number. */
    private int accountNumber;
    /** Type of bank account. */
    private BankAccountType accountType;
    /** Double for account balance. */
    private double accountBalance;
    /** String for account owner's name. */
    private String ownerName;
    /** Double for rate of interest on account. */
    private double interestRate;
    /** Double for amount of interest earned. */
    private double interestEarned;

    /**
     * Constructor for BankAccount objects.
     *
     * @param name name for owner to set
     * @param accountCategory sets the type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * Gets account number.
     *
     * @return account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number.
     *
     * @param accountN account number to set
     */
    public void setAccountNumber(final int accountN) {
        this.accountNumber = accountN;
    }

    /**
     * Gets the owner's name.
     *
     * @return the name of the owner
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     * Sets owner name.
     *
     * @param ownerN sets the owner name
     */
    public void setOwnerName(final String ownerN) {
        this.ownerName = ownerN;
    }

    /**
     * Gets the account balance.
     *
     * @return balance of the account
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     * Sets account balance.
     *
     * @param accountB sets the balance
     */
    public void setAccountBalance(final double accountB) {
        this.accountBalance = accountB;
    }

    /**
     * Gets the type of account.
     *
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * Sets the type of the account.
     *
     * @param accountT sets the account type
     */
    public void setAccountType(final BankAccountType accountT) {
        this.accountType = accountT;
    }

    /**
     * Gets the interest earned.
     *
     * @return the amount of interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
    /**
     * Sets the amount of interest earned.
     *
     * @param interestE Interest to set
     */
    public void setInterestEarned(final double interestE) {
        this.interestEarned = interestE;
    }

    /**
     * Gets the interest rate.
     *
     * @return the interest rate
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * Sets the interest rate.
     *
     * @param interestR interest rate to set
     */
    public void setInterestRate(final double interestR) {
        this.interestRate = interestR;
    }
}
