
public class stringChild extends stringSuper{

	@Override
	boolean containsUpercase(String str) {
		 {
				for (int i = 0; i < str.length(); i++) {
					if(Character.isUpperCase(str.charAt(i))){
						return true;
					}else {
						return false;
					}
				}
			}
		return false;
	}

	@Override
	String toLowerCase(String str) {
		return str.toLowerCase();
	}

	@Override
	Integer stringTOIntPlusTen(String str) {
		return Integer.valueOf(str)+10;
	}
	
}
