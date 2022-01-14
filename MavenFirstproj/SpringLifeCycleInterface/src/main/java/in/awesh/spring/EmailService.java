package in.awesh.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@NoArgsConstructor
public class EmailService implements InitializingBean,DisposableBean{

	private String  host;
   private int port;


	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init");
		
	}

}
