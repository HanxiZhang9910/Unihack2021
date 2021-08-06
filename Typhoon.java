
public class Typhoon {
	private String year;
	private String id;
	private String specific_time;
	private String lat;
	private String Long;
	private String prs;
	private String wnd;
	private String month;
	
	public Typhoon() {
		
	}
	
	public Typhoon(String year, String id, String specific_time, String lat, String l, String prs, String wnd,
			String month) {
		this.year = year;
		this.id = id;
		this.specific_time = specific_time;
		this.lat = lat;
		Long = l;
		this.prs = prs;
		this.wnd = wnd;
		this.month = month;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpecific_time() {
		return specific_time;
	}
	public void setSpecific_time(String specific_time) {
		this.specific_time = specific_time;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLong() {
		return Long;
	}
	public void setLong(String l) {
		Long = l;
	}
	public String getPrs() {
		return prs;
	}
	public void setPrs(String prs) {
		this.prs = prs;
	}
	public String getWnd() {
		return wnd;
	}
	public void setWnd(String wnd) {
		this.wnd = wnd;
	}

}
