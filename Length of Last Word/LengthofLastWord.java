class Solution {
    public static int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        String ab="";
        for (int i=0;i<arrOfStr.length;i++)
        {
                if(arrOfStr.length==i+1)
                {
                    ab=arrOfStr[i];
                }
        }
        int ao=ab.length();
        return ao;
    }
}
