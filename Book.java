class Book{
	public static void main(String []args){
		newBook n1=new newBook();
		n1.setPric();
		n1.setAuthor();
	}
}
class newBook{
	int Bid;
	int Bprice;
	String Bname;
	public void setPric(){
		System.out.println("Price");
	}

	public void setAuthor(){
		System.out.println("Author");

	}
}
