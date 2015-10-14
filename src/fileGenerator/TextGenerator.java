package fileGenerator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import model.Instance;

public class TextGenerator {
	
	Instance instance;

	public TextGenerator(Instance instance) {
		this.instance = instance;
		generateFile();
	}
	
	private void generateFile(){
		try {
			PrintWriter writer = new PrintWriter("txt/"+instance.getFileName()+".txt", "UTF-8");
			writer.println(instance.toString());
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
