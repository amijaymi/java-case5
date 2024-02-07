
import java.sql.Connection;
import java.sql.DriverManager;
public class personTest {
    public static void main(String[] args){
        Person myperson=new Person("EFe","123456789");
        Cat myCat=new Cat("irmik");

        myperson.setCat(myCat);
        myperson.introduceYourself();
        



      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "Venividivici_19");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");



    }
}
