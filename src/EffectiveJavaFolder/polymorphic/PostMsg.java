package EffectiveJavaFolder.polymorphic;

import java.util.Map;

public class PostMsg extends Msg {
    private Map<String, String> post;

    public Map<String, String> getPost() {
        return post;
    }

    public void setPost(Map<String, String> post) {
        this.post = post;
    }

    public PostMsg(String userId, String msg, Map<String, String> post) {
        super(userId, msg);
        this.post = post;
    }

    @Override
    public Map<String, Object> formatParameter() {
        Map<String, Object> reqVar = super.formatParameter();
        reqVar.put("post", post);
        return reqVar;
    }
}
