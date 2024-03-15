package sleepjo.common;


public class MemberDTO {

    private int code;
    private String id;
    private String password;
    private String name;
    private String userName;
    private String email;

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public MemberDTO() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MemberDTO(int code, String id, String password, String name, String userName, String email) {
        this.code = code;
        this.id = id;
        this.password = password;
        this.name = name;
        this.userName = userName;
        this.email = email;
    }
}
