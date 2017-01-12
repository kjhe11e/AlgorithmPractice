import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RectangleSize {

    public static int findHeight(int h[], String word){
        if(word == null || h.length == 0){
            return -1;
        }

        int max = 0;
        for(int i = 0; i < word.length(); i++){
            int ch = word.charAt(i) - 'a';
            if(h[ch] > max){
                max = h[ch];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int size = findHeight(h, word) * word.length();
        System.out.println(size);
    }
}
