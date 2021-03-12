class person {
    String name;
    char sex;
    int age;
    public person(String n,char s,int a){
        name = n;
        sex = s;
        age = a;
    }
}

class employee extends person{
    String employee_id;
    String employee_date_of_join;
    public employee(String n,char s,int a,String id,String doj){
        super(n,s,a);
        employee_id = id;
        employee_date_of_join = doj;
    }
}


class manager extends employee{
    String branchName;
    int branchCode;
    public manager(String n,char s,int a,String id,String doj,String bName,int bCode){
        super(n, s, a, id, doj);
        branchName = bName;
        branchCode = bCode;
    }
}

class districtManager extends employee{
    String districtName;
    int districtCode;
    public districtManager(String n,char s,int a,String id,String doj,String dName,int dCode){
        super(n, s, a, id, doj);
        districtName = dName;
        districtCode = dCode;
    }
}

class regionalManager extends employee{
    String RegionName;
    int RegionCode;
    public regionalManager(String n,char s,int a,String id,String doj,String rName,int rCode){
        super(n, s, a, id, doj);
        RegionName = rName;
        RegionCode = rCode;
    }
}

class q3{
    public static void main(String[] args) {
        manager obj = new manager("Ravi",'M',20,"1234","01-01-01","Begusarai",0123);
        System.out.println(obj.name);
        System.out.println(obj.sex);
        System.out.println(obj.age);
        System.out.println(obj.employee_id);
        System.out.println(obj.employee_date_of_join);
        System.out.println(obj.branchName);
        System.out.println(obj.branchCode);
    }
}