import java.util.HashMap;
import java.util.Map;

public class Mapping2 {
    public static void main(String[] args) {

    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String string: strings){
            if(!map.containsKey(string)) map.put(string, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String str: strings){
            if(!map.containsKey(str)) map.put(str, str.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(String str: strings){
            String first = str.charAt(0)+"";
            String last = str.charAt(str.length()-1)+"";
            if(!map.containsKey(str)) map.put(first,last);
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String str: strings){
            if(!map.containsKey(str))map.put(str,0);
            if(map.containsKey(str))map.put(str, map.get(str)+1);
        }
        return map;
    }

}
