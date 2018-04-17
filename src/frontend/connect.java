package frontend;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import clojure.lang.LazySeq;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashSet;
import clojure.lang.PersistentVector;
import coding.backend;
/**
 * Servlet implementation class connect
 */
@WebServlet("/connect")
@MultipartConfig
public class connect extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;

    /**
     * Default constructor. 
     */
    public connect() {
        // TODO Auto-generated constructor stub
    }


   
    private String extractFileName(Part part) {  
        String contentDisp = part.getHeader("content-disposition");  
        String[] items = contentDisp.split(";");  
        for (String s : items) {  
            if (s.trim().startsWith("filename")) {  
                return s.substring(s.indexOf("=") + 2, s.length()-1);  
            }  
        }  
        return "";  
    }
    
	/**wr
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();	
						
	 Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">

	 response.setContentType("text/html");
	 String f = extractFileName(filePart);
	    clojureclass obj = new clojureclass();
	     PersistentVector result = obj.display(f);
	    boolean flag = obj.flagfunction();
	     String contextparam = "";
	     String conceptparam = "";
	   for (int i=0; i< result.count();i++)
	     {
	    	 PersistentArrayMap mapresult = (PersistentArrayMap) result.get(i);
	    	 contextparam = contextparam + mapresult.valAt(clojure.lang.Keyword.intern("id")) + ",";
	    	 conceptparam = conceptparam + mapresult.valAt(clojure.lang.Keyword.intern("aliases")) + ",";
	     }
	   pw.println(flag);
	 request.setAttribute("flag", flag);
     request.setAttribute("context", contextparam);
     request.setAttribute("concept", conceptparam);
	 RequestDispatcher rd=request.getRequestDispatcher("/displayoutput.jsp");
	 rd.forward(request, response);
}}