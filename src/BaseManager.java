import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BaseManager {
	String path = "/Database/Dabase.txt;";
	File dataBase = new File(path);

	public static void createDatabase(String filename){
		// filename = Absoluter oder Relativer Pfad
		File file = new File(filename);


		try{
			boolean fileExists = file.createNewFile();
			if(fileExists){
				System.out.println("Datei wurde neu angelegt");
			} else {
				System.out.println("Die Datei gab es bereits ");
			}
		} catch (IOException e){
			System.out.println("Es gab ein Problem bei der Dateierstellung");
			e.printStackTrace();
		}
	}

	public static void writeFile(String filename, String content){
		//createFile(filename);
		try {
			FileWriter fileWriter = new FileWriter(filename, true); //cuando Append es Falso, reemplaza todo
			fileWriter.write(content);
			//fileWriter.write(System.lineSeparator());
			fileWriter.close();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void readFile(String filename){
		File file = new File(filename);
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		}catch (FileNotFoundException e){
			System.out.println("Datei nicht da");
		}

	}

	public static void deleteFile(String filename){
		File file = new File(filename);
		if (file.delete()){
			System.out.println("Die Datei wurde gelöscht");
		} else {
			System.out.println("Der Datei wurde Überlebt");
		}
	}
}
