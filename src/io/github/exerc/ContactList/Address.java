public class Address {
    private String street;
    private String number;
    private String city;
    private String state;
    private String postalCode;

    public Address(String str, String n, String c, String sta, String pc){
        this.street = str;
        this.number = n;
        this.city = c;
        this.state = sta;
        this.postalCode = pc;
    }
    
    @Override
	public String toString() {
		return "Rua: " + this.street + ", Número: " + this.number +
			   ", Cidade: " + this.city + ", Estado: " + this.state +
			   ", CEP: " + this.postalCode;
	}

}
