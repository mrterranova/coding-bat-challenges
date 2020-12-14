import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Notes121420 {
    public static void main(String[] args) {
        int[] someNumberArray = new int[20];
        List<Integer> someNumberList = new ArrayList<>();
        //lists cannot be primitive types.
        //think of a list as a "mapping" between integers (the indices) and
        //some values based on the kind of array/list

        someNumberList.add(2);
        someNumberList.add(7);
        someNumberList.add(93);
        someNumberList.add(-12);
        someNumberList.remove(2);

        for (int i = 0; i < someNumberList.size(); i++) {
            System.out.println(someNumberList.get(i));
        }

        //this is a special case of a map
        //we go from integers to strings here
        List<String> names = new ArrayList<>();
        names.add("Trevor"); //adds element 0 with a value of "Trevor"
        names.add("Michal");
        names.add("Brandt");
        names.add("Neely");
        names.add("Brian");


        Map<Integer, String> nameMap = new HashMap<>();

        nameMap.put(0, "Trevor");
        nameMap.put(1, "Michal");
        nameMap.put(2, "Brandt");


        //now my indices will be strings as well
        Map<String, String> firstNameLastNameMapping = new HashMap<>();
        firstNameLastNameMapping.put("Trevor", "Taylor");
        firstNameLastNameMapping.put("Michal", "Terranova");
        firstNameLastNameMapping.put("Brandt", "Campbell");


        //so now let's find Trevors last name...

        String lastName = firstNameLastNameMapping.get("Trevor");
        System.out.println(lastName);

//        firstNameLastNameMapping.put("Trevor", "Something else");
//        System.out.println(firstNameLastNameMapping.get("Trevor"));

        Set<String> keys = firstNameLastNameMapping.keySet();

        for(String key : keys){
            System.out.println(key.hashCode());
            System.out.println(key + " " +firstNameLastNameMapping.get(key));
        }


        List<Integer> toGroup = Stream.of(-14, -2,68, -76, 4,10, 90, 71, 87, 77, -8, 100, 15, 27, -99, 88, 16, -15).collect(Collectors.toList());

        Map<Integer, List<Integer>> grouped = groupByOnesPlace(toGroup);

        for (Integer key: grouped.keySet()){
            System.out.println(key + " " + grouped.get(key));
        }

        Object grouping = toGroup.stream()
                .collect(
                        Collectors.groupingBy(x -> Math.abs(x%10))
                );
    }

    public static Map<Integer, List<Integer>> groupByOnesPlace(List<Integer> nums){
        Map<Integer, List<Integer>> toReturn = new HashMap<>();
        for (Integer num : nums) {
            Integer onesPlace = Math.abs(num %10);
            if(!toReturn.containsKey(onesPlace)) {
                toReturn.put(onesPlace, new ArrayList<>());
            }
            toReturn.get(onesPlace).add(num);
        }
        return toReturn;
    }


}
