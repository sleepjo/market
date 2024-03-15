package sleepjo.common;


public class MemberDTO {

    private int code;
    private String id;
    private String password;
    private String name;
    private String nickName;
    private String eMail;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public MemberDTO(int code, String id, String password, String name, String nickName, String eMail) {
        this.code = code;
        this.id = id;
        this.password = password;
        this.name = name;
        this.nickName = nickName;
        this.eMail = eMail;
    }
}
