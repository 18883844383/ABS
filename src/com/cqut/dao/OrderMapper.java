package com.cqut.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cqut.bean.Order;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Jul 24 13:40:49 CST 2016
     */
    int updateByPrimaryKey(Order record);
   
    int undo(Integer id);
    /**
     * ��ѯ
     * @param parameters ��ѯ�ֶ�
     * @param condition ����
     * @param order �����ֶ�
     * @param sort ����ʽ
     * @param offset ��ʼλ��
     * @param limit ��ѯ����
     * @return ʵ���б�
     */
    List<Order> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
    /**
     * ����
     * @param parameters ͳ���ֶ�
     * @param condition ����
     * @param isDistinct �Ƿ�ȥ��
     * @return �������
     */
    long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
    
}