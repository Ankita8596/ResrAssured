package practice.restAssured;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

  public class Run_Serialization2 {
	public static void main(String[] args) throws Throwable {
		FileInputStream fileout = new FileInputStream("./d.text");
		ObjectInputStream objin = new ObjectInputStream(fileout);
		NFSGame game1 = (NFSGame) objin.readObject();
		System.out.println(game1.name);
		System.out.println(game1.level);
		System.out.println(game1.score);
		System.out.println(game1.life);
	}
}
