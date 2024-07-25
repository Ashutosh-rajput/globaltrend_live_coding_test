public class longest_common_subsequence {
    public static void main(String[] args) {
        String a="abcde";
        String b="ace";
        String res="";

        int n=a.length();
        int m=b.length();
        int[][] arr=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if (i == 0 || j == 0) {
                    arr[i][j]=0;
                }
                else if(a.charAt(i-1)==b.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;

//                    res=res+a.charAt(i);
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        int in=arr[n][m];
        char[] ress=new char[in];
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ress[in-1]=a.charAt(i-1);
                i--;
                j--;
                in--;
            }
            else if(arr[i-1][j]>arr[i][j-1]){
                i--;
            }
            else {
                j--;

            }
        }



        System.out.println(ress);
    }
}