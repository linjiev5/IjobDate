import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IjobData {

	public List<WorkObj> getData() throws IOException {
		Search search = new Search();
		int[] types = { 5, 4, 28, 7 };
		int page = 1;
		List<WorkObj> works = new ArrayList<WorkObj>();
		WorkObj work = new WorkObj();
		for (int x = 0, y = types.length; x < y; x++) {
			String url = "http://www.ijob.jp/index.php?pN=" + page + "&ctl=Index&act=joblist&type=3&jobtype="
					+ types[x];
			int pages = search.searchSumPage(url);
			for (int a = 1; a < pages; a++) {
				url = "http://www.ijob.jp/index.php?pN=" + a + "&ctl=Index&act=joblist&type=3&jobtype="
						+ types[x];
				List<String> newUrls = search.searchContents(url);
				String newUrl = "http://www.ijob.jp/index.php";
				for (int q = 1, w = newUrls.size() - 9; q < w; q += 2) {
					String uurl = null;
					uurl = newUrl + newUrls.get(q);
					System.out.println(uurl);
					work = search.searchWork(uurl);
					if (types[x] == 5) {
						work.setCategory("一般事務");
					} else if (types[x] == 4) {
						work.setCategory("営業");
					} else if (types[x] == 28) {
						work.setCategory("飲食店");
					} else if (types[x] == 7) {
						work.setCategory("IT");
					} else {

					}
					works.add(work);
				}
			}
		}
		return works;

		/*
		List<WorkObj> works= new ArrayList<WorkObj>();
		WorkObj work = new WorkObj();
		for (int a = 1; a < pages; a++) {
			url = "http://www.ijob.jp/index.php?pN=" + a + "&ctl=Index&act=joblist&type=3&jobtype=5";
			work=search.searchWork(url);
			works.add(work);
		}
		*/
	}
}
