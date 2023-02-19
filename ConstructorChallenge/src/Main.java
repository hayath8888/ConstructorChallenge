public class Main {


    public static void main(String[] args) {

        Customer customer = new Customer("hayath",5000,"hayath@email.com");
        System.out.println("Customer Name :"+customer.getName()
        +"\n Customer Limit :"+customer.getCreditLimit()+
                "\n Customer Email :"+customer.getEmailAddress());

        Customer secondcustomer = new Customer("jai","jai@email.com");
        System.out.println("Customer Name :"+secondcustomer.getName()
                +"\n Customer Limit :"+secondcustomer.getCreditLimit()+
                "\n Customer Email :"+secondcustomer.getEmailAddress());

        Customer thirdcustomer = new Customer("tesla",2000);
        System.out.println("Customer Name :"+thirdcustomer.getName()
                +"\n Customer Limit :"+thirdcustomer.getCreditLimit()+
                "\n Customer Email :"+thirdcustomer.getEmailAddress());

        Customer fourthcustomer = new Customer();
        System.out.println("Customer Name :"+fourthcustomer.getName()
                +"\n Customer Limit :"+fourthcustomer.getCreditLimit()+
                "\n Customer Email :"+fourthcustomer.getEmailAddress());
    }
}