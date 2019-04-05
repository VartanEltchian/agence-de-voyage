package Beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class BandeauBean {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            images.add("nature" + i + ".jpg");
            System.out.println("nature" + i + ".jpg");
        }
        
        
    }
 
    public List<String> getImages() {
        return images;
    }
    
}
