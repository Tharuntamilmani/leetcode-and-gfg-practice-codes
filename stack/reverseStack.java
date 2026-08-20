class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int c=st.pop();
        reverseStack(st);
        insertAtBottom(st,c);
        
    }
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        if(st.isEmpty()){
            st.push(x);
            return st;
        }
        int y=st.pop();
        st = insertAtBottom(st,x);
        st.push(y);
        return st;
    }
}
