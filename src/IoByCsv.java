import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IoByCsv {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\ijobData.csv", false);
			IjobData data = new IjobData();
			List<WorkObj> work = data.getData();
			for (int x = 0, y = work.size(); x < y; x++) {
				String line = work.get(x).toString();
				fw.write(line + "\n");
			}
			fw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
