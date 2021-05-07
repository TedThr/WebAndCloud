package cloud.project.util;

import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;


public class Outils {
	public static final String name = "tinypet";
	public static final String version = "v2";
	public static final String clientId = "228791443561-vp108vrph2p73bvurv35h03ohff9c6kv.apps.googleusercontent.com";
	public static final String audiences = "228791443561-vp108vrph2p73bvurv35h03ohff9c6kv.apps.googleusercontent.com";
	public static final int NUMBER_LIKE_COUNTER = 25;
	public static final int NUMBER_FOLLOWER_COUNTER = 25;
	
	public static boolean userIsRegistered(User user) {
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		String mail = user.getEmail();
		//test if user is already registered
		Query q = new Query("user").setFilter(new FilterPredicate("email", FilterOperator.EQUAL, mail));
		PreparedQuery pq = datastore.prepare(q);
		Entity result = pq.asSingleEntity();
		if(result != null) {
			boolean isActive = (boolean) result.getProperty("active");
			return isActive;
		}
		else {
			return false;
		}
	}
	
	public static Key getUserKey(User user) throws Exception{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		String mail = user.getEmail(); 
		Query q = new Query("user").setFilter(new FilterPredicate("email", FilterOperator.EQUAL, mail)).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		Entity result = pq.asSingleEntity();
		if(result == null) {
			throw new Exception("User unregistered");
		}
		return result.getKey();
	}
	
	public static Key getProfileKey(String profileName) throws Exception{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query("user").setFilter(new FilterPredicate("profileName", FilterOperator.EQUAL, profileName)).setKeysOnly();
		PreparedQuery pq = datastore.prepare(q);
		Entity result = pq.asSingleEntity();
		if(result == null) {
			throw new NotFoundException("Inexistant profile");
		}
		return result.getKey();
	}
		
	public static EmbeddedEntity getEmbeddedProfile(Key profileKey) throws Exception{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query("person").setFilter(new FilterPredicate("__key__", FilterOperator.EQUAL, profileKey));
		PreparedQuery pq = datastore.prepare(q);
		Entity e =  pq.asSingleEntity();
		if(e != null) {
			EmbeddedEntity result = new EmbeddedEntity();
			result.setProperty("name", e.getProperty("name"));
			result.setProperty("profileName", e.getProperty("profileName"));
			result.setProperty("imageUrl", e.getProperty("imageUrl"));
			result.setProperty("key", profileKey);
			return result;
		}
		else {
			throw new NotFoundException("Inexistant profile");
		}
	}
}
