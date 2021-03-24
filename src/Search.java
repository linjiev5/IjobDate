import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Search {
	/**
	 * カテゴリのタイプを取得する
	 * @param url
	 * @return
	 * @throws IOException
	 */
	//	public List<Integer> getCategoryType() throws IOException {
	//		Document document = Jsoup.parse(new URL("http://www.ijob.jp/index.php?ctl=Index&act=home"), 30000);
	//		//document.getElementsByClass("fl bgwri touying borderR margint40 ");
	//		Elements link = document.select("a");
	//		List<String> relHref = link.eachAttr("href"); // == "/"
	//		List<Integer> types = new ArrayList<Integer>();
	//		for (int z = 17; z < 21; z++) {
	//			int type = Integer.parseInt(relHref.get(z).substring(38));
	//			types.add(type);
	//		}
	//		return types;
	//	}

	/**
	 * ページ数をget
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public int searchSumPage(String url) throws IOException {
		Document document = Jsoup.parse(new URL(url), 30000);
		Elements element = document.getElementsByClass("fl fybo fy_ym ");
		String sumPage = element.eq(3).text();
		int page = Integer.parseInt(sumPage);
		System.out.println(page);
		return page;
	}

	/**
	 * 詳細に入るhref
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public List<String> searchContents(String url) throws IOException {
		Document document = Jsoup.connect(url).get();
		Elements elementss = document.getElementsByClass("fl    bgwri  pos_r");
		Elements link = elementss.select("a");
		List<String> relHref = link.eachAttr("href"); // == "/"

		return relHref;
	}

	public WorkObj searchWork(String url) throws IOException {
		Document document = Jsoup.connect(url).get();
		Elements title_this = document.getElementsByClass("fl  fnt40");
		Elements company_name = document.getElementsByClass("fl w100per ta_c hang25  fnt20 margint10 overf fncolorhui");
		Elements adress_this = document.getElementsByClass("fl w50per paddingtb5");
		Elements salary_this = document.getElementsByClass("fl fnt24 fncolorhongse");
		Elements wellfare_this = document.getElementsByClass("fl w100per paddingtb5  fnt14 fncolorshenhui ");
		Elements jobDescription_this = document.getElementsByClass("fl w100per paddingtb5  fnt14 margint15 ");

		String title = title_this.text();
		String station = adress_this.eq(1).text();
		station = station.replace("车站：", "");
		String adress = adress_this.eq(0).text();
		adress = adress.replace("地点：", "");
		String companyName = company_name.text();
		String salary = salary_this.text();
		String wellfare = wellfare_this.text();
		String jobDescription = jobDescription_this.text();
		System.out.println(jobDescription);
		WorkObj work = new WorkObj();
		work.setTitle(title);
		work.setCompanyName(companyName);
		work.setStation(station);
		work.setAdress(adress);
		work.setSalary(salary);
		work.setWellfare(wellfare);
		work.setJobDescription(jobDescription);
		return work;

	}
}
