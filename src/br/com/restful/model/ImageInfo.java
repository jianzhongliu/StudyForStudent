package br.com.restful.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ����	����	����	�Ƿ�Ϊ��	����	����	��ע
identify	int	11	N	Y	Y	����id
imgurl						
imglocal						��ͼ
imgicon						Сͼ
imgcontent						ͼƬ����
anserid						��id
questionid						����id
imgdate						ͼƬ����ʱ��

 * */
@XmlRootElement
public class ImageInfo {
private Integer identify;
private String imgurl;
private String imglocal;
private String imgicon;
private String imgcontent;
private Integer anserid;
private Integer questionid;
private Date imgdate;
public Integer getIdentify() {
	return identify;
}
public void setIdentify(Integer identify) {
	this.identify = identify;
}
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}
public String getImglocal() {
	return imglocal;
}
public void setImglocal(String imglocal) {
	this.imglocal = imglocal;
}
public String getImgicon() {
	return imgicon;
}
public void setImgicon(String imgicon) {
	this.imgicon = imgicon;
}
public String getImgcontent() {
	return imgcontent;
}
public void setImgcontent(String imgcontent) {
	this.imgcontent = imgcontent;
}
public Integer getAnserid() {
	return anserid;
}
public void setAnserid(Integer anserid) {
	this.anserid = anserid;
}
public Integer getQuestionid() {
	return questionid;
}
public void setQuestionid(Integer questionid) {
	this.questionid = questionid;
}
public Date getImgdate() {
	return imgdate;
}
public void setImgdate(Date imgdate) {
	this.imgdate = imgdate;
}


}
