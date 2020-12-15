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

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for(String str : strings){
            String first = str.charAt(0)+"";
            if(map.containsKey(first)) map.put(first, map.get(first)+str);
            else map.put(first, str);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String res = "";
        if(strings.length < 3) return "";
        for(int i=0; i < strings.length; i++){
            if(!map.containsKey(strings[i]))
                map.put(strings[i], 1);
            else {
                map.put(strings[i], map.get(strings[i])+1);
                if(map.get(strings[i])%2==0){
                    res += strings[i];
                }
            }
        }
        return res;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for(int i=0; i < strings.length; i++){
            if(!map.containsKey(strings[i]))
                map.put(strings[i], false);
            else
                map.put(strings[i], true);
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i < strings.length; i++){
            char first = strings[i].charAt(0);
            if(!map.containsKey(first)){
                map.put(first, i);
            } else {
                String temp = strings[i];
                strings[i]=strings[map.get(first)];
                strings[map.get(first)] = temp;
                map.remove(first);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Boolean> swapped = new HashMap<Character, Boolean>();
        for(int i=0; i < strings.length; i++){
            char first = strings[i].charAt(0);
            if(!map.containsKey(first)){
                map.put(first, i);
                swapped.put(first, false);
            } else {
                if(swapped.get(first)== false){
                    String temp = strings[i];
                    strings[i]=strings[map.get(first)];
                    strings[map.get(first)] = temp;
                    swapped.put(first, true);
                }
            }
        }
        return strings;
    }


}
