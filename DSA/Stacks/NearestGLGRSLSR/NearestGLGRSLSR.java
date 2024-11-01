package DSA.Stacks.NearestGLGRSLSR;

import java.util.*;

public class NearestGLGRSLSR {
    private Stack<Integer> st ;
    public NearestGLGRSLSR(){
    }

    public List<Integer> NGR(List<Integer> arr){
        this.st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =arr.size()-1;i>=0;i--){
            if(st.isEmpty()){
                ans.add(-1);
            } else if (!st.isEmpty() && st.peek()>arr.get(i)) {
                ans.add(st.peek());

            }else if(!st.isEmpty() && st.peek()<=arr.get(i)){
                while (!st.isEmpty() && st.peek()<=arr.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);
                }else{
                    ans.add(st.peek());
                }
            }
            st.push(arr.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }

    public List<Integer> NGL (List<Integer> arr){
        this.st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(st.isEmpty()){
                ans.add(-1);
            } else if (!st.isEmpty() && st.peek()>arr.get(i)) {
                ans.add(st.peek());

            }else if(!st.isEmpty() && st.peek()<=arr.get(i)){
                while (!st.isEmpty() && st.peek()<=arr.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);
                }else{
                    ans.add(st.peek());
                }
            }
            st.push(arr.get(i));
        }

        return ans;
    }

    public List<Integer> NSL (List<Integer> arr){
        this.st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(st.isEmpty()){
                ans.add(-1);
            } else if (!st.isEmpty() && st.peek()<arr.get(i)) {
                ans.add(st.peek());

            }else if(!st.isEmpty() && st.peek()>=arr.get(i)){
                while (!st.isEmpty() && st.peek()>=arr.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);
                }else{
                    ans.add(st.peek());
                }
            }
            st.push(arr.get(i));
        }

        return ans;
    }

    public List<Integer> NSR (List<Integer> arr){
        this.st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =arr.size()-1;i>=0;i--){
            if(st.isEmpty()){
                ans.add(-1);
            } else if (!st.isEmpty() && st.peek()<arr.get(i)) {
                ans.add(st.peek());

            }else if(!st.isEmpty() && st.peek()>=arr.get(i)){
                while (!st.isEmpty() && st.peek()>=arr.get(i)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);
                }else{
                    ans.add(st.peek());
                }
            }
            st.push(arr.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}
