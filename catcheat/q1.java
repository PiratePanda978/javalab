public class NationalHoliday{
    String name,month;
    int day;
    public NationalHoliday(String n,int d,String m){
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(NationalHoliday o2){
        if(month.equals(o2.month)){
            return true;
        }
        return false;
    }

    public double avgDate(NationalHoliday o2){
        double avg = ((double)day+(double)(o2.day))/2;
        return avg;
    }

    public static void main(String args[]){
        NationalHoliday obj1 = new NationalHoliday("Gandhi Jayanti",2,"October");
        NationalHoliday obj2 = new NationalHoliday("Independence Day",15,"August");
        System.out.println(obj1.inSameMonth(obj2));
        System.out.println(obj1.avgDate(obj2));
    }
}