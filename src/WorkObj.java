
public class WorkObj {

	private String companyName;
	private String station;
	private String adress;
	private String category;
	private String title;
	private String salary;
	private String wellfare;// 福利厚生
	private String jobDescription;// 募集詳細

	/**
	 * @return companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName セットする companyName
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return station
	 */
	public String getStation() {
		return station;
	}

	/**
	 * @param station セットする station
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/**
	 * @return adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress セットする adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary セットする salary
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return wellfare
	 */
	public String getWellfare() {
		return wellfare;
	}

	/**
	 * @param wellfare セットする wellfare
	 */
	public void setWellfare(String wellfare) {
		this.wellfare = wellfare;
	}

	/**
	 * @return jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * @param jobDescription セットする jobDescription
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "WorkObj [companyName=" + companyName + ", station=" + station + ", adress=" + adress + ", contents="
				+ ", category=" + category + ", title=" + title + ", salary=" + salary + ", wellfare="
				+ wellfare + ", jobDescription=" + jobDescription + "]";
	}

}
