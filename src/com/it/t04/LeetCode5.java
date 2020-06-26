package com.it.t04;

/**
 * 力扣 5.最长回文子串
 *
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LeetCode5 {

    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int res = 1;
        int ll = 0;
        int rr = 0;

        for (int i = 0; i < s.length(); i++) {
            int l = i - 1;
            int r = i + 1;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - i + 1;
                if (len > res) {
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                int len = r - i + 1;
                if (len > res) {
                    res = len;
                    ll = l;
                    rr = r;
                }
                l--;
                r++;
            }

        }

        return s.substring(ll, rr+1);
    }
}
