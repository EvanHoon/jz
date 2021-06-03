package com.briup.jz.dao;

import com.briup.jz.bean.Address;
import com.briup.jz.bean.AddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    long countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    Address selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_address
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKey(Address record);
}