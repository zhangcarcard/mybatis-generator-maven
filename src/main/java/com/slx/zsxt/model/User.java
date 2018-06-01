package com.slx.zsxt.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private String userInstid;

    private String userId;

    private Short userState;

    private String userName;

    private String userKey;

    private String userSex;

    private String email;

    private Date cDate;

    private Date updateDate;

    private String mphone;

    private String orgId;

    private String userIdcard;

    private Date userBirthday;

    private BigDecimal userSbflg;

    private String userInname;

    public User(String userInstid, String userId, Short userState, String userName, String userKey, String userSex, String email, Date cDate, Date updateDate, String mphone, String orgId, String userIdcard, Date userBirthday, BigDecimal userSbflg, String userInname) {
        this.userInstid = userInstid;
        this.userId = userId;
        this.userState = userState;
        this.userName = userName;
        this.userKey = userKey;
        this.userSex = userSex;
        this.email = email;
        this.cDate = cDate;
        this.updateDate = updateDate;
        this.mphone = mphone;
        this.orgId = orgId;
        this.userIdcard = userIdcard;
        this.userBirthday = userBirthday;
        this.userSbflg = userSbflg;
        this.userInname = userInname;
    }

    public User() {
        super();
    }

    public String getUserInstid() {
        return userInstid;
    }

    public void setUserInstid(String userInstid) {
        this.userInstid = userInstid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public BigDecimal getUserSbflg() {
        return userSbflg;
    }

    public void setUserSbflg(BigDecimal userSbflg) {
        this.userSbflg = userSbflg;
    }

    public String getUserInname() {
        return userInname;
    }

    public void setUserInname(String userInname) {
        this.userInname = userInname;
    }
}