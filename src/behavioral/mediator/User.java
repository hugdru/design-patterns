package behavioral.mediator;

class User {
    private String name;
    private ChatRoomMediator chatRoomMediator;

    public User(String name, ChatRoomMediator chatRoomMediator) {
        this.name = name;
        this.chatRoomMediator = chatRoomMediator;
    }

    public String getName() {
        return name;
    }

    public ChatRoomMediator getChatRoomMediator() {
        return chatRoomMediator;
    }

    public void send(String message) {
        this.chatRoomMediator.showMessage(this, message);
    }
}
