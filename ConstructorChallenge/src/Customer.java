public class Customer {


    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(String name,String emailAddress) {
        this(name,1000,emailAddress);

    }

    public Customer(String name, int creditLimit) {
        this(name,creditLimit,"defaultemail");
    }

    public Customer(){
        this("Empty name",1000,"emptyEmailAddress");
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
