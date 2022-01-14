package in.awesh.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbCon {
	@Value("${app-driver}")
	private String dc;
	@Value("${app-url}")
	private String url;
	@Override
	public String toString() {
		return "DbCon [dc=" + dc + ", url=" + url + "]";
	}
}
