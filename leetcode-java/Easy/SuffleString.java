class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder s2 = new StringBuilder(s);
        for( int i=0;i<indices.length;i++){
            s2.setCharAt(indices[i], s.charAt(i));
        }
        return s2.toString();
    }
}