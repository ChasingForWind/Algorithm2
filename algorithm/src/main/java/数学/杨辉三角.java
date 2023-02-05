package 数学;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(1);
            List<Integer> preList = list.get(i - 1);
            for (int j = 0; j < preList.size() - 1; j++) {
                newList.add(preList.get(j)+preList.get(j+1));
            }
            newList.add(1);
            list.add(newList);
        }
        return list;
    }
}
