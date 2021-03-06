package com.evan.jz.bean;

import java.io.Serializable;

public class AccountCustomer implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.transfer_money
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Double transferMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.transfer_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long transferTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.type
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jz_account_customer.user_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jz_account_customer
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.id
     *
     * @return the value of jz_account_customer.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.id
     *
     * @param id the value for jz_account_customer.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.transfer_money
     *
     * @return the value of jz_account_customer.transfer_money
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Double getTransferMoney() {
        return transferMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.transfer_money
     *
     * @param transferMoney the value for jz_account_customer.transfer_money
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setTransferMoney(Double transferMoney) {
        this.transferMoney = transferMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.transfer_time
     *
     * @return the value of jz_account_customer.transfer_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getTransferTime() {
        return transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.transfer_time
     *
     * @param transferTime the value for jz_account_customer.transfer_time
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setTransferTime(Long transferTime) {
        this.transferTime = transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.description
     *
     * @return the value of jz_account_customer.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.description
     *
     * @param description the value for jz_account_customer.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.type
     *
     * @return the value of jz_account_customer.type
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.type
     *
     * @param type the value for jz_account_customer.type
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.status
     *
     * @return the value of jz_account_customer.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.status
     *
     * @param status the value for jz_account_customer.status
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jz_account_customer.user_id
     *
     * @return the value of jz_account_customer.user_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jz_account_customer.user_id
     *
     * @param userId the value for jz_account_customer.user_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}