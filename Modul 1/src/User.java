public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String username;
    String phoneNumber;

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(){
        System.out.println("Enter user Name : "+userName);
        System.out.println("Enter phone number : "+ phoneNumber);
        System.out.println("Registration Successful");

    }

}
