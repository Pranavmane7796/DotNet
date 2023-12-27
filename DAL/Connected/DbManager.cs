namespace DAL;
using BOL;
using MySql.Data.MySqlClient;

public static class DbManager
{
     public static string conString=@"server=192.168.10.150;port=3306;user=dac54; password=welcome;database=dac54";

    public static List<Product> getAllProduct()
    {
          List<Product> allproduct=new List<Product>();
          MySqlConnection con = new MySqlConnection();
          con.ConnectionString = conString;
          string query = "select * from ShopProduct";
          try
          {
            
                MySqlCommand cmd = new MySqlCommand(query,con);
                con.Open();
                MySqlDataReader reader=cmd.ExecuteReader();

                while (reader.Read())
                {
                    int pid = int.Parse(reader["pid"].ToString());
                    string pname = reader["pname"].ToString();
                    int qty = int.Parse(reader["quantity"].ToString());
                    double price = double.Parse(reader["price"].ToString());

                    Product p  = new Product
                    {
                        Product_id = pid,
                        Pname=pname,
                        Quantity=qty,
                        Price = price
                    };
                    allproduct.Add(p);
                }
          }
          catch (Exception ee)
          {
             Console.WriteLine(ee.Message);
          }finally{
                    con.Close();
            }
         return allproduct;
    }
    public static Product GetProductById(int id){
      //
          MySqlConnection con = new MySqlConnection();
          con.ConnectionString = conString;
          string query = "select * from ShopProduct where pid=id";
          try {
            
          }
    }
}