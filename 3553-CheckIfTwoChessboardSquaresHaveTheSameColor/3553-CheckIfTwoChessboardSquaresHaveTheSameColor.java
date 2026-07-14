// Last updated: 7/14/2026, 2:08:31 PM
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