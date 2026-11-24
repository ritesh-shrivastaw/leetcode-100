class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l1 = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            String s = list1[i];
            if(!map.containsKey(s)){
               map.put(s,i);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            String s = list2[i];
            if(map.containsKey(s)){
                if(i+map.get(s)<min){
                    if(l1.size()>0){
                        while(l1.size()>0){
                            l1.remove(l1.get(l1.size()-1));
                        }
                    }
                    l1.add(s);
                    min=i+map.get(s);
                }
                else if(i+map.get(s)==min){
                    l1.add(s);
                }
            }
        }
        String arr[] = new String[l1.size()];
        int j=0;
        for(String i:l1){
            arr[j++]=i;
        }
        return arr;
    }
}