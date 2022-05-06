class arrCopyDemo {

	public static void main(String[] args){
		char[] copyFrom = {'a', 'b', 'c', 'd', 'e'};
		char[] copyTo = new char[3];
	
	System.arraycopy(copyFrom, 2, copyTo, 0, 3);
	System.out.println(new String(copyTo));
	}
}
