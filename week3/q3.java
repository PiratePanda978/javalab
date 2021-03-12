public class q3 {
    public static String reverseString(String s){
        int i;
        String s1 = "";
        int l = s.length();
        for(i=l-1;i>=0;i--){
            s1 = s1+s.charAt(i);
        }
        return s1;
    }

    public static boolean checkPali(String s,String s1){
        return s.equals(s1);
    }

    public static void main(String args[]){
        String rev;
        String[] words = {"mama","mom","cars","madam"};
        for(int i=0;i<words.length;i++){
            rev = reverseString(words[i]);
            if(checkPali(words[i],rev)){
                System.out.println(words[i]+" is a palindrome");
            }
            else{
                System.out.println(words[i]+" is not a palindrome");
            }
        }
    }
}
