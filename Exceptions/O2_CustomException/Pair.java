package Exceptions.O2_CustomException;

public class Pair {
    private String first;
    private String second;
    public Pair(Object first,Object second){
        if(first==null||second==null){
//            list.add(new Pair(null,null));
//            throw new RuntimeException("null values are not allowed in pair");
//            throw new NullValuesNotAllowedException();
            throw new NullValuesNotAllowedException("Null not allowed Parametrized constructor");
        }
//        this also throws error of typcasting int to string.
//        but output we get is
//            list.add(new Pair(1,2));
        this.first = (String) first;
        this.second = (String) second;

    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString(){
        return "First: "+this.first+" Second: "+this.second;
    }
}
