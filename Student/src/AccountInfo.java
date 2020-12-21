

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Servlet implementation class AccountInfo
 */
@WebServlet("/AccountInfo")
public class AccountInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfo() {
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
		try {
		String url = "/StudentPage.jsp";
		String w = website("https://www.blockchain.com/btc/address/"+request.getParameter("account"));
		String check = format(w.split("\\r?\\n"));
		String Name = cWebsite("https://www.blockchain.com/btc/address/"+request.getParameter("account"),check);
		String word = Name.replace("Hash", "<br>" + "Certificate: ");
		request.setAttribute("Name", word);
		getServletContext().getRequestDispatcher(url).forward(request, response);
		} catch(HttpStatusException e) {
			request.setAttribute("account","Wrong");	
		} catch(IllegalArgumentException e) {
			request.setAttribute("account","Wrong");
		}
	}
	
	public static String format(String text[]) {
		String form = "";
		int count = 0;
		for(String a : text) {
			if(count == 349) {
				String aa = a.replace("       ", "");
				String temp = aa.replace("<div class=\"", "");
				String temp1 = temp.replace("\">", "");
				String temp2 = temp1.replace(" ", ".");

			return temp2;
			}
			count++;
		}
		
		return form;
	}
	
	private static String website(String string) throws IOException {
		String t = "";
		Document doc = Jsoup.connect(string).get();
		Elements links = doc.select("div");
		int count = 0;
		for(int i = 0; i < links.size();i++) {
			if(links.get(i).text().contains("Hash")) {
				if(i == 42) {
			 t = links.get(i).toString();
				}
			}
		}
		return t;
	}



	public static String cWebsite(String text,String check) throws IOException {
		String ret = "";
		String Wcheck = "div."+check;
		Document doc = Jsoup.connect(text).get();
		//Elements links = doc.select("div.sc-1fp9csv-0.koYsLf");
		Elements links = doc.select(Wcheck);
		for(Element sr : links) {
			if(sr.text().contains("Hash ")) {
			ret += sr.text() + "\n";
		}
		}
		return ret;
	}
}
