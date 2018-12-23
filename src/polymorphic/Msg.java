package polymorphic;

import java.util.*;

public class Msg extends Throwable {
    private String chatId;
    private String msg;

    public Msg(String userId, String content) {
        chatId = userId;
        msg = content;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> formatParameter() {
        Map<String, Object> reqVar = new HashMap<>();
        reqVar.put("uid", chatId);
        reqVar.put("content", msg);
        return reqVar;
    }
    public void test() {
        Comparator test1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
        List<String> list = new ArrayList<>();
        Arrays.sort(list.toArray(), test1);
    }
}
