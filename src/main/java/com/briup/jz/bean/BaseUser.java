package com.briup.jz.bean;

import java.io.Serializable;

public class BaseUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.username
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.password
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.telephone
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.realname
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.gender
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.birth
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.email
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.user_face
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String userFace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.register_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long registerTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.nation
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String nation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.id_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String idCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.idcard_photo_positive
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String idcardPhotoPositive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.idcard_photo_negative
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String idcardPhotoNegative;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.bank_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String bankCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.bank_card_photo
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String bankCardPhoto;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.balance
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Double balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.certification_status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String certificationStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_user.certification_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long certificationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_user
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.id
     *
     * @return the value of base_user.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.id
     *
     * @param id the value for base_user.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.username
     *
     * @return the value of base_user.username
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.username
     *
     * @param username the value for base_user.username
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.password
     *
     * @return the value of base_user.password
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.password
     *
     * @param password the value for base_user.password
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.telephone
     *
     * @return the value of base_user.telephone
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.telephone
     *
     * @param telephone the value for base_user.telephone
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.realname
     *
     * @return the value of base_user.realname
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.realname
     *
     * @param realname the value for base_user.realname
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.gender
     *
     * @return the value of base_user.gender
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.gender
     *
     * @param gender the value for base_user.gender
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.birth
     *
     * @return the value of base_user.birth
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.birth
     *
     * @param birth the value for base_user.birth
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setBirth(Long birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.email
     *
     * @return the value of base_user.email
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.email
     *
     * @param email the value for base_user.email
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.status
     *
     * @return the value of base_user.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.status
     *
     * @param status the value for base_user.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.user_face
     *
     * @return the value of base_user.user_face
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getUserFace() {
        return userFace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.user_face
     *
     * @param userFace the value for base_user.user_face
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setUserFace(String userFace) {
        this.userFace = userFace == null ? null : userFace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.register_time
     *
     * @return the value of base_user.register_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getRegisterTime() {
        return registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.register_time
     *
     * @param registerTime the value for base_user.register_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.nation
     *
     * @return the value of base_user.nation
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.nation
     *
     * @param nation the value for base_user.nation
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.id_card
     *
     * @return the value of base_user.id_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.id_card
     *
     * @param idCard the value for base_user.id_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.idcard_photo_positive
     *
     * @return the value of base_user.idcard_photo_positive
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getIdcardPhotoPositive() {
        return idcardPhotoPositive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.idcard_photo_positive
     *
     * @param idcardPhotoPositive the value for base_user.idcard_photo_positive
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setIdcardPhotoPositive(String idcardPhotoPositive) {
        this.idcardPhotoPositive = idcardPhotoPositive == null ? null : idcardPhotoPositive.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.idcard_photo_negative
     *
     * @return the value of base_user.idcard_photo_negative
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getIdcardPhotoNegative() {
        return idcardPhotoNegative;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.idcard_photo_negative
     *
     * @param idcardPhotoNegative the value for base_user.idcard_photo_negative
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setIdcardPhotoNegative(String idcardPhotoNegative) {
        this.idcardPhotoNegative = idcardPhotoNegative == null ? null : idcardPhotoNegative.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.bank_card
     *
     * @return the value of base_user.bank_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.bank_card
     *
     * @param bankCard the value for base_user.bank_card
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.bank_card_photo
     *
     * @return the value of base_user.bank_card_photo
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getBankCardPhoto() {
        return bankCardPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.bank_card_photo
     *
     * @param bankCardPhoto the value for base_user.bank_card_photo
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setBankCardPhoto(String bankCardPhoto) {
        this.bankCardPhoto = bankCardPhoto == null ? null : bankCardPhoto.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.balance
     *
     * @return the value of base_user.balance
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.balance
     *
     * @param balance the value for base_user.balance
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.certification_status
     *
     * @return the value of base_user.certification_status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getCertificationStatus() {
        return certificationStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.certification_status
     *
     * @param certificationStatus the value for base_user.certification_status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus == null ? null : certificationStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_user.certification_time
     *
     * @return the value of base_user.certification_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getCertificationTime() {
        return certificationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_user.certification_time
     *
     * @param certificationTime the value for base_user.certification_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setCertificationTime(Long certificationTime) {
        this.certificationTime = certificationTime;
    }
}