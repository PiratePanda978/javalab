import java.util.Scanner;

class TaxPayer{
    int SSN,gross;

    public TaxPayer(int n1,int n2){
        SSN = n1;
        gross = n2;
    }

    public int getSSN(){
        return SSN;
    }

    public int getGross(){
        return gross;
    }
}

class useTaxPayer extends TaxPayer {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        TaxPayer[] obj = new TaxPayer[10];
        int i,n1,n2;
        n1 = 100000;
        for(i=0;i<10;i++){
            System.out.print("Enter Gross : ");
            n2 = in.nextInt();
            obj[i] = new TaxPayer(n1,n2);
            n1+=1;
        }
        System.out.println("S.I No\tSSN\tGross Income");
        System.out.println("..........................");
        for(i=0;i<10;i++){
            System.out.println(i+"\t"+obj[i].getSSN()+"\t"+obj[i].getGross());
        }
    }
}
