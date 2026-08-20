class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        if(st.isEmpty()){
            st.push(x);
            return st;
        }
        int y=st.pop();
        st=insertAtBottom(st,x);
        st.push(y);
        return st;
    }
}
