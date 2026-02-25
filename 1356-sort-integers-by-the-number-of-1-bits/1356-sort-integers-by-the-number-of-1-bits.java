class Solution {
    public int hammingCode(int n){
        int cnt=0;
        while(n>0){
            n&=(n-1);
            cnt++;
        }return cnt;
    }
    public int[] sortByBits(int[] arr) {
        List<List<Integer>>bucket=new ArrayList<>();
        for(int i=0;i<32;i++){
            bucket.add(new ArrayList<>());
        }
        for(int x:arr){
            int bits=hammingCode(x);
            bucket.get(bits).add(x);
        }
        for(List<Integer>list:bucket){
            Collections.sort(list);
        }
        int ind=0;
        for(int i=0;i<32;i++){
            for(int num:bucket.get(i)){
                arr[ind++]=num;
            }
        }return arr;
    }
}