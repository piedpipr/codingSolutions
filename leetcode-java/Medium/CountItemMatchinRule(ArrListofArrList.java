import java.util.*;

public class Main {
    public static void main(String[] arg) {
        //Main Class&Method for Solution
        //Change the Main to filename for individual solution
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int match = 0;
        for(List<String> item:items){
            if(ruleKey.equals("type") && Objects.equals(item.get(0), ruleValue)) match = match+1;
            if(ruleKey.equals("color") && Objects.equals(item.get(1), ruleValue)) match = match+1;
            if(ruleKey.equals("name") && Objects.equals(item.get(2), ruleValue)) match = match+1;
        }
        System.out.println(match);
    }
}