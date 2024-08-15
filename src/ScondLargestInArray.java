public class ScondLargestInArray {
        public static void main(String[] args) {
            int arr[]={97,38,94,93,22};
            int max=0;
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            int smax=0;
            for(int i=0;i<arr.length;i++){
                if(max==arr[i]){

                } else if (smax<arr[i]) {
                    smax=arr[i];

                }
            }
            System.out.println(smax);
        }


}
