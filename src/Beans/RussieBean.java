package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class RussieBean {
   
	    private List<String> russie;
	     
	    @PostConstruct
	    public void init() {
	        russie = new ArrayList<String>();
	        for (int i = 1; i <= 3; i++) {
	            russie.add("russie" + i + ".jpg");
	            System.out.println("russie" + i + ".jpg");
	        }
	    }
	 
	    public List<String> getImages() {
	        return russie;
	    }
	    
	}