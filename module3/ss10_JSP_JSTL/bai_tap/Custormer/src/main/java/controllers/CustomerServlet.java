package controllers;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Trần Đăng Đình","2001/04/04","Quảng Nam", "https://vtv1.mediacdn.vn/thumb_w/650/2020/4/20/one-piece-anime-hiatus-15873776419971960853722.jpg"));
        list.add(new Customer("Trần Đăng Đình","2001/04/04","Quảng Nam", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCf7rRpbvIYueH9teWaqizxUby4MrXOJrqKa8KJdvS7Wygi39tLAwp0hiOzQn7Ju3OnVo&usqp=CAU"));
        list.add(new Customer("Trần Phan","2000/11/23","da nang", "https://vtv1.mediacdn.vn/thumb_w/650/2020/4/20/one-piece-anime-hiatus-15873776419971960853722.jpg"));
        list.add(new Customer("Trần Phan","2000/11/23","da nang", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fgamek.vn%2Fdoraemon-ra-mat-mot-tap-phim-dac-biet-nhan-dip-sinh-nhat-am-91-tuoi-cua-meo-u-20210831131754104.chn&psig=AOvVaw2O5qhse8JRWhxdW9_dt3Vq&ust=1641650539211000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCLDduoTnn_UCFQAAAAAdAAAAABAU"));
        request.setAttribute("CustomerListServlet",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
