package com.it.t01;

/**
 * 剑指offer 05.替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Offer05 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        int n = s.length();
        char[] array = new char[n*3];
        int size = 0;

        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }

        }

        String newStr = new String(array, 0, size);
        return newStr;
    }
}
