import java.util.HashMap;
import java.util.Map;

public class printocrance {

    void printallfreq(String str){
        HashMap<String,Integer> hash=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String s=str.charAt(i)+"";
            if(hash.containsKey(s)){
                hash.put(s,hash.get(s)+1);
            }
            else{
                hash.put(s,1);
            }
        }
        for (Map.Entry<String,Integer> value : hash.entrySet()) {
            if (value.getValue() > 2) {
                System.out.println(value.getKey() + "  " + value.getValue());
            }
        }
    }


    public static void main(String[] args) {
        printocrance printocrance=new printocrance();
        printocrance.printallfreq("It is raining today in Bangalore");


    }
}
