package cloud.project;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import cloud.project.model.Utilisateur;
import cloud.project.util.*;

import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.BadRequestException;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.api.server.spi.auth.EspAuthenticator;

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.PropertyProjection;
import com.google.appengine.api.datastore.PreparedQuery.TooManyResultsException;
import com.google.appengine.api.datastore.Query.CompositeFilter;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Query.SortDirection;



import com.google.appengine.api.datastore.QueryResultList;
import com.google.appengine.api.datastore.Transaction;

@Api(name = Outils.name,
	version = Outils.version,
     audiences = Outils.audiences,
  	 clientIds = Outils.clientId,
     namespace =
     @ApiNamespace(
		   ownerDomain = "helloworld.example.com",
		   ownerName = "helloworld.example.com",
		   packagePath = "")
     )
class UtilisateurEndpoint {
	
	/**
	 * Create a new Utilisateur
	 * @param user
	 * @return
	 * @throws Exception 
	 */
	@ApiMethod(name = "createUtilisateur",path = "utilisateur/create", httpMethod = HttpMethod.POST)
	public Entity createUtilisateur(User user) throws Exception {
		//verify the credentials
		if(user == null) {
			throw new UnauthorizedException("Invalid credentials");
		}
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		if(Outils.userIsRegistered(user)) {
			throw new BadRequestException("User is already registered");
		}
		//create the new Entity
		Utilisateur utilisateur = new Utilisateur(user.getEmail());
		Entity entity = utilisateur.createEntity();
		Entity utilisateurInDatastore;
		try {
			utilisateurInDatastore = datastore.get(entity.getKey());
		}
		catch(EntityNotFoundException e) {
			utilisateurInDatastore = null;
		}
		if(utilisateurInDatastore == null) {
			entity.setProperty("active", true);
			datastore.put(entity);
			return entity;
		}
		else {
			utilisateurInDatastore.setProperty("active", true);
			datastore.put(utilisateurInDatastore);
			return utilisateurInDatastore;
		}
	} 

}
