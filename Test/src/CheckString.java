
public class CheckString {

	public static void main(String[] args) {
		
		String str1="The Golden Ball";
		String str2="Golden";
		boolean value=containsSubsequence(str1, str2);
		
		if(value) {
			System.out.println("string is present ");
		}else {
			System.out.println("string is not present  ");
		}

	}
	public static boolean containsSubsequence(
	        final String sequence, final String subsequence) {
	    if (subsequence.isEmpty()) {
	        return true;
	    }
	    int subsequenceIndex = 0;
	    for (int i = 0; i < sequence.length(); ++i) {
	        if (sequence.charAt(i) == subsequence.charAt(subsequenceIndex)) {
	            ++subsequenceIndex;
	            if (subsequenceIndex == subsequence.length()) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
}
