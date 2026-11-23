class ProductOfNumbers {
    List<Integer> pref = new ArrayList<>();

    public ProductOfNumbers() {
        pref.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            pref.clear();
            pref.add(1);
        } else {
            pref.add(pref.get(pref.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = pref.size();
        if (k >= n) return 0;
        return pref.get(n - 1) / pref.get(n - k - 1);
    }
}