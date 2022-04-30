
package postest5;

class Login
{
 //deklarasi
 private String username, password, nama;
 
 //constructor
 public Login(String username, String password, String nama)
 {
   this.username = username;
   this.password = password;
   this.nama = nama;
 }
 
 public Login(String usr, String lg) {
}

public Login() {
}

//setter
 public void setUsername(String username)
 {
 this.username = username;
 }
 public void setPassword(String password)
 {
 this.password = password;
 } 
 
 public void setNama(String nama)
 {
 this.nama = nama;
 } 
 
 //getter
 public String getUsername()
 {
 return username;
 }
 public String getPassword()
 {
 return password;
 }
  public String getNama()
 {
 return nama;
 }
 
}



 
