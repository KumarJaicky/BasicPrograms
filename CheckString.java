
public class CheckString {
	
	private String name;
	private int id;
	

	public CheckString(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 2;
		Integer b = 2; 
		Integer c = new Integer(2);
		
		CheckString checkString1 = new CheckString("sohan",1);
		CheckString checkString2 = new CheckString("sohan",1);
		
		//checkString1=checkString2;
		//String d =  new String("DEF");
		//String f = a.substring(2,a.length()-1);
		//System.out.println(f);
		//System.out.println(b.equals(c));
		System.out.println(checkString1.equals(checkString2));
		System.out.println(checkString1==checkString2);
		//System.out.println(a.equals(c));
		//System.out.println(d.equals(f));

	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckString other = (CheckString) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
