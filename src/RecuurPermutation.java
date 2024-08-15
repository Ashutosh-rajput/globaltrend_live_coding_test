public class RecuurPermutation {
    void Permuta(String str,String curr){
        if(str.length()==curr.length()){
            System.out.println(curr);
            return;
        }
        for(int k=0;k<str.length();k++){
            if(!curr.contains(str.charAt(k)+"")) {
                Permuta(str,curr+str.charAt(k));
            }
        }
    }

    public static void main(String[] args) {
        RecuurPermutation recuurPermutation=new RecuurPermutation();
        recuurPermutation.Permuta("ABCD","");
    }

}
