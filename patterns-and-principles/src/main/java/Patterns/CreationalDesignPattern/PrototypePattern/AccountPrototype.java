package Patterns.CreationalDesignPattern.PrototypePattern;

import java.util.Hashtable;

	// PROTOTYPE PATTERN - using the original object as the prototype, you can create or clone a new object and modify it according to our needs saving time and resources
	// Prototype pattern can use either shallow copy, deep copy.

	// So, usually, if we need a shallow copy of the object, we can use the in built clone method provided by the Object class 
	// SHALLOW COPY - So, here only the references will be copied (when an object has refernces to other objects) but not the object themselves. 
	// This is used in clone method of Object class. ( Here, class has to implement Cloneable inteface and override inbuilt clone method.
	
	// But we need to implement a custom clone method, if we need a deep copy of the object as shown in example below
	
	// DEEP COPY - the entire object is copied not the reference i.e. the values of the object's attributes(email, username etc in example) are copied into the new object, 
    // So, now prototype object created and original object don't share the same references.

abstract class AccountPrototype { // prototype abstract class
    protected String username;
    protected String password;
    protected String email;
    protected String role;

    public abstract AccountPrototype clone();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

class AdminAccountPrototype extends AccountPrototype { // prototype class impl
    public AdminAccountPrototype() {
        this.role = "admin";
    }

    @Override
    public AccountPrototype clone() {
        AdminAccountPrototype adminAccount = new AdminAccountPrototype();
        adminAccount.setUsername(this.username);
        adminAccount.setPassword(this.password);
        adminAccount.setEmail(this.email);
        return adminAccount;
    }
}

class UserAccountPrototype extends AccountPrototype { // prototype class
    public UserAccountPrototype() {
        this.role = "user";
    }

    @Override
    public AccountPrototype clone() {
        UserAccountPrototype userAccount = new UserAccountPrototype();
        userAccount.setUsername(this.username); // deep copy because object has no references to other objects and we are copying values of all object attributes to new object
        userAccount.setPassword(this.password);
        userAccount.setEmail(this.email);
        return userAccount;
    }
}
	
	/*
	 * In this example, we have an abstract AccountPrototype class, which is
	 * implemented by two concrete classes AdminAccountPrototype and
	 * UserAccountPrototype. The AccountFactory class is responsible for creating
	 * new instances of the account prototypes, which can be obtained using the
	 * getAccountPrototype() method and passing in the role of the account to be
	 * created (either "admin" or "user").
	 * 
	 * In this example, the factory's role is to create new user account prototypes,
	 * you can use this prototype to create new user accounts for your application,
	 * for example when a user signs up to your application, you can use this
	 * factory to create a new user account prototype, set the user's information
	 * (username, password, email) and then save it to the database.
	 */

class AccountFactory {
	//	This Hashtable stores the account prototypes, allowing for efficient creation of new instances by simply
	//	cloning the existing prototypes. So, if we want to create a new user account, give the role name like user, we can clone user account type and modify it accordingly
	
    private static Hashtable<String, AccountPrototype> prototypes = new Hashtable<String, AccountPrototype>();

    static {
        prototypes.put("admin", new AdminAccountPrototype());
        prototypes.put("user", new UserAccountPrototype());
    }

    public static AccountPrototype getAccountPrototype(String role) { // factory pattern where we get desired class based on role provided.
        return prototypes.get(role).clone();
    }
}