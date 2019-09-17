package EffectiveJavaFolder.polymorphic;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

public class msgDemo {
    public static void main(String[] args)  throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.toArray(new String[0]);
        Set<String> set = new HashSet<>();
        set.toArray();

        Map<String, String> post = new HashMap<>();
        post.put("url", "www.baidu.com");
        Msg msg = new PostMsg("#123#T", "消息内容", post);
        PostMsg postMsg = (PostMsg) msg;
        System.out.println(postMsg.getPost().get("url"));
        Class msgClass = msg.getClass();
        Field userId = msgClass.getDeclaredField("userId");
        userId.setAccessible(true);
        userId.get(msg);
        msgClass.getMethod("formatParameter", null);

//        String driver = "com.mysql.jdbc.Driver";
//        Class.forName(driver);
//        String url = "jdbc:mysql:127.0.0.1:3306/cmxt";
//        Connection con = DriverManager.getConnection(url, "root", "123");
//        String sql = "insert into td_user values(1, '小明')";
//        Statement cmd = con.createStatement();
//        con.setAutoCommit(false);
//        cmd.executeUpdate(sql);
//        con.commit();

//        String driver = "com.mysql:jdbc:Driver";
//        Class.forName(driver);
//        String url = "jdbc:mysql:127.0.0.1:3306/cmxt";
//        Connection conn = DriverManager.getConnection(url, "root", "123");
//        String sql = "select uid,true_name from td_user where id=?";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//        preparedStatement.setInt(1, 12);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            resultSet.getString()
//        }

    }
}
