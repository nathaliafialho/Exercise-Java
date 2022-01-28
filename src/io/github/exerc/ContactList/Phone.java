public class Phone {
 
    private String number;
    private String area;

    public Phone(String n, String a){
        this.number = n;
        this.area = a;
    }

    @Override
	public String toString() {
		return "Telefone: " + this.area + " " + this.number;
	}

}