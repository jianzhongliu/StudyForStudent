package br.com.restful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ����	����	����	�Ƿ�Ϊ��	����	����	��ע
identify	int	11	N	Y	Y	����id
title						����title
content						��������
imgurl						����ͼƬurl
sharedate						����ʱ��
shareurl						����url

 * */
@XmlRootElement
public class Share {
private Integer identify;
private String title;
private String content;
private String imgurl;
private Date sharedate;
private String shareurl;
public Integer getIdentify() {
	return identify;
}
public void setIdentify(Integer identify) {
	this.identify = identify;
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
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}
public Date getSharedate() {
	return sharedate;
}
public void setSharedate(Date sharedate) {
	this.sharedate = sharedate;
}
public String getShareurl() {
	return shareurl;
}
public void setShareurl(String shareurl) {
	this.shareurl = shareurl;
}

}
