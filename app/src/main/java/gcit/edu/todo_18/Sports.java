package gcit.edu.todo_18;

public class Sports {
    private String title;
    private String info;
    private final int imageResource;

    Sports(String title,String info,int imageResource){
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
    String getTitle(){
        return title;
    }
    String getInfo(){
        return info;
    }
    public String getImageResource(){
        return imageResource;
    }
}