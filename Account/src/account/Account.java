package account;

public class Account {
    private int acc_no;
    private double balance;
    private String acc_holder;
        
        public Account(int acc_no,double balance,String acc_holder)
        {
            this.acc_no = acc_no;
            this.balance = balance;
            this.acc_holder = acc_holder;
        }
        /*add mutator methods */
            public void setAccNo(int acc_no)
            {
                this.acc_no = acc_no;
            }
        /*add accessor methods*/   
            public int getAcc_No()
            {
                return acc_no;
            }
            
            public void setBalance(double balance)
            {   
                this.balance = balance;
            }
            
            public double getBalance()
            {
                return balance;
            }
            
            public void setAcc_Holder(String acc_holder)
            {
                this.acc_holder = acc_holder;
            }
            public String getAcc_Holder()
            {
                return acc_holder;
            }
        /*add methods*/
        public void deposit(double amount)
        {   
            this.balance += amount;
            System.out.println("Your Balance Is" + getBalance());
        }
}           
