public class Book extends TangibleAsset{
	private String isbn;
	pblic Book(String name, int price, String color, String ibsn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
