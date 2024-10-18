class StockSpanner {
    Stack<Integer> prs;
    Stack<Integer> span;
    public StockSpanner() {
        prs = new Stack<>();
        span = new Stack<>();
    }
    
    public int next(int price) {
        int c = 1;

        while(!prs.isEmpty() && prs.peek() <= price){
            prs.pop();
            c += span.pop();
        }

        prs.push(price);
        span.push(c);

        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */