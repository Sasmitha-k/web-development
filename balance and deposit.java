class Demo {
    public static void main(String[] args) {
        Account ac = new Account("sasmitha", 300000);
        System.out.println("Accountholder Name: " + ac.getAccholder());
        System.out.println("Balance amt: " + ac.getBalance());

        ac.setAccholder("reha");
        System.out.println("Updated Accountholder Name: " + ac.getAccholder());
       
   
         ac.deposit(50000);
         
        System.out.println("Updated Balance amt: " + ac.getBalance());
    }
}

class Account {
    private String accHolder;
    private int balance;

     
    Account(String accHolder, int balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

   
    public String getAccholder() {
        return accHolder;
    }


    public int getBalance() {
        return balance;
    }

   
    public void setAccholder(String accHolder) {
        this.accHolder = accHolder;
    }

   
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " has been deposited to the account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}