package Verificatior;

import java.util.*;

public class BalanceVerificator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            //reading users bracket
            String s = in.nextLine();
            //starting to check for balance
            if (Verification(s)==-1) System.out.println("BALANCED");
            else System.out.println("NOT BALANCED (" + Verification(s) + ")");
            }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public static int Verification(String s){
        //checking by symbols if there is a something that's not a bracket
        for (char c: s.toCharArray()){
            if (c!='(' && c!='{' && c!='[' && c!=')' && c!='}' && c!=']')
                //if so - exception
                throw new IllegalArgumentException("WRONG INPUT");
        }
        //pairing the first half of our bracket with the second
        for(int i = 0; i < s.length()/2+s.length()%2; i++){
            //taking one bracket from head and one from tail
            char c = s.charAt(i), c2 = s.charAt(s.length()-i-1);
            if (c=='(' || c=='{' || c=='[') {
                //comparing them; if don't match - return number of the head bracket
                if (c == '(' && c2 != ')') return i+1;
                if (c == '{' && c2 != '}') return i+1;
                if (c == '[' && c2 != ']') return i+1;
            }
            //if there is a closing bracket in the first half - return it
            else if (c==')' || c=='}' || c==']') return i+1;
        //else - passed
        } return -1;
    }
}