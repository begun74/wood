
package service;

import com.video.dao.video2.Video1;
import com.video.dao.video2.VideoFromExcel;



public interface Video1ServisDao {
    
    
    public Video1 getVideo1(int id);
    public String addVideo1(VideoFromExcel videoFromExcel);
}
