package fit.se.vn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import entity.Student;

/**
 * Servlet implementation class RegistrationForm
 */
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String ho = request.getParameter("fName");
		String ten = request.getParameter("lName");
		String day = request.getParameter("day"); 
		String month = request.getParameter("month"); 
		String year = request.getParameter("year"); 
		String email = request.getParameter("Email"); 
		String mobileNum = request.getParameter("MobileNumber"); 
		String gender = request.getParameter("Gender"); 
		String address = request.getParameter("Address"); 
		String city = request.getParameter("City"); 
		String pinCode = request.getParameter("PinCode"); 
	    String state = request.getParameter("State"); 
		String country = request.getParameter("Country"); 
		String hobbies = request.getParameter("Hobbies"); 
		String course = request.getParameter("Course");
		
		
		String birthdate = day + "/"+ month + "/"+ year; 
		
		Student sv = new Student();
		sv.setfName(ho); 
		sv.setlName(ten); 
		sv.setEmail(email); 
		sv.setGender(gender);
		sv.setHobbies(hobbies);
		sv.setBirthday(birthdate); 
		
		request.setAttribute("student", sv);
		
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
		rd.forward(request, response);
	}

}
