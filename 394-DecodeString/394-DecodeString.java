// Last updated: 8/13/2026, 12:27:56 PM
class Solution {
    public String decodeString(String s) {
       Stack<Integer>num = new Stack<>();
       Stack<String>str = new Stack<>();
       String ans = "";
       int n = 0;
       for(char c : s.toCharArray()){
        if(Character.isDigit(c)){
            n = n*10+(c-'0');
        }else if(c=='['){
            num.push(n);
            str.push(ans);
            n = 0;
            ans = "";
        }else if(c==']'){
            int x = num.pop();
            String temp = str.pop();

            while(x-- >0){
                temp+=ans;
            }
            ans = temp;
        }else{
            ans+=c;
        }
       }
       return ans;
    }
}