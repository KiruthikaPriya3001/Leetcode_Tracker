// Last updated: 7/14/2026, 2:10:22 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for(char move : moves.toCharArray()){
            if(move=='U'){
                y++;
            }else if(move == 'D'){
                y--;
            }else if (move=='L'){
                x--;
            }else{
                x++;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}