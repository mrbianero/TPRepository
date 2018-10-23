package pt.trainings.maven.scratch;

/**
 * @author bianero
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		
		Greetings greetings = new Greetings();
		System.out.println(greetings.sayHello(args.length>0?args[0]:null));
		System.out.println(greetings.sayHello("Vlad"));
		
		System.out.println("test 4 commit");
		
	}

}
