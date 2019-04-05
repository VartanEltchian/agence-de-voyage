package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormuleBean {


	   
		    private List<String> formule;
		     
		    @PostConstruct
		    public void init() {
		    	formule = new ArrayList<String>();
		        for (int i = 1; i <= 3; i++) {
		        	formule.add("formule" + i + ".jpg");
		            System.out.println("formule" + i + ".jpg");
		        }
		    }
		 
		    public List<String> getImages() {
		        return formule;
		    }
		    
		}
	
	

