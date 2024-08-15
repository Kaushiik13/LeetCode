class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        char[] ch = new char[len1 + len2];
        int index = 0;
        for (int i = 0; i < len1 || i < len2; i++) {
            if (i < len1) {
                ch[index++] = ch1[i];
            }
            if (i < len2) {
                ch[index++] = ch2[i];
            }
        }
        String s=String.valueOf(ch);
        return s;
    }
}
