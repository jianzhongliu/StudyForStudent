package br.com.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * ����	����	����	�Ƿ�Ϊ��	����	����	��ע
identify	int	11	N	Y	Y	����id
lng						����
lat						γ��
uid						�û�id

 * */
@XmlRootElement
public class Location {
private Integer identify;
private float lng;
private float lat;
private Integer uid;
public Integer getIdentify() {
	return identify;
}
public void setIdentify(Integer identify) {
	this.identify = identify;
}
public float getLng() {
	return lng;
}
public void setLng(float lng) {
	this.lng = lng;
}
public float getLat() {
	return lat;
}
public void setLat(float lat) {
	this.lat = lat;
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}


}
