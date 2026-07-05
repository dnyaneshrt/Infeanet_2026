package caching;

import java.util.HashMap;
import java.util.Map;

public class CounsellorService {
    //Cache
    private Map<Integer, Counsellor> cache=new HashMap<>();

    private CounsellorDB counsellorDB=new CounsellorDB();

    public Counsellor getCounsellor(int id)
    {
        //step 1: Check cache
        if(cache.containsKey(id))
        {
            System.out.println("data will be fetched from cache!!");
            return cache.get(id);
        }

        //step 2: fetch from database
        Counsellor counsellor=counsellorDB.getCounsellorFromDB(id);
        cache.put(id,counsellor);
        return counsellor;
    }

}
