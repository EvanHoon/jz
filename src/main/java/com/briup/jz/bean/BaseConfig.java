package com.briup.jz.bean;

import java.io.Serializable;

public class BaseConfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config.id
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config.name
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config.val
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    private String val;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config.introduce
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    private String introduce;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_config
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config.id
     *
     * @return the value of base_config.id
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config.id
     *
     * @param id the value for base_config.id
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config.name
     *
     * @return the value of base_config.name
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config.name
     *
     * @param name the value for base_config.name
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config.val
     *
     * @return the value of base_config.val
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public String getVal() {
        return val;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config.val
     *
     * @param val the value for base_config.val
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public void setVal(String val) {
        this.val = val == null ? null : val.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config.introduce
     *
     * @return the value of base_config.introduce
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config.introduce
     *
     * @param introduce the value for base_config.introduce
     *
     * @mbg.generated Wed Jun 02 22:44:48 CST 2021
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}