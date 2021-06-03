package com.briup.jz.dao;

import com.briup.jz.bean.CertificationApply;
import com.briup.jz.bean.CertificationApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificationApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    long countByExample(CertificationApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int deleteByExample(CertificationApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int insert(CertificationApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int insertSelective(CertificationApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    List<CertificationApply> selectByExample(CertificationApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    CertificationApply selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int updateByExampleSelective(@Param("record") CertificationApply record, @Param("example") CertificationApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int updateByExample(@Param("record") CertificationApply record, @Param("example") CertificationApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int updateByPrimaryKeySelective(CertificationApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jz_certification_apply
     *
     * @mbg.generated Thu Jun 03 16:46:58 CST 2021
     */
    int updateByPrimaryKey(CertificationApply record);
}