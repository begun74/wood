

package com.mc.dao.video;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class Video {
    
private int id ;  

@NotNull
@NotEmpty
private String section;
@NotNull
private String data;
@NotNull
private String headline;
@NotNull
private String link_embed; 
@NotNull
private String url; 

    public Video() {
        
    }

    public Video(String section, String data, String headline, String link_embed, String url) {
        this.section = section;
        this.data = data;
        this.headline = headline;
        this.link_embed = link_embed;
        this.url = url;
    }

    public Video(int id, String section, String data, String headline, String link_embed, String url) {
        this.id = id;
        this.section = section;
        this.data = data;
        this.headline = headline;
        this.link_embed = link_embed;
        this.url = url;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
       this.url = getUrl(headline);
        this.headline = headline;
    }

    public String getLink_embed() {
        return link_embed;
    }

    public void setLink_embed(String link_embed) {
        this.link_embed = link_embed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", section=" + section + ", data=" + data + ", headline=" + headline + ", link_embed=" + link_embed + ", url=" + url + '}';
    }


    private String getUrl (String str){
//        String str2="";
        
//       printInFile( "url2.txt", str);
       String str1 = str.replaceAll(" ", "-");
//       printInFile( "url2.txt", str1);
       String str2 = str1.replaceAll("'", "-");
//       printInFile( "url2.txt", str2);
       String str3 = str2.replaceAll(":", "-");
//       printInFile( "url2.txt", str3);
       String str4 = str3.replaceAll("\\.", "-");
       String str5 = str4.replaceAll("&", "");
//       printInFile( "url2.txt", str4);
        return str5;
    }
    


}
