public class CheckStroted {
        public static void main(String[] args) {
            int arr[]={97,38,3,23,2};
            int max=arr[0];
            int min=arr[0];
            int flag=0;
            for(int i=1;i<arr.length;i++){
                if(max>arr[i]){
                    max=arr[i];
                }
                else if(min<arr[i]){
                    min=arr[i];
                }
                else{
                    flag=-1;

                }
            }if(flag==0){
                System.out.println("Array is sorted");
            }
            else{
            System.out.println("Array is not sorted");}
        }
    }


