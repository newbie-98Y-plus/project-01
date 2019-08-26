package com.day23;

public class Try_catch {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(get(i));
    }
    public static int get(int i) {
        try {
             i = 1;
            return i;
        }catch (Exception e) {
            i = 2;
        }
        finally {
            i = 3;
        }
        return i;
    }
}
