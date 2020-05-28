package leetcode.栈;

import java.util.*;

public class _20_有效的括号 {
    public static void main(String args[]){

        _20_有效的括号 list=new _20_有效的括号();
        list.isValid("()");
    }
    public boolean isValid1(String s) {
         Deque<Character> stack=new ArrayDeque<>();
        char ch;
         for (int i=0;i<s.length();i++){
             switch (s.charAt(i)){
                 case '(':
                 case '[':
                 case '{':stack.push(s.charAt(i));break;
                 case ')':
                     if (!stack.isEmpty()&&stack.getFirst()=='('){
                        stack.pop();
                     }
                     else return false;
                     break;
                 case ']':
                     if (!stack.isEmpty()&&stack.getFirst()=='['){
                         stack.pop();
                     }
                     else return false;
                     break;
                 case '}':
                     if (!stack.isEmpty()&&stack.getFirst()=='{'){
                         stack.pop();
                     }
                     else return false;
                     break;
                 default:return false;
             }
         }
       return stack.isEmpty();
    }
    public boolean isValid(String s){
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (map.containsKey(c)){
                char top=stack.isEmpty()?'#':stack.pop();
                if (top!=map.get(c)) return false;
            } else stack.push(c);
        }
        return stack.isEmpty();
    }
}
