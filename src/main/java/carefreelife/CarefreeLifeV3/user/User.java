package carefreelife.CarefreeLifeV3.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private Long UID;
    protected String userName;
    protected String userId;
    protected String userPw;
    protected String userTel;
    protected String userAdr;

    public User() {
    }

    public User(String userName, String userId, String userPw, String userTel, String userAdr) {
        this.userName = userName;
        this.userId = userId;
        this.userPw = userPw;
        this.userTel = userTel;
        this.userAdr = userAdr;
    }
}
