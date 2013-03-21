package Model;
import eapli.util.DateTime;
/**
 *
 * @author i101008, i101516, i090589
 */
public class CreditCardMethod extends PayMethod {
    
    private String creditCardNumber;
    private String ownerName; 
    private DateTime expiringDate;
    private DateTime creationDate;
    private String cardSecurityCode; //CCV
    
    public CreditCardMethod(String ownerName,String creditCardNumber, DateTime creationDate, DateTime expiringDate, String cardSecurityCode){
        super(ownerName);
        this.creditCardNumber=creditCardNumber;
        this.expiringDate=expiringDate;
        this.cardSecurityCode=cardSecurityCode;
        this.creationDate=creationDate;
    }
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }   

    public String getOwnerName() {
        return ownerName;
    }

    public DateTime getExpiringDate() {
        return expiringDate;
    }

    public DateTime getCreationDate() {
        return creationDate;
    }

    public String getCardSecurityCode() {
        return cardSecurityCode;
    }
    
}
