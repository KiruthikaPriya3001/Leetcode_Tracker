// Last updated: 9/21/2026, 2:23:22 PM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return squareColor(coordinate1) == squareColor(coordinate2);
    }
    private int squareColor(String coordinate){
        int col = coordinate.charAt(0) - 'a'+1;
        int row = coordinate.charAt(1) - '0';
        return(col+row)%2;
    }
}