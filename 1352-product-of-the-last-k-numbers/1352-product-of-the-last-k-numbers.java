class ProductOfNumbers {
    List<Integer> l1;

    public ProductOfNumbers() {
     l1=new ArrayList<>();

    }
    
    public void add(int num) {
        l1.add(num);
    }
    
    public int getProduct(int k) {
        int prod =1;
        int j= l1.size()-1;
        while(k>0){
            prod *= l1.get(j);
            j--;
            k--;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */