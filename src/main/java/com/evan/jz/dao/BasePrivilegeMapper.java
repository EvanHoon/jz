package com.evan.jz.dao;

import com.evan.jz.bean.BasePrivilege;
import com.evan.jz.bean.BasePrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    long countByExample(BasePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByExample(BasePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insert(BasePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insertSelective(BasePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    List<BasePrivilege> selectByExample(BasePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    BasePrivilege selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") BasePrivilege record, @Param("example") BasePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExample(@Param("record") BasePrivilege record, @Param("example") BasePrivilegeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKeySelective(BasePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_privilege
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKey(BasePrivilege record);
}