package com.evan.jz.bean;

import java.io.Serializable;

public class Category implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_category.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_category.name
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_category.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_category.no
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Integer no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_category.parent_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_category
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_category.id
     *
     * @return the value of cms_category.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_category.id
     *
     * @param id the value for cms_category.id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_category.name
     *
     * @return the value of cms_category.name
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_category.name
     *
     * @param name the value for cms_category.name
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_category.description
     *
     * @return the value of cms_category.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_category.description
     *
     * @param description the value for cms_category.description
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_category.no
     *
     * @return the value of cms_category.no
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Integer getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_category.no
     *
     * @param no the value for cms_category.no
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_category.parent_id
     *
     * @return the value of cms_category.parent_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_category.parent_id
     *
     * @param parentId the value for cms_category.parent_id
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}