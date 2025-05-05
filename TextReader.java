package tb課題;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	public enum processstate {
		START, END
	}

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ObjectList<>();

		FileReader fr = null;
		BufferedReader br = null;
		try {
			FileReader frr = new FileReader(path);
			BufferedReader brr = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
				}
			}
		}
		for (Integer value : valueList) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		logger.info(processstate.START.toString());
		new TextReader(args[0]).execute();
		logger.info(processstate.END.toString());
	}

}