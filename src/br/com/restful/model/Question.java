package br.com.restful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * 
identify int	11	N	Y	Y	����id
quid	int	11	N			������
title	vchar	200	N			����
content	vchar	1000				��������
gold	float					�۸�
qdate	date					����ʱ��
qtime	date					������ʱ������Ľ�ֹ����
qclosedate	date					����ر�ʱ��
status	int	11				��ǰ״̬��0��ʾ������1��ʾ�ѹر�

 * 
 * */
@XmlRootElement
public class Question {
	
private Integer identify ;
private Integer quid;
private String title ;
private String content;
private float gold ;
private Date qdate ;
private Date qtime;
private Date qclosedate ;
private Integer status;
public Integer getIdentify() {
	return identify;
}
public void setIdentify(Integer identify) {
	this.identify = identify;
}
public Integer getQuid() {
	return quid;
}
public void setQuid(Integer quid) {
	this.quid = quid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public float getGold() {
	return gold;
}
public void setGold(float gold) {
	this.gold = gold;
}
public Date getQdate() {
	return qdate;
}
public void setQdate(Date qdate) {
	this.qdate = qdate;
}
public Date getQtime() {
	return qtime;
}
public void setQtime(Date qtime) {
	this.qtime = qtime;
}
public Date getQclosedate() {
	return qclosedate;
}
public void setQclosedate(Date qclosedate) {
	this.qclosedate = qclosedate;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}



}
