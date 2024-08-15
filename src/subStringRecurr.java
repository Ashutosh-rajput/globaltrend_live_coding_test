public class subStringRecurr {
    void SubString(String str){
        if(str.equals("")){
            return;
        }
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            String rs=str.substring(0,i)+str.substring(i+1);
            SubString(rs);
        }
    }

    public static void main(String[] args) {
        subStringRecurr subStringRec=new subStringRecurr();
        subStringRec.SubString("abcd");
    }
}
