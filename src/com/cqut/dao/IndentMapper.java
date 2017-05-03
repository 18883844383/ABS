package com.cqut.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cqut.bean.Indent;

public interface IndentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int insert(Indent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int insertSelective(Indent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    Indent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int updateByPrimaryKeySelective(Indent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int updateByPrimaryKey(Indent record);
   
    int undo(Integer id);
    /**
     * 查询
     * @param parameters 查询字段
     * @param condition 条件
     * @param order 排序字段
     * @param sort 排序方式
     * @param offset 起始位置
     * @param limit 查询条数
     * @return 实体列表
     */
    List<Indent> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
    /**
     * 计数
     * @param parameters 统计字段
     * @param condition 条件
     * @param isDistinct 是否去重
     * @return 计数结果
     */
    long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
    
}