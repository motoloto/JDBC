import java.io.*;

public class SerializableShirt implements Serializable {
	
	// �p�G�ŧi��transient��static�h��Ƥ��|�Qserialized
	private char colorCode = 'U';

	public char getColorCode() {
		return colorCode;
	}

	public void setColorCode(char newCode) {
		switch (newCode) {
		  case 'R':
		  case 'G':
		  case 'B':
			  colorCode = newCode;
			  break;
		  default:
			  System.out.println("�����T���C��X. �Шϥ� R, G, or B");
		}
	}

	public static void main(String[] args) {
		SerializableShirt shirt_Original = new SerializableShirt();
		shirt_Original.setColorCode('R');

		try {
			FileOutputStream fos = new FileOutputStream("myShirt.ser");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(shirt_Original);
			out.flush();
			out.close();
			fos.close();

			FileInputStream fis = new FileInputStream("myShirt.ser");
			ObjectInputStream in = new ObjectInputStream(fis);
			SerializableShirt shirt_getAgain = (SerializableShirt) in.readObject();
			in.close();
			fis.close();

			System.out.println("shirt_Original.getColorCode()="+ shirt_Original.getColorCode());
			System.out.println("shirt_getAgain.getColorCode()="+ shirt_getAgain.getColorCode());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}