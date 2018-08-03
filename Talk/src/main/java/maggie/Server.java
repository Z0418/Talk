package main.java.maggie;

// 列表类
import java.util.LinkedList;
import java.util.List;
import main.java.maggie.User;

public class Server {

    public List<User> users;
    private int port;

    public Server(int port) {
        this.users = new LinkedList<>();
        this.port = port;
    }

    public void acceptuser(User u){
        this.users.add(u);

    }

    public User searchuser(final String keyword){

//        this.users.forEach(u -> {
//            if (u.name.contains(keyword) || u.signature.contains(keyword)) {
//                return u;
//            }
//        });
//
//        for (u in )
        return null;
    }

    /**
     *
     * @param message 包含内容， 发送人和接收人的消息
     * @return 返回是否转发成功
     */
    public boolean forwardMessage(Message message) {
        return true;
    }

}
