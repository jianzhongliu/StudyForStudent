package br.com.restful.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * ����	����	����	�Ƿ�Ϊ��	����	����	��ע
identify	int	11	N	Y	Y	����id
auid	int	11	N			�ش���id
qid	int	11	N			��Ӧ����id
status	int	1				�Ƿ���ɣ�0��ʾû�в��ɣ�1��ʾ������
score	int	2				�������
content	vchar					������
adate	date					�𰸴���ʱ��

 * 
 * 
 * */
@XmlRootElement
public class Anser {
	
private Integer identify;
private Integer auid;
private Integer qid;
private Integer status;
private Integer score;
private String content;
private Date adate;


public Integer getIdentify() {
	return identify;
}
public void setIdentify(Integer identify) {
	this.identify = identify;
}
public Integer getAuid() {
	return auid;
}
public void setAuid(Integer auid) {
	this.auid = auid;
}
public Integer getQid() {
	return qid;
}
public void setQid(Integer qid) {
	this.qid = qid;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}
public Integer getScore() {
	return score;
}
public void setScore(Integer score) {
	this.score = score;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getAdate() {
	return adate;
}
public void setAdate(Date adate) {
	this.adate = adate;
}

@Override
public String toString() {
	return "[identify=" + identify + ", auid=" + auid +", qid=" + qid +", status=" + status + ", score=" + score
			+ ", content=" + content + ", adate=" + adate + "]";
}


}
