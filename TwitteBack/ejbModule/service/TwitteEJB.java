package service;

import javax.ejb.LocalBean;
import twitter4j.*;
import twitter4j.auth.AccessToken;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TwitteEntity;

/**
 * Session Bean implementation class TwitteEJB
 */
@Stateless
@LocalBean
public class TwitteEJB {
	
	@PersistenceContext
	private EntityManager em;
  
    public TwitteEJB() {
        // TODO Auto-generated constructor stub
    }

    public void NewTweet(TwitteEntity twitteentity) {
    	
    	em.persist(twitteentity);
    }
    
    public String createTweet(String tweet) throws TwitterException {
    	
    	TwitterFactory twitterFactory = new TwitterFactory();
    	
    	
    	Twitter twitter = twitterFactory.getInstance();
        Status status = twitter.updateStatus("creating baeldung API");
        return status.getText();
    }
    
}
