package VNWORK;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class List_Recruiter {
	
	//static ArrayList<Recruiter> ds;
	static List<Recruiter> ds= new ArrayList<>();
	
//	public List_Recruiter() {
//		ds= new ArrayList<>();
//	}
	
	public static Recruiter find(String url_find)
	{
		for (Recruiter re : ds) {
			if(re.getUrl().equalsIgnoreCase(url_find))
				return re;
		}
		return null;
	}
	
	public static void show() {
		int id=1;
        for (Recruiter c : ds) {
        	System.out.format("%-5s | ", id);
            System.out.format("%-20s | ", c.getUrl());
            System.out.format("%-10s | ", c.getAcc());
            System.out.format("%-10s |%n", c.getPw());
            id++;
        }
    }
	public static void Read() {
		try {
			File file = new File("config.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("recruiter");
			for (int itr = 0; itr < nodeList.getLength(); itr++) {
				Node node = nodeList.item(itr);
				//System.out.println("\nNode Name :" + node.getNodeName());
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) node;
					String url=eElement.getElementsByTagName("url").item(0).getTextContent();
					String acc= eElement.getElementsByTagName("acc").item(0).getTextContent();
					String pass= eElement.getElementsByTagName("pw").item(0).getTextContent();
					Recruiter r= new Recruiter(url, acc, pass);
					ds.add(r);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
