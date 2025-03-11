public class Library {
		private String name;
		private Book book;
		private Person incharge;
		private Person staff;
		
		Library(String name, Book book, Person incharge, Person staff) {
			this.name = name;
			this.book = book;
			this.incharge = incharge;
			this.staff = staff;
		}

		Library(Library other) {
			this.name = other.name;
			this.book = other.book;
			this.incharge = other.incharge;
			this.staff = other.staff;
		}

		public void showLibraryDetails() {
			System.out.printf("Name: %s," name);
		}
}
