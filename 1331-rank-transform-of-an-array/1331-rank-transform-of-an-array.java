class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;
        int [] temp = new int [n];
        for(int i=0;i<n;i++) temp[i] = arr[i];
        Arrays.sort(temp);
        int index =1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            
            if(!map.containsKey(temp[i])){
                map.put(temp[i],index);
                index++;
            }
        }

        int [] res = new int [n];
        for(int i=0;i<n;i++){

            res[i] = map.get(arr[i]);
        }
        return res;
    }
}