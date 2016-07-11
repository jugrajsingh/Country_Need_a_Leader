import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Jugraj Singh on 10-07-2016.
 */
public class Challenge {
    ArrayList<String> mylist;
    public Challenge(List<String> list) throws FileNotFoundException {
        HashSet<Character> hashSet;
        Map<Integer,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            String name = list.get(i);
            hashSet = new HashSet<>();
            for(int j = 0; j < name.length(); j++){
                if(!Character.isSpaceChar(name.charAt(j))){
                    hashSet.add(name.charAt(j));
                }
            }
            //System.out.println(hashSet.size());
            ArrayList tempList = null;
            if (map.containsKey(hashSet.size())) {
                tempList = map.get(hashSet.size());
                if(tempList == null)
                    tempList = new ArrayList();
                tempList.add(name);
            } else {
                tempList = new ArrayList();
                tempList.add(name);
            }
            map.put(hashSet.size(),tempList);
        }
        //System.out.println(map);
        TreeMap<Integer,ArrayList<String>> listTreeMap = new TreeMap<>(map);
        mylist = map.get(listTreeMap.lastKey());
        Collections.sort(mylist);
    }

    @Override
    public String toString() {
        return mylist.get(0);
    }
}
