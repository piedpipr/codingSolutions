class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy > greatest) greatest = candy;
        }
        for (int candy : candies) {
            if ((candy + extraCandies) >= greatest){
                result.add(true);
            } else result.add(false);
        }
        return result;
    }
}