package com.evan.jz.dao;

import com.evan.jz.bean.Comment;
import com.evan.jz.bean.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comment
     *
     * @mbg.generated Thu Jun 03 16:08:43 CST 2021
     */
    int updateByPrimaryKey(Comment record);
}