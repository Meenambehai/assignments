package week3.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Your Database is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Your Database connection is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("All the DB commands are executed");
		
	}
	
	public static void main(String[] args) {
		JavaConnection conn = new JavaConnection();
		conn.connect();
		conn.disconnect();
		conn.executeUpdate();
		
	}

}
