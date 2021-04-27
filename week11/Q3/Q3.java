import java.util.*;

class Bank {
    int accNo;
    double balance;
    String name, bank_branch_name;

    public Bank(int accNo, double balance, String name, String bank_branch_name) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
        this.bank_branch_name = bank_branch_name;
    }

    public String toString() {
        return "\nUser Details: \nName: " + name + "\nAccount No.: " + accNo + "\nBalance: " + balance + "\nBranch: "
                + bank_branch_name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Bank> objs = new LinkedList<Bank>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter account number: ");
            int accNo = input.nextInt();
            System.out.print("Enter account balance: ");
            double bal = input.nextDouble();
            System.out.print("Enter account holder name: ");
            String name = input.next();
            System.out.print("Enter Branch name: ");
            String branch = input.next();
            Bank acc = new Bank(accNo, bal, name, branch);
            if (bal > 50000) {
                objs.add(acc);
            }
            System.out.println();
        }
        System.out.println(objs);
    }
}