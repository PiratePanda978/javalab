public class SugarSmashPlayer {
    int id;
    String name;
    int levels;
    int filled=0;
    int[] arr;
    public SugarSmashPlayer(){
        levels=10;
    }
    public void fixArray(){
        arr = new int[levels];
        int i=0;
        for(i=0;i<levels;i++)
        arr[i]=0;
    }
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
        if(level>levels||level<0){
            System.out.println("Level out of range");
        }
        else if(level>0){
             if(arr[level-1]<100){
                 System.out.println("Error : Previous level less than 100");
             }
             else{
                 arr[level] = score;
                 filled++;
             }
        }
        else{
            arr[level] = score;
        }
    }
    public void getScore(int level){
        if(level>levels||level<0||level>filled){
            System.out.println("Level out of range");
        }
        else{
            System.out.println(arr[level]+"\n");
        }
    }
}
