class basicAccount { // creating the basic bank account class
    public String accountNum; // string account number + double balance
    public double balance;

    public basicAccount(String accountNum, double balance) { // basic account constructor, neding acc num + balance
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(double depositAmmount) { // deposit method
        balance += depositAmmount; // adding deposit amount to balance
        System.out.println("You deposited: " + depositAmmount + " into the account " + accountNum);
        System.out.println("Your new balance is " + balance); // printing out balance

    }

    public void withdraw(double withdrawAmount) { // withdraw method
        if (balance >= withdrawAmount) { // if there is enough money in account, withdraw it
            balance -= withdrawAmount;
            System.out.println("You withdrawed: " + withdrawAmount + " from the account " + accountNum);
            System.out.println("Your new balance is " + balance);
        } else { // else print out you lack the funds
            System.out.println("You lack the funds for withdrawl in: " + accountNum);

        }
    }

    public void displayAccountInfo() { // display the account information
        System.out.println("Account Number: " + accountNum);
        System.out.println("Balance: " + balance);
    }
}

class savingsAccount extends basicAccount { // savingsAccount class, extending from basic account

    private double interestRate; // interest rate + withdrawl fee
    private double withdrawlFee;

    public savingsAccount(String accountNum, double balance, double interestRate, double withdrawlFee) { // savings
                                                                                                         // account
                                                                                                         // constructor
        super(accountNum, balance); // supering account num + balance
        this.interestRate = interestRate; // setters
        this.withdrawlFee = withdrawlFee;
    }

    @Override // overriding the deposit method from basic with this in the savings account
              // class
    public void deposit(double depositAmmount) {
        super.deposit(depositAmmount);
        double interest = depositAmmount * interestRate; // adding interest
        super.deposit(interest);

    }

    @Override // overriding the withdraw method from basic with this in the savings account
              // class
    public void withdraw(double withdrawAmount) {
        super.withdraw(withdrawAmount);
        if (balance >= withdrawAmount) // if balance is >= withdraw amount, withdraw
            ;
        {
            super.withdraw(withdrawlFee);
        }
        // else is covered in the basicAccount
    }
}

class checkingAccount extends basicAccount { // class checking account, extending basic account

    private static final double overdraftProtection = 2000; // overdrawft protection

    public checkingAccount(String accountNum, double balance) { // checkings constrctuor
        super(accountNum, balance);
    }

    @Override // overiding the withdraw with this method
    public void withdraw(double withdrawAmount) {
        if (balance + overdraftProtection >= withdrawAmount) {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
            } else {
                double overdraftAmount = withdrawAmount - balance;
                balance = 0;
                System.out.println("Overdraft protection! Withdrawn " + (withdrawAmount - overdraftAmount)
                        + "from account" + accountNum + " and " + overdraftAmount + " from overdrft limit.");
                System.out.println("New Balance: " + balance);
            }
            System.out.println("Withdrawn " + withdrawAmount + " from the account " + accountNum);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("You do not have enough funds and overdraft in the account: " + accountNum);
        }
    }
}

public class Lab3 { // lab3 - has main function in it
    public static void main(String[] args) {
        basicAccount basic = new basicAccount("56783028473AED", 1765); // adding basic
        savingsAccount savings = new savingsAccount("883836274AIJS", 1543, 0.3, 3); // adding the savings class
        checkingAccount checking = new checkingAccount("7574922475HJA", 2140); // adding the checkings class

        basic.deposit(340); // calling the deposit method, passing 350 as the parameter
        basic.withdraw(50); // calling the withdraw method, passing 50 as the amount
        basic.displayAccountInfo(); // calling the displayAccountInfo method, showing the information of the account

        savings.deposit(434); // calling the deposit method with savings class, passing 434 as the parameter
        savings.withdraw(90); // calling the withdraw method with the savings class, passing 90 as the parameter
        savings.displayAccountInfo(); // calling the displayAccountInfo method, showing the information passed in the creation of the savings class

        checking.deposit(1002); // calling the deposit method within the checkings class, passing in 1002 as the parameter
        checking.withdraw(231); // calling the withdraw method within the checkings class, passing in 231 as the parameter
        checking.displayAccountInfo(); // calling the displayAccountInfor method, showing the information passed in the creation of the checkings class
    }
}