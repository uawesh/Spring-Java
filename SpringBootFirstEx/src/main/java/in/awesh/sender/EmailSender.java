package in.awesh.sender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	@Value("uawesh")
  private String  email;
	@Value("1234")
  private int add;
@Override
public String toString() {
	return "EmailSender [email=" + email + ", add=" + add + "]";
}
  
  
}
