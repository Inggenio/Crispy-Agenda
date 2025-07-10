public class Main {
	public static void main(String[] args) {

		Neueintraege neu = new Neueintraege();
		neu.go();
		String path = "Database/Database.txt";
		BaseManager.createDatabase(path);
	}
}
