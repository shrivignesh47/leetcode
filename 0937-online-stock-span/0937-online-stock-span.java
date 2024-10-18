class StockSpanner {

     private Stack<int[]> stack;


    public StockSpanner() {
        this.stack = new Stack<>();
    }


    public int next(int price) {

        int data = 1;

        while (!stack.isEmpty() && price >= stack.peek()[0]){
            data += stack.pop()[1];
        }

        stack.push(new int[]{price, data});

        return data;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */