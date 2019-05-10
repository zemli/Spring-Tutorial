package cn.itcast.ioc;

public class UserService {
    // 1 定义DAO属性
    private UserDao userDao;
    // 2 生成set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
         System.out.println("Service......");
         //旧方法：在Service里面得到DAO对象，才可以用add方法。
         UserDao dao1 = new UserDao();
         dao1.add();
     }


}
