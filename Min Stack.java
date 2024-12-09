class MinStack {
int MinStack[];
int top=-1;
    public MinStack() {
        MinStack=new int[8000];
    }
    
    public void push(int val) {
     MinStack[++top]=val;   
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return MinStack[top];
    }
    
    public int getMin() {
        int m=Integer.MAX_VALUE;
        for(int i=0;i<=top;i++){
            if(MinStack[i]<m)m=MinStack[i];
        }
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
