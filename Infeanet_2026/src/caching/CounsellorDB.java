package caching;

import java.util.HashMap;
import java.util.Map;

public class CounsellorDB {
    private static Map<Integer, Counsellor> database=new HashMap<>();

    static
    {
        database.put(1001, new Counsellor(101,"Yash"));
        database.put(1002, new Counsellor(102,"Kunal"));
        database.put(1003, new Counsellor(103,"Shrushti"));
        database.put(1004, new Counsellor(104,"Arya"));
    }

    public Counsellor getCounsellorFromDB(int id)
    {
        System.out.println("fetching counsellor from database.......");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return database.get(id);
    }
}
