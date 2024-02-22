package Constructor.taskParameterizedConstructor;


class Facebook{
    String pwd;
    String mailid;
    String name;

    Facebook(String name, String mailid, String pwd){
        this.name = name;
        this.pwd = pwd;
        this.mailid = mailid;
    }

}
public class FaceBook {
    public static void main(String[] args) {
        Facebook f = new Facebook("Sai", "sai@2022", "1234");
        System.out.println("Mail id: "+ f.mailid);
        System.out.println("Name: "+ f.name);
        System.out.println("Pwd: "+ f.pwd);
    }
}
