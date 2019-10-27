package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Twitte;
import service.TwitteEJB;
import twitter4j.TwitterException;

@ManagedBean(name="twittecontroller")
@SessionScoped
public class TwitteController {
	@EJB
	TwitteEJB twitteservice;
	
	@ManagedProperty(value="#{twitte}")
	
	private Twitte twitte;
	
	public Twitte getTwitter() {
		return twitte;
	}

	public void setTwitter(Twitte twitte) {
		this.twitte = twitte;
	}

	private void postTwitte() {
		
		twitteservice.NewTweet(twitte.getEntity());
		
		try {
			twitteservice.createTweet(twitte.getMessage());
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
