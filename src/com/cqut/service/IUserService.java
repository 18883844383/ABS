package com.cqut.service;

import java.util.List;
import java.util.Map;

import com.cqut.bean.User;
/**
 * �û�service
 * @author hshuai
 *
 */
public interface IUserService {
	/**
	 * �û���¼����
	 * @param user
	 * @return 
	 * Ĭ��falseΪ��¼ʧ��
	 */
	
	boolean login(User user);  
	/**
	 * �û�ע��  
	 * @param user
	 * @return
	 * Ĭ��falseΪע��ɹ�
	 */
	boolean register(User user);
	
	/**
	 * �����Ñ�
	 * @param user
	 * @return
	 */
	
	int save(User user);
	
	/**
	 * �h���Ñ�
	 * @param user
	 * @return
	 */
	int delete(Integer id);
	
	/**
	 * �޸��Ñ�
	 * @return
	 */
	int update(User user);
	
	/**
	 * �����û�
	 * @param map
	 * @return
	 */
	User select(User user);
	User selectByPrimaryKey(Integer id);
	/**
	 * ��ѯ�û�����
	 * @param map
	 * @return
	 */
	List<User> find(Map<String, Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	Long getTotal(Map<String, Object> map);
	
}
