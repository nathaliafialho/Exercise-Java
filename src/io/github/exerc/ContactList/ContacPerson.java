public class ContacPerson {

    private String description;

    public ContacPerson(Name n, Address a, Phone p, E_mail e){
        description = n.toString() +
                      "\nEndereco: " + a.toString() +
                      "\n" + p.toString() +
                      "\n" + e.toString(); 
    }

    @Override
    public String toString() {
		return "\nDescricao Contato: \n" + this.description;
	}
    
}
