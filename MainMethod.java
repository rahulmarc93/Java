package lab_4;
	//Assignment: 1
	
		class HillStations{
			
			public void Location() {
				
		}
			public void famousFor() {
				
				}
		}
		
	class Manali extends HillStations{
		
		public void Location() {
			System.out.println("Location: Manali");
		}
		public void famousfor(){
			System.out.println("Famous for: adventure sports");
		}	
	}
	
	class Mussoorie  extends HillStations{
		
		public void Location() {
			System.out.println("Location: Musoorie");
		}
		public void famousfor(){
			System.out.println("Famous for: Queen of Hills");
		}	
	}
	class Gulmarg  extends HillStations{
		
		public void Location() {
			System.out.println("Location: Gulmarg");
		}
		public void famousfor(){
			System.out.println("Famous for: winter sport");
		}	
	}
	
		public class MainMethod {
		
			public static void main(String[] args) {
				
				Manali M=new Manali();
				M.Location();
				M.famousfor();
				
				Mussoorie mu=new Mussoorie();
				mu.Location();
				mu.famousfor();
				
				Gulmarg G= new Gulmarg();
				G.Location();
				G.famousfor();
			}
	
	}