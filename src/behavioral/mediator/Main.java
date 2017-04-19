package behavioral.mediator;

class Main {
    public static void main(String[] args) {
        ChatRoomMediator chatRoomMediator = new ChatRoomMediator();

        User john = new User("John", chatRoomMediator);
        User jane = new User("Jane", chatRoomMediator);

        john.send("Hi there");
        jane.send("Hey!");
    }
}
