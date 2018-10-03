/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author demet
 */
@ManagedBean
public class valuee {
    private String isim;
    private String lastName;
    List<String> favoriteLanguage;
    
    public valuee(){
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(List<String> favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    

   
    
}
