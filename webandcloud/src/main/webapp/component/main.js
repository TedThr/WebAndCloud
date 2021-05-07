

function googleAuthChangeUser(){
	controller.changeInGoogleAuth();
}

function googleAuthInit(){
	var googleAuth = gapi.auth2.getAuthInstance();
	controller.setGoogleAuth(googleAuth);
	googleAuth.currentUser.listen(googleAuthChangeUser);
}

function googleAuthError(){
	console.log("Google auth error");
}


function gapiInit(){
	gapi.load('auth2', function() {
		gapi.auth2.init({client_id : "927375242383-t21v9ml38tkh2pr30m4hqiflkl3jfohl.apps.googleusercontent.com"}).then(googleAuthInit, googleAuthError);
	  });
}

function gapiRender(id){
	gapi.signin2.render(id, {
	  scope: "profile",
	  width: 350,
	  height: 80,
	  longtitle: true,
	  theme: 'dark',
	  onsuccess: googleAuthInit,
	  onfailure: googleAuthError
	});
	return true;
}

var root = document.body

m.route(root, "/")

