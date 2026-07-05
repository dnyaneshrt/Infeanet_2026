package caching;

public class MainCache {
    public static void main(String[] args) {
        CounsellorService counsellorService=new CounsellorService();

        long startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1001));
        long endTime= System.currentTimeMillis();

        System.out.println("Time: "+(endTime-startTime)+" ms");

        System.out.println("----------------");

        startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1001));
        endTime= System.currentTimeMillis();

        System.out.println("Time: "+(endTime-startTime)+" ms");

        System.out.println("----------------");
        startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1001));
        endTime= System.currentTimeMillis();

        System.out.println("Time: "+(endTime-startTime)+" ms");
        System.out.println("----------------");
        startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1001));
        endTime= System.currentTimeMillis();


        System.out.println("Time: "+(endTime-startTime)+" ms");
        System.out.println("----------------");
        startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1002));
        endTime= System.currentTimeMillis();


        System.out.println("Time: "+(endTime-startTime)+" ms");

        System.out.println("----------------");
        startTime= System.currentTimeMillis();
        System.out.println(counsellorService.getCounsellor(1002));
        endTime= System.currentTimeMillis();


        System.out.println("Time: "+(endTime-startTime)+" ms");

    }
}
