import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		GreetingSeviceImpl gs1 = (GreetingSeviceImpl)factory.getBean("gs");
		gs1.sayGreeting();
		
	}

}
