package com.briup.jz.dao;

import com.briup.jz.bean.Order;
import com.briup.jz.bean.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    Order selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_order
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKey(Order record);
}