package demo_operater;
public class setPassword 
{
    private String username;
    private String password;
    public String getUsername() 
    {
        return username;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void User(String password) 
    {
        this.password = password;
    }
    public static void main(String[] args) 
    {
    	setPassword user = new setPassword();
        user.setUsername("KGM");
        user.User("Kgm@123");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
