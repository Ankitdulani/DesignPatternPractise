import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class StackList {

    List<Integer> list = new ArrayList<>();
    int current = 0;

    public void push(int x) {
        list.add(x);
        current++;
    }

    public int pop() {
        return list.get(--current);
    }

    public ITR getIteratorInstance(){
        return new ITR();
    }

    public class ITR{
        int itr = list.size()-1;

        public boolean hasNext(){
            return itr>=0;
        }
        public int next(){
            return list.get(itr--);
        }
    }


}
