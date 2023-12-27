namespace BLL;
using DAL;
using BOL;

public class ProductManager
{
  public  ProductManager()
   {

   }
    public List<Product> getProduct()
    {
        List<Product> products = new List<Product>();
        products = DbManager.getAllProduct();
        return products;
    }
}