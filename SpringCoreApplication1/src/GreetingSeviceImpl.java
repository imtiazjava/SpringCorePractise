
public class GreetingSeviceImpl implements GreetingService {
	private String greeting;

	public GreetingSeviceImpl() {
		// TODO Auto-generated constructor stub
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayGreeting() {
		// TODO Auto-generated method stub
		System.out.println("Hello:"+greeting);
	}

}
