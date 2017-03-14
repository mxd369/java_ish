package ch1;
public class Test2 {
	
	public static class Person {
		private String name;
		private String dateofbirth;
		private String hobbies;
		private String favoritebook;
		
		public String getName() {
			return name;
		}
		
		public String getDateofBirth(){
			return dateofbirth;
		}
		
		public String getHobbies(){
			return hobbies;
		}
		
		public String getfavoriteBook(){
			return favoritebook;
		}

		public Person(){
			//Person person = new Person();
			name = "Bobby Roberts";
			dateofbirth = "December 5, 1995";
			hobbies = "reading";
			favoritebook = "Prometheus Rising";
		}
	}

		public static void main(String[] args){
			Person person = new Person();

			System.out.println("Name:     "  + person.getName());
			System.out.println("DOB:      "  + person.getDateofBirth());
			System.out.println("Hobbies:  "  + person.getHobbies());
			System.out.println("Fav Book: "  + person.getfavoriteBook());
		}
	
}

// local variable
// field
// parameter
// class
// constant
// interface