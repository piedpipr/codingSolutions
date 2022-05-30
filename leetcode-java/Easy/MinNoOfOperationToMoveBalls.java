class Solution {
    public int[] minOperations(String boxes) {
        char[] ch = boxes.toCharArray();
        int[] answer = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(i==j) continue;
                if(ch[j]=='1') answer[i] = answer[i]+Math.abs(i-j);
            }
        }
        return answer;
    }
}