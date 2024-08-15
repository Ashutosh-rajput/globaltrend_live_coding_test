public class SumOfSubset {
    int Sum(int []arr,int sum,int currsum,int i,int res){
        if(currsum==sum){
            System.out.println(res+"  "+i);
            res++;
            return 1;
        }
        if(currsum>sum){
            return 0;
        }
        if(i>=arr.length){
            return 0;
        }
//        res=res+um(arr,sum,currsum,i+1,res);
//        res=res+Sum(arr,sum,currsum+arr[i],i+1,res);
//        System.out.println(res+"  last");
        return Sum(arr,sum,currsum,i+1,res)+ Sum(arr,sum,currsum+arr[i],i+1,res);
    }

    public static void main(String[] args) {
        SumOfSubset sumOfSubset=new SumOfSubset();
        int arr[]={10,5,2,3,6};
        int sum=8;
        System.out.println(sumOfSubset.Sum(arr,sum,0,0,0));
    }
}
