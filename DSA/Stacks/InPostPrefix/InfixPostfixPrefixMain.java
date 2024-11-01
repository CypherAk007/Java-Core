package DSA.Stacks.InPostPrefix;

public class InfixPostfixPrefixMain {
    public static void main(String[] args) {
//        String input = "a+b*(c^d-e)^(f+g*h)-i";
        String input = "a^b^c";
//        String input = "a+b+c";
        String prefix = O2_InfixToPrefix.infixToPrefix(input);
        System.out.println("prefix "+prefix);
        String postfix = O1_InfixToPostfix.infixToPostfix(input);
        System.out.println("postfix "+postfix);

    }
}
