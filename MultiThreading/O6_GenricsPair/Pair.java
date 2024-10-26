package MultiThreading.O6_GenricsPair;

public class Pair <FIRST,SECOND>{
    private FIRST first;
    private SECOND second;

    public Pair(FIRST first, SECOND second){
        this.first = first;
        this.second = second;
    }

    public FIRST geFirst(){
        return first;
    }

    public void setFirst(FIRST first){
        this.first = first;
    }

    public SECOND getSecond(){
        return second;
    }
    
    public void setScond(){
        this.second = second;
    }
}
