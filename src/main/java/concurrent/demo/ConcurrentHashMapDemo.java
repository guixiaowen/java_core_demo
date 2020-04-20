package concurrent.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map<String, String> testMap = new ConcurrentHashMap();
        testMap.put("test", "test1");
    }
}
