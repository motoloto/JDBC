class Test_Gc {
	public static void main(String args[]) {
		System.out.print("�Ѿl�O����:");
		System.out.println(Runtime.getRuntime().freeMemory());
		String str = "Hello World!";
		System.out.print("�Ѿl�O����:");
		System.out.println(Runtime.getRuntime().freeMemory());

		System.out.println("�j��i��U������");
		System.gc();

		System.out.print("�Ѿl�O����:");
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
