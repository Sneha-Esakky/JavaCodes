package javaCodes;

public class Diamond extends Object{
	public static void main(String[] args) {
		Artist a = new Artist();
		a.art();
	}

}
class RealArtist {
	public void art() {
		System.out.println("Practice Art");
	}
}

class Singer extends Object {//all classes r extented to object class even when not declared (automatically inherited)
	public void art() {
		System.out.println("Sing a song");
	}
}

class Painter extends Object {
	public void art() {
		System.out.println("Paints a sketch");
	}
}

class Artist extends Singer {//, Painter {//does not allow to extend to 2 parent classes together
}
