package cn.itcast.ioc;

public class PropertyDemo1 {
    private String username;

    public PropertyDemo1(String username){
        this.username = username;
    }

    public PropertyDemo1(){

    }

    public void testIt(){
        System.out.println(username + " it tested!");
    }
}
