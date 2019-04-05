package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class BresilBean {
   
	    private List<String> bresil;
	     
	    @PostConstruct
	    public void init() {
	        bresil = new ArrayList<String>();
	        for (int i = 1; i <= 3; i++) {
	            bresil.add("bresil" + i + ".jpg");
	            System.out.println("bresil" + i + ".jpg");
	        }
	    }
	 
	    public List<String> getImages() {
	        return bresil;
	    }
	    
	}

