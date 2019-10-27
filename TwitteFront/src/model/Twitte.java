package model;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Date;
//import entities.TwitterEntity;

@ManagedBean(name="twitte")
@SessionScoped

public class Twitte implements Serializable {
	
	private String tmessage;
	private Date timeStamp;
	
	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return tmessage;
	}

	public void setMessage(String tmessage) {
		this.tmessage = tmessage;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;	
	}


	public TwitteEntity getEntity() {
		TwitteEntity twitteentity = new TwitteEntity();
		
		twitteentity.settMessage(tmessage);
		twitteentity.setTimestamp(timeStamp);
		
		return twitteentity;
	}

}
