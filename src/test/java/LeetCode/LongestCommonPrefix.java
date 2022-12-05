package LeetCode;

public class LongestCommonPrefix {
    public static String CommonPrefix(String[] strs) {

        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)

            while (strs[i].indexOf(prefix) != 0) {
                int h=strs[i].indexOf(prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;  }

}