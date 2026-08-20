class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        int l=0;
        
        int size=0;
        boolean[] visited=new boolean[nums.length];
        int[] key=new int[nums.length];
        int[] val=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
           if( visited[i]) continue;
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   
                    count++;
                    visited[j]=true;
                }
               

               
            }
             key[size]=nums[i];
                val[size]=count;
                size++;
        }
            
                    for (int x = 0; x < k; x++) {

            int max = 0;

            for (int i = 0; i < size; i++) {
                if (val[i] > max) {
                    max = val[i];
                }
            }

            for (int i = 0; i < size; i++) {
                if (val[i] == max) {
                    arr[l] = key[i];
                    l++;
                    val[i] = -1;
                    break;
                }
            }
        }

        return arr;
    }
}
