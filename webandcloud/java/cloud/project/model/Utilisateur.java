package cloud.project.model;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;


public class Utilisateur {
	public String email;
	public String bucketName;
	public String objectName;

	
public Utilisateur() {}
	
	public Utilisateur(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

		public Entity createEntity() {
			Entity e = new Entity("utilisateur", email);
			e.setProperty("email", email);
			if(objectName != null && bucketName != null) {
				e.setProperty("objectName", objectName);
				e.setProperty("bucketName", bucketName);
			}
			return e;
		}
		
}
