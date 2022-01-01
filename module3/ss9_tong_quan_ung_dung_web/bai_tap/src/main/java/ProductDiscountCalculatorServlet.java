import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet",value = "/display-discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product_description = request.getParameter("product_description");
        float list_price = Float.parseFloat(request.getParameter("list_price"));
        float discount_percent = Float.parseFloat(request.getParameter("discount_percent"));

        float discount_amount = (float) (list_price * discount_percent * 0.01) ;
        float discount_price = list_price - discount_amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h2> Product Description: " + product_description );
        writer.println("<br>");
        writer.println("List Price: " + list_price  );
        writer.println("<br>");
        writer.println("Discount Percent: " + discount_percent );
        writer.println("<br>");
        writer.println("Discount Amount: " + discount_amount );
        writer.println("<br>");
        writer.println( "Discount Price: " + discount_price );
        writer.println("</body>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
