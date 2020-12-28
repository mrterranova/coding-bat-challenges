package codingBatChallenges;

import java.util.ArrayList;
import java.util.List;

public class AP1 {
    public static void main(String[] args) {

        //SCORES INCREASING
        //Given an array of scores, return true if each score is equal or greater than
        //the one before. The array will be length 2 or more.

        //SCORES 100
        //Given an array of scores, return true if there are scores of 100 next to each
        //other in the array. The array length will be at least 2.

        //SCORES CLUMP
        //Given an array of scores sorted in increasing order, return true if the array
        //contains 3 adjacent scores that differ from each other by at most 2, such as
        //with {3, 4, 5} or {3, 5, 5}.

        //SCORES AVERAGE
        //Given an array of scores, compute the int average of the first half and the second
        //half, and return whichever is larger. We'll say that the second half begins at
        //index length/2. The array length will be at least 2. To practice decomposition,
        //write a separate helper method
        //int average(int[] scores, int start, int end) { which computes the average of the
        //elements between indexes start..end. Call your helper method twice to implement
        //scoresAverage(). Write your helper method after your scoresAverage() method in the
        //JavaBat text area. Normally you would compute averages with doubles, but here we
        //use ints so the expected results are exact.

        //WORDS COUNT
        //Given an array of strings, return the count of the number of strings with the given
        //length.

        //WORDS FRONT
        //Given an array of strings, return a new array containing the first N strings. N
        //will be in the range 1..length.

        //WORDS WITHOUT LIST
        //Given an array of strings, return a new List (e.g. an ArrayList) where all the
        //strings of the given length are omitted. See wordsWithout() below which is more
        //difficult because it uses arrays.

        //HAS ONE
        //Given a positive int n, return true if it contains a 1 digit. Note: use % to get
        //the rightmost digit, and / to discard the rightmost digit.

        //DIVIDES SELF
        //We'll say that a positive int divides itself if every digit in the number divides
        //into the number evenly. So for example 128 divides itself since 1, 2, and 8 all
        //divide into 128 evenly. We'll say that 0 does not divide into anything evenly,
        //so no number with a 0 digit divides itself. Note: use % to get the rightmost digit,
        //and / to discard the rightmost digit.

        //COPY EVENS
        //Given an array of positive ints, return a new array of length "count" containing
        //the first even numbers from the original array. The original array will contain at
        //least "count" even numbers.

        //COPY ENDY
        //We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100
        //(inclusive). Given an array of positive ints, return a new array of length "count"
        //containing the first endy numbers from the original array. Decompose out a separate
        //isEndy(int n) method to test if a number is endy. The original array will contain
        //at least "count" endy numbers.

        //MATCH UP
        //Given 2 arrays that are the same length containing strings, compare the 1st string
        //in one array to the 1st string in the other array, the 2nd to the 2nd and so on.
        //Count the number of times that the 2 strings are non-empty and start with the same
        //char. The strings may be any length, including 0.

        //SCORE UP
        //The "key" array is an array containing the correct answers to an exam, like {"a",
        //"a", "b", "b"}. the "answers" array contains a student's answers, with "?"
        //representing a question left blank. The two arrays are not empty and are the same length.
        //Return the score for this array of answers, giving +4 for each correct answer, -1
        //for each incorrect answer, and +0 for each blank answer.

        //WORDS WITHOUT
        //Given an array of strings, return a new array without the strings that are equal
        //to the target string. One approach is to count the occurrences of the target string,
        //make a new array of the correct length, and then copy over the correct strings.

        //SCORES SPECIAL
        //Given two arrays, A and B, of non-negative int scores. A "special" score is one
        //which is a multiple of 10, such as 40 or 90. Return the sum of largest special
        //score in A and the largest special score in B. To practice decomposition, write
        //a separate helper method which finds the largest special score in an array.
        //Write your helper method after your scoresSpecial() method in the JavaBat text area.

        //SUM HEIGHTS
        //We have an array of heights, representing the altitude along a walking trail.
        //Given start/end indexes into the array, return the sum of the changes for a
        //walk beginning at the start index and ending at the end index. For example,
        //with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
        //The start end end index will both be valid indexes into the array with start <= end.

        //SUM HEIGHTS 2
        //(A variation on the sumHeights problem.) We have an array of heights,
        //representing the altitude along a walking trail. Given start/end indexes into the
        //array, return the sum of the changes for a walk beginning at the start index
        //and ending at the end index, however increases in height count double. For example,
        //with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
        //The start end end index will both be valid indexes into the array with start <= end.

        //BIG HEIGHTS
        //(A variation on the sumHeights problem.) We have an array of heights,
        //representing the altitude along a walking trail. Given start/end indexes into
        //the array, return the number of "big" steps for a walk starting at the start
        //index and ending at the end index. We'll say that step is big if it is 5 or
        //more up or down. The start end end index will both be valid indexes into the
        //array with start <= end.

        //USER COMPARE
        //We have data for two users, A and B, each with a String name and an int id.
        //The goal is to order the users such as for sorting. Return -1 if A comes before
        //B, 1 if A comes after B, and 0 if they are the same. Order first by the string
        //names, and then by the id numbers if the names are the same. Note: with Strings
        //str1.compareTo(str2) returns an int value which is negative/0/positive to indicate
        //how str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP,
        //there would be two User objects, but here the code simply takes the two strings
        //and two ints directly. The code logic is the same.)

        //MERGE TWO

        //COMMON TWO
    }
    //SCORES INCREASING
    public boolean scoresIncreasing(int[] scores) {
        for(int i=1; i<scores.length; i++){
            if(scores[i-1]>scores[i]){
                return false;
            }
        }
        return true;
    }

