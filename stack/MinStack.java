class MinStack {
    Stack<Long> s = new Stack<>();
    long min;
    public MinStack() {
        s=new Stack<>();

    }
    public void push(int value) {
        long val=value;
        if(s.isEmpty()){
            min=value;
        }
        if(value<=min){
            //FORMULA = 2C-P
            long c=value;
            long p=min;
            s.push((2*c)-p);
            min=value;    
        }else{s.push(val);}
    }
    public void pop() {
        long top =s.peek();
        if(top<min){//DECODED VALUE
            long decoded= s.peek();
            long c=min;
            //formula p = 2*c - decoded;
            long previousmin= 2*c-decoded;
            min=previousmin;
        }
        s.pop();
    }
    public int top() {
        long top=s.peek();
        if(top<min){//DECODED VALUE
            return (int)min;
        }
        return (int)top;
    }
    public int getMin() {
        return (int)min;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
