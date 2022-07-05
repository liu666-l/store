package com.cy.store.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.Date;
import java.util.Objects;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2022-06-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * �û�id
     */
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    /**
     * �û���
     */
    private String username;

    /**
     * ����
     */
    private String password;

    /**
     * ��ֵ
     */
    private String salt;

    /**
     * �绰����
     */
    private String phone;

    /**
     * ��������
     */
    private String email;

    /**
     * �Ա�:0-Ů��1-��
     */
    private Integer gender;

    /**
     * ͷ��
     */
    private String avatar;

    /**
     * �Ƿ�ɾ����0-δɾ����1-��ɾ��
     */
    private Integer is_delete;

    /**
     * ��־-������
     */
    private String created_user;

    /**
     * ��־-����ʱ��
     */
    private Date created_time ;

    /**
     * ��־-����޸�ִ����
     */
    private String modified_user;

    /**
     * ��־-����޸�ʱ��
     */
    private Date modified_time;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    public String getCreated_user() {
        return created_user;
    }

    public void setCreated_user(String created_user) {
        this.created_user = created_user;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time =  created_time;
    }

    public String getModified_user() {
        return modified_user;
    }

    public void setModified_user(String modified_user) {
        this.modified_user = modified_user;
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User tUser = (User) o;
        return Objects.equals(uid, tUser.uid) && Objects.equals(username, tUser.username) && Objects.equals(password, tUser.password) && Objects.equals(salt, tUser.salt) && Objects.equals(phone, tUser.phone) && Objects.equals(email, tUser.email) && Objects.equals(gender, tUser.gender) && Objects.equals(avatar, tUser.avatar) && Objects.equals(is_delete, tUser.is_delete) && Objects.equals(created_user, tUser.created_user) && Objects.equals(created_time, tUser.created_time) && Objects.equals(modified_user, tUser.modified_user) && Objects.equals(modified_time, tUser.modified_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, salt, phone, email, gender, avatar, is_delete, created_user, created_time, modified_user, modified_time);
    }

    @Override
    public String toString() {
        return "TUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", avatar='" + avatar + '\'' +
                ", is_delete=" + is_delete +
                ", created_user='" + created_user + '\'' +
                ", created_time=" + created_time +
                ", modified_user='" + modified_user + '\'' +
                ", modified_time=" + modified_time +
                '}';
    }
}
