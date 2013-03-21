package Model;

/**
 *
 * @author 1111425, 1111450, 1111506
 */
public class DebitCardMethod extends PayMethod{
    protected String bankName;
    protected String accountNumber;
    
    public DebitCardMethod(String description, String bankName, String accountNumber) {
        super(description);
        
        setBankName(bankName);
        setAccountNumber(accountNumber);
    }
    
    
    // GETTERS !!!!
    public String getBankName() {
        return bankName;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // SETTERS !!!!
    // As long as I don't need them outside, they will remain protected !
    protected void setBankName(String bankName) {
        if (bankName == null) throw new IllegalArgumentException();
        
        this.bankName = bankName;
    }
    
    protected void setAccountNumber(String accountNumber) {
        if (accountNumber == null) throw new IllegalArgumentException();
        
        this.accountNumber = accountNumber;
    }
}
