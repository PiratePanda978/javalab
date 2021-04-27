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

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Bank> objs = new LinkedList<Bank>();
        System.out.print("Branch Name : ");
        String search = in.next();
        System.out.println("");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Account number: ");
            int accNo = in.nextInt();
            System.out.print("Account balance: ");
            double bal = in.nextDouble();
            System.out.print("Account holder name: ");
            String name = in.next();
            System.out.print("Branch name: ");
            String branch = in.next();
            Bank acc = new Bank(accNo, bal, name, branch);
            if (search.equals(branch)) {
                objs.add(acc);
                count++;
            }
            System.out.println();
        }
        System.out.println(objs);
        System.out.println("The count is: " + count);
    }
}