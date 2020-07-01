package Requestpojo;

public class Creteuser {
	 String name;
	    String job;
	    String id;
	    String createdAt;
	   
	     
	    public Creteuser() {      
	    }
	     
	    public Creteuser(String name, String job) {
	         
	        this.name = name;
	        this.job = job;
	      
	    }
	     
	    public String getname() {
	        return this.name;
	    }
	 
	    public void setname(String name) {
	        this.name = name;
	    }
	    
	    public String getjob() {
	        return this.job;
	    }
	 
	    public void setjob(String job) {
	        this.job = job;
	    }
	    public String getid() {
	        return this.id;
	    }
	 
	    public void setid(String id) {
	        this.id = id;
	    }
	    public String getcreatedAt() {
	        return this.createdAt;
	    }
	 
	    public void setcreatedAt(String createdAt) {
	        this.createdAt = createdAt;
	    }
	    public String toString() {
	        return "My user is a " + this.name + " " + this.job + " " + this.id + " " +this.createdAt;
	    }
}
