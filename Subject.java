package variables;
		
		class LocalVar
		{
			//instance var
			int English;
			int Maths;
			int GK;
			public void dispaly()
			{
				//local var
				int avg = 60;
				System.out.println(avg);
			}

		}

		public class Subject {
			
			public static void main(String[] args) {
		//Mark of Student1
				LocalVar s1 = new LocalVar();
				//s1.English=80; bcs its visible only in that block only
				s1.Maths=70;
				s1.GK=90;
				s1.English=80;
				//System.out.println(s1.avg);we cant access local variable
				//Mark of Student2
						LocalVar s2 = new LocalVar();
						
						s2.Maths=76;
						s2.GK=93;
						s2.English=60;
						s1.dispaly();
						//dispaly student 1 data
						System.out.println("English:"+s1.English+" "+"Maths:"+s1.Maths+" "+"gk:"+s1.GK);
			}
		}
