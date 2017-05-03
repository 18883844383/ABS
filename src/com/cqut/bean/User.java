package com.cqut.bean;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.real_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nick_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.log_in_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String logInName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private Short sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private Short age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.telephone
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id_card_number
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String idCardNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.real_name
     *
     * @return the value of user.real_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.real_name
     *
     * @param realName the value for user.real_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nick_name
     *
     * @return the value of user.nick_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nick_name
     *
     * @param nickName the value for user.nick_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.log_in_name
     *
     * @return the value of user.log_in_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getLogInName() {
        return logInName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.log_in_name
     *
     * @param logInName the value for user.log_in_name
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setLogInName(String logInName) {
        this.logInName = logInName == null ? null : logInName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public Short getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setAge(Short age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.telephone
     *
     * @return the value of user.telephone
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.telephone
     *
     * @param telephone the value for user.telephone
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id_card_number
     *
     * @return the value of user.id_card_number
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getIdCardNumber() {
        return idCardNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id_card_number
     *
     * @param idCardNumber the value for user.id_card_number
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}