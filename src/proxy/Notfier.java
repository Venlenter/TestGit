package proxy;

public abstract class Notfier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }
    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
    //增加需要帮忙放哨的学生
    public abstract void addListener(Object object, String methodName, Object... args);
    //告诉所有需要帮忙的学生：老师来了
    public abstract void notifyX();
}
