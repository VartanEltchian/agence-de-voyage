package Beans;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ChineBean {
   
	    private List<String> chine;
	     
	    @PostConstruct
	    public void init() {
	        chine = new ArrayList<String>();
	        for (int i = 1; i <= 3; i++) {
	            chine.add("chine" + i + ".jpg");
	            System.out.println("chine" + i + ".jpg");
	        }
	    }
	 
	    public List<String> getImages() {
	        return chine;
	    }
	    
	}