package cloud.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

import cloud.project.util.Outils;


public class Petition {
	
	public String titre;
	public String description;
	public String currentUser;
	public Date date;
	public String tags; 
	public ArrayList<String> votants;
	public Integer nbvotants;
	public String id;
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public ArrayList<String> getVotants() {
		return votants;
	}

	public void setVotants(ArrayList<String> votants) {
		this.votants = votants;
	}

	public Integer getNbvotants() {
		return nbvotants;
	}

	public void setNbvotants(Integer nbvotants) {
		this.nbvotants = nbvotants;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Petition() {}

	
	
	
	/*
	 * 
	 * public void generateKey() { Date date = new Date(); //this.date = date; Long
	 * timestamp = Long.MAX_VALUE-(date.getTime()); keyString = timestamp +":" +
	 * petitionKey; }
	 * 
	 * public Entity toEntity() { Entity e = new Entity("post", keyString);
	 * e.setProperty("petitionKey", petitionKey); e.setProperty("description",
	 * description); return e; }
	 * 
	 * 
	 * 
	 * public List<Entity> createSignCounter(Key postKey) { //Public counter (with
	 * contention) List<Entity> signCounter = new ArrayList<>(); Entity counter;
	 * String counterId; for(int i = 1 ; i <= Outils.NUMBER_LIKE_COUNTER ; ++i) {
	 * counterId = "" + i + postKey; counter = new Entity("likeNumber", counterId,
	 * petitionKey); counter.setProperty("number", 0);
	 * counter.setProperty("petitionKey", petitionKey); signCounter.add(counter); }
	 * return signCounter; }
	 */
	
}
