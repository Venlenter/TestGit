package polymorphic;

import java.util.Map;

public class cardMsg extends Msg {
    private Map<String, Object> card;

    public Map<String, Object> getCard() {
        return card;
    }

    public void setCard(Map<String, Object> card) {
        this.card = card;
    }

    public cardMsg(String userId, String content, Map<String, Object> card) {
        super(userId, content);
        this.card = card;
    }
}
