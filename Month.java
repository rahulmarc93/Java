package enumDemo;

public enum Month {
	
	JANUARY(0),FEBRUARY(1),MARCH(2),APRIL(3),MAY(4),JUNE(5),JULY(6),AUGUST(7),SEPTEMBER(8),OCTOBER(9),
	NOVEMBER(10),DECEMBER(11);
	private int MonthEnumIndex;

	Month(int name) {
		this.MonthEnumIndex=name;
		
	}
	public static void main(String[] args) {
		System.out.println(Month.DECEMBER.getMonthEnumIndex());
		System.out.println(Month.APRIL.getMonthEnumIndex());
	}
	
	public int getMonthEnumIndex()
	{
	return MonthEnumIndex;
	}
}