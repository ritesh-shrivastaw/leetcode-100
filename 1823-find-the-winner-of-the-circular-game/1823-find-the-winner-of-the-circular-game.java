class Solution {
    public int findTheWinner(int n, int k) {
        int index=0;
        List <Integer> l1= new ArrayList<>();
        for(int i=0; i<n; i++){
            l1.add(i+1);
        }
        while(l1.size() >1){
        index = (index + k-1) % n;
        l1.remove(index);
        n--;
        }
        return l1.get(0);
    }
}