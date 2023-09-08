class Account {
    private int accountNumber;
    private int pin;
    private double availableBalance;
    private double totalBalance;
    private int admin;
    private String username;

    public Account(String Username, int theAccountNumber, int thePIN,
                   double theAvailableBalance, double theTotalBalance, int isadmin) {
        setUsername(Username);
        setAccountNumber(theAccountNumber);
        setPin(thePIN);
        setAvailableBalance(theAvailableBalance);
        setTotalBalance(theTotalBalance);
        setAdmin(isadmin);
    }

    public boolean validatePIN(int userPIN) {
        if (userPIN == getPin())
            return true;
        else
            return false;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void credit(double amount) {
        setTotalBalance(getTotalBalance() + amount);
    }

    public void debit(double amount) {
        setAvailableBalance(getAvailableBalance() - amount);
        setTotalBalance(getTotalBalance() - amount);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getISadmin() {
        return getAdmin();
    }

    public int GetPin() {
        return getPin();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public static void main(String[] args) {
        Account account = new Account("Praveen", 54400100, 1440, 130.78, 6789, 567);
        account.setUsername("Praveen Rajput");
        System.out.println(account.getUsername());
        account.setPin(6570);
        System.out.println(account.validatePIN(6579));
        account.setAccountNumber(67846757);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getPin());
        System.out.println(account.GetPin());
        account.setTotalBalance(54000.46);
    }
}