    //SCORES 100
    public boolean scores100(int[] scores) {
        for(int i=1; i<scores.length; i++){
            if(scores[i-1]==100 && scores[i]==100){
                return true;
            }
        }return false;
    }

    //SCORES CLUMP
    public boolean scoresClump(int[] scores) {
        int diff=0;
        for(int i=1; i<scores.length-1; i++){
            int temp = scores[i]-scores[i-1];
            int temp1 = scores[i+1]-scores[i];
            diff = temp+temp1;
            if(diff<3) return true;
        }
        return false;
    }

    //SCORES AVERAGE
    public int scoresAverage(int[] scores) {
        int a =0;
        int b=0;
        int half = scores.length/2;
        for(int i=0; i<scores.length; i++){
            if(i<half){
                a+=scores[i];
            } else {
                b+= scores[i];
            }
        }
        if(a/half> b/half)return a/half;
        return b/half;
    }

    //WORDS COUNT
    public int wordsCount(String[] words, int len) {
        int count=0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() ==len){
                count++;
            }
        }
        return count;
    }

    //WORDS FRONT
    public String[] wordsFront(String[] words, int n) {
        String[] toReturn = new String[n];
        for(int i=0; i<n; i++){
            toReturn[i]=words[i];
        }
        return toReturn;
    }

    //WORDS WITHOUT LIST
    public List wordsWithoutList(String[] words, int len) {
        List<String> toReturn = new ArrayList<>();
        for(int i=0; i<words.length;i++){
            if(words[i].length() != len) toReturn.add(words[i]);
        }
        return toReturn;
    }

    //HAS ONE
    public boolean hasOne(int n) {
        if(n%10==1) return true;
        if(n==0)return false;
        return hasOne(n/10);
    }

    //DIVIDES SELF
    public boolean dividesSelf(int n) {
        int rem =0;
        int save=n;
        if(n%10==0){
            return false;
        }
        while(n!=0){
            if(save%(n%10)==0){
                n = n/10;
            } else {
                return false;
            }
        }
        return true;
    }


    //COPY EVENS
    public int[] copyEvens(int[] nums, int count) {
        int[] res = new int[count];
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(c<count && nums[i]%2==0){
                res[c] = nums[i];
                c++;
            }
        }
        return res;
    }

    //COPY ENDY
    public int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(c<count && (nums[i]<=10 || nums[i]>=90)){
                res[c] = nums[i];
                c++;
            }
        }
        return res;
    }

    //MATCH UP
    public int matchUp(String[] a, String[] b) {
        int count =0;
        for(int i=0; i<a.length; i++){
            if(a[i].length()>0 && b[i].length()>0 &&
                    a[i].charAt(0)==b[i].charAt(0)) count++;
        }
        return count;
    }

    //SCORE UP
    public int scoreUp(String[] key, String[] answers) {
        int score=0;
        for(int i=0; i<key.length; i++){
            if(key[i].equals(answers[i])) score +=4;
            else if(answers[i].equals("?")) score +=0;
            else score -=1;
        }
        return score;
    }

    //WORDS WITHOUT
    public String[] wordsWithout(String[] words, String target) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(!words[i].equals(target)){
                res.add(words[i]);
            }
        }
        String[] fin = new String[res.size()];
        for(int i=0; i<res.size(); i++){
            fin[i]=res.get(i);
        }
        return fin;
    }

    //SCORES SPECIAL
    public int scoresSpecial(int[] a, int[] b) {
        int topa=0, topb=0;
        for(int i=0; i<a.length;i++){
            if(a[i]%10==0&&topa<a[i]){
                topa = a[i];
            }
        }
        for(int j=0; j<b.length; j++){
            if(b[j]%10==0&&topb<b[j]){
                topb = b[j];
            }
        }
        return topa+topb;
    }

    //SUM HEIGHTS
    public int sumHeights(int[] heights, int start, int end) {
        int res=0;
        for(int i=start; i<end; i++){
            res += Math.abs(heights[i+1]-heights[i]);
        }
        return res;
    }

    //SUM HEIGHTS 2
    public int sumHeights2(int[] heights, int start, int end) {
        int res = 0;
        for (int i=start+1; i<=end; i++) {
            if (heights[i-1] < heights[i]) {
                res += 2 * (Math.abs(heights[i-1] - heights[i]));
            } else {
                res += Math.abs(heights[i-1] - heights[i]);
            }
        }
        return res;
    }

    //BIG HEIGHTS
    public int bigHeights(int[] heights, int start, int end) {
        int res =0;
        for (int i=start+1; i<=end; i++) {
            int temp = Math.abs(heights[i-1] - heights[i]);
            if(temp>=5) res +=1;
            else res+=0;
        }
        return res;
    }

    //USER COMPARE
    public int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.charAt(0)>bName.charAt(0)) return 1;
        else if(aName.charAt(0)<bName.charAt(0)) return -1;
        else {
            if(aName.charAt(1)>bName.charAt(1))
                return 1;
            if(aId>bId){
                return 1;
            } else if(aId<bId){
                return -1;
            } else{
                return 0;
            }
        }
    }

    //MERGE TWO

    //COMMON TWO

}
