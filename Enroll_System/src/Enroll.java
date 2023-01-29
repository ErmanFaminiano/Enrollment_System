import java.sql.*;

public class Enroll {
    public static void main(String[] args) {
        // To connect to the MsAccess Database
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "D:\\CODING\\Java\\Enrollment_System\\Enroll_System\\enrolles_db.accdb";
            String url = "jdbc:ucanaccess://" + path;
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            String sql = "Select * from TBL_Admins";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        "\n" + rs.getString("ID") + "\t" + rs.getString("first_name") + "\t"
                                + rs.getString("last_name"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
