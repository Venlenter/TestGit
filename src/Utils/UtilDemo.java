package Utils;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class UtilDemo {
    public static void main(String[] args) {
        //get方式
        String getResult = HttpClientUtils.doGet("https://www.xxx.com");
        //json转map
        Map result = new Gson().fromJson(getResult, Map.class);

        //---------------------------------------------------

        //post方式
        String webname = "https://www.xxx.com";
        //body请求参数
        Map<String, Object> body = new HashMap<>();
        body.put("key1", "value1");
        String sid = "sid111";
        String cookie = "cookiexxx";
        Map<String, String> headers = new HashMap<>();
        headers.put("cookie", cookie);
        String url = webname + "&sid=" + sid;
        //map转json
        String param = new Gson().toJson(body);
        String postResult = HttpClientUtils.doPost(url, param, headers);
        //json转map
        Map resutl2 = new Gson().fromJson(postResult, Map.class);
    }
}
