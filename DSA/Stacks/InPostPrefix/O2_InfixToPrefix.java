package DSA.Stacks.InPostPrefix;

import java.util.Stack;

public class O2_InfixToPrefix {
    public static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPrefix(String exp){
        exp = new StringBuilder(exp).reverse().toString();
        String result = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }
            else if( ch==')'){
                st.push(ch);
            }else if(ch=='('){
                while(!st.isEmpty() && st.peek()!=')'){
                    result+=st.pop();
                }
                if(!st.isEmpty()){
                    st.pop();
                }

            }else {
                while (!st.isEmpty() && ((prec(ch)<prec(st.peek())||(ch=='^' && st.peek()=='^')))){
                    result+=st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            result+=st.pop();
        }
        result  = new StringBuilder(result).reverse().toString();
        return result;
    }
}
