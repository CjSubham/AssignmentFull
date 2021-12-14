package GITHUB;
class  movie
{
	String name;
	int yor;
	String allowed;
	float imdbRating;
	float collection;
	String reviews;
	movie()
	{
		allowed="It is Allowed In India";
		
	}
	movie(String name, int yor, float imdbRating, float collection, String reviews)
	{
		this();
		this.name=name;
		this. yor=yor;
		this.imdbRating=imdbRating;
		this.collection=collection;
		this.reviews=reviews;
	}
}

		

	
public class Movies {

	public static void main(String[] args) {
		

		movie m1=new movie("3 Idiots",2013,8.4f,202.47f,"BEST");
		System.out.println("Name Of Movie="+m1.name);
		System.out.println("Year Of Release="+m1.yor);
		System.out.println("IMDB Rating="+m1.imdbRating);
		System.out.println("Boxoffice Collections="+m1.collection);
		System.out.println("Audience Reviews="+m1.reviews);
		System.out.println("========================================");
		movie m2=new movie("Dilwale Dulhania Le Jayenge",1995,8.1f,102.50f,"ROMANTIC");
		System.out.println("Name Of Movie="+m2.name);
		System.out.println("Year Of Release="+m2.yor);
		System.out.println("IMDB Rating="+m2.imdbRating);
		System.out.println("Boxoffice Collections="+m2.collection);
		System.out.println("Audience Reviews="+m2.reviews);
		System.out.println("========================================");
		movie m3=new movie("Zindagi Na Milegi Dobara",2011,8.2f,153.8f,"Worth Watching");
		System.out.println("Name Of Movie="+m3.name);
		System.out.println("Year Of Release="+m3.yor);
		System.out.println("IMDB Rating="+m3.imdbRating);
		System.out.println("Boxoffice Collections="+m3.collection);
		System.out.println("Audience Reviews="+m3.reviews);
		
	}

}
