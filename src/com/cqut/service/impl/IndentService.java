package com.cqut.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cqut.Util.SQLUtil;
import com.cqut.bean.Indent;
import com.cqut.dao.FlightMapper;
import com.cqut.dao.IndentMapper;
import com.cqut.service.IIndentService;

@Service
public class IndentService implements IIndentService {

	@Resource
	IndentMapper indentMapper;

	@Resource
	FlightMapper flightMapper;

	/**
	 * ��������
	 */
	@Override
	public void save(Indent indent) {
		indentMapper.insert(indent);
	}

	/**
	 * ɾ������
	 */
	@Override
	public void delete(int id) {
		indentMapper.deleteByPrimaryKey(id);
	}

	/**
	 * �޸Ķ���
	 */
	@Override
	public void update(Indent indent) {
		indentMapper.updateByPrimaryKeySelective(indent);
	}

	/**
	 * ��������
	 */
	@Override
	public void undo(int id) {
		indentMapper.undo(id);
	}

	/**
	 * ��Ӧ����
	 */
	@Override
	public Indent find(int id) {
		return indentMapper.selectByPrimaryKey(id);
	}

	/**
	 * ͳ������
	 */
	@Override
	public long count() {
		return indentMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return indentMapper.count(null,
				SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		// TODO Auto-generated method stub
		return indentMapper.count(SQLUtil.formatParameters(parameters), null,
				isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values,
			boolean isDistinct) {
		// TODO Auto-generated method stub
		return indentMapper.count(SQLUtil.formatParameters(parameters),
				SQLUtil.fillCondition(condition, values), isDistinct);
	}

	/**
	 * ��ʾ������Ϣ�б�
	 */
	@Override
	public List<Indent> load() {
		return indentMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Indent> load(String[] parameters, String order, String sort,
			int curPage, int limit) {
		// TODO Auto-generated method stub
		return indentMapper.select(SQLUtil.formatParameters(parameters), null,
				order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Indent> load(String[] parameters, String condition,
			Object[] values, String order, String sort, int curPage, int limit) {
		// TODO Auto-generated method stub
		return indentMapper.select(SQLUtil.formatParameters(parameters),
				SQLUtil.fillCondition(condition, values), order, sort,
				SQLUtil.getOffset(curPage, limit), limit);
	}

}