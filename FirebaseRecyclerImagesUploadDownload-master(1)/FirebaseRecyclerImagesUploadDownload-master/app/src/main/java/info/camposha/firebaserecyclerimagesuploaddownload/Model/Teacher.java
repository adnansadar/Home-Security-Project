package info.camposha.firebaserecyclerimagesuploaddownload.Model;

import com.google.firebase.database.Exclude;

public class Teacher {
    private String imageURL;
    private String key;
    private int position;

    public Teacher() {
        //empty constructor needed
    }
    public Teacher (int position){
        this.position = position;
    }
    public Teacher(String name, String imageUrl ,String Des) {
        this.imageURL = imageUrl;
    }
    /*public String getDescription() {
        return description;
    }*/
    /*public void setDescription(String description) {
        this.description = description;
    }*/

    /*public String getName() {
        return "";
    }
    public void setName(String name) {
        this.name = name;
    }*/
    public String getImageUrl() {
        return imageURL;
    }
    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }
    @Exclude
    public String getKey() {
        return key;
    }
    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
