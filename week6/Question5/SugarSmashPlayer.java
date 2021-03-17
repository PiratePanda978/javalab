package Q5;

public class SugarSmashPlayer {
    int id;
    String name;
    int[] arr = new int[10];
    public void setId(int i){
        id=i;
    }
    public void setName(String s){
        name=s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setScore(int score,int level){
        if(level>10){
            System.out.println("Level out of range");
        }
        else if(level>0){
             if(arr[level-1]<100){
                 System.out.println("Error : Previous level less than 100");
             }
             else{
                 arr[level] = score;
             }
        }
        else{
            arr[0] = score;
        }
    }
    public void getScore(int )
}
