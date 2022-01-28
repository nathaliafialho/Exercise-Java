public class E_mail {
 
    private String user;
    private String domain;
    
    public E_mail(String u, String d){
        this.user = u;
        this.domain = d;        
    }

    public E_mail(String email){
        this.user = email;        
    }

    @Override
    public String toString() {
		return "Email: " + this.user + "@" + this.domain + ".com";      
	}

}