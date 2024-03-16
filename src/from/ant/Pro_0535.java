package from.ant;

import java.util.HashMap;
import java.util.Map;

public class Pro_0535 {
}

class Codec {

    private int id = 1;
    private String prefix = "http://tinyurl.com/";
    private Map<String, String> idToOriginMap = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String idStr = String.valueOf(id++);
        String res = prefix + idStr;
        idToOriginMap.put(idStr, longUrl);
        return res;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String idStr = shortUrl.substring(prefix.length());
        return idToOriginMap.get(idStr);
    }
}