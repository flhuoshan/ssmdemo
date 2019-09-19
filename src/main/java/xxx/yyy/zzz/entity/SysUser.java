package xxx.yyy.zzz.entity;

public class SysUser {
    private String userid;

    private String username;

    private Byte userrole;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Byte getUserrole() {
        return userrole;
    }

    public void setUserrole(Byte userrole) {
        this.userrole = userrole;
    }
}