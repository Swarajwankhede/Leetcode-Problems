class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String str2=str[str.length-1];
        char[] ch=str2.toCharArray();
        return ch.length;
    }
}