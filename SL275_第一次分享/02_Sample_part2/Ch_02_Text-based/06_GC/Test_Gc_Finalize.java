class ClassFinalize {
	protected void finalize() {
		System.out.println("finalize��k����F");
	}
}
class Test_Gc_Finalize {
	public static void main(String args[]) {
		ClassFinalize fin = new ClassFinalize();
		fin = null;
		System.out.println("�j��i��U������");
		System.gc();
	}
}
