// Last updated: 7/14/2026, 2:10:19 PM
class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stk = new Stack<>();

        for(String op : operations){
            if(op.equals("C")){
                stk.pop();
            }else if(op.equals("D")){
                stk.push(2 * stk.peek());
            }else if(op.equals("+")){
                int last = stk.pop();
                int secondLast = stk.peek();
                stk.push(last);
                stk.push(last + secondLast);
            }else{
                stk.push(Integer.parseInt(op));
            }
        }

        for(int score : stk){
            result += score;
        }

        return result;
    }
}