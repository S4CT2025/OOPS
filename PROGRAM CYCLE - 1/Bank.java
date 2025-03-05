import java.util.Scanner;

public class Bank {
    int acno;
    float balance;
    String name;

    // Default constructor with initial balance
    Bank() {
        balance = 6000;
    }

    // Parameterized constructor
    Bank(String na, int no) {
        name = na;
        acno = no;
    }

    // Method to deposit amount
    float deposit(int am) {
        balance = am + balance;
        return balance;
    }

    // Method to withdraw amount
    float withdraw(float am) {
        if (am > balance)
            System.out.println("Insufficient balance.");
        else if (am > balance - 1000)
            System.out.println("Minimum 1000 required.");
        else
            balance = balance - am;

        System.out.println("Current balance: " + balance);
        return balance;
    }

    public static void main(String[] args) {
        String na;
        int no, dep;
        float wam, a;
        Scanner s = new Scanner(System.in);

        Bank b1 = new Bank();

        System.out.print("Enter Name: ");
        na = s.nextLine();
        System.out.print("Enter Account Number: ");
        no = s.nextInt();

        Bank b2 = new Bank(na, no);

        System.out.println("Name: " + na);
        System.out.println("Account Number: " + no);
        System.out.println("Balance: " + b1.balance);

        System.out.print("Enter Deposit: ");
        dep = s.nextInt();
        b1.deposit(dep);
        System.out.println("Current Balance: " + b1.balance);

        System.out.print("Withdraw Amount: ");
        wam = s.nextFloat();
        a = b1.withdraw(wam);

        System.out.println("Current Details:");
        System.out.println("Name: " + na);
        System.out.println("Account Number: " + no);
        System.out.println("Current Balance: " + a);

        s.close();
    }
}
