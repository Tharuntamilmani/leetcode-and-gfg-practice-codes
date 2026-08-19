class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=arr.length;i>=0;i--){
            if(st.isEmpty()){
                ar.add(-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ar.add(-1);
                }else{
                    ar.add(st.peek());
                }
            }
            st.add(arr[i]);
        }
        Collections.reverse(ar);
        return ar;
    }
}
