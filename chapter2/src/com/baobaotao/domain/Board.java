package com.baobaotao.domain;

import org.hibernate.annotations.Entity;

@Entity
public class Board extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String boardId;//id
	private String boardName;//�������
	private String boardDesc;//�������
	private int topicNum;//��������
	
	
	
	
	
	//------------------------------
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardDesc() {
		return boardDesc;
	}
	public void setBoardDesc(String boardDesc) {
		this.boardDesc = boardDesc;
	}
	public int getTopicNum() {
		return topicNum;
	}
	public void setTopicNum(int topicNum) {
		this.topicNum = topicNum;
	}
}
