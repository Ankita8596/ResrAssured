package practice.restAssured;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization
class NFSGame implements Serializable {
	String name;
	int level;
	long score;
	int life;

	public NFSGame(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}

}

public class Run_Serialization{
	public static void main(String[] args) throws Throwable {
		NFSGame game=new NFSGame("Abhi", 15, 6000000, 2);
		FileOutputStream fout=new FileOutputStream("./d.text");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(game);
		System.out.println("============completed=============");
	}
}