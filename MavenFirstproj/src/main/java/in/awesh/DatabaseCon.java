package in.awesh;

public class DatabaseCon {
  String driver;
  String url;
public DatabaseCon() {
	super();
}
@Override
public String toString() {
	return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
}
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
}
