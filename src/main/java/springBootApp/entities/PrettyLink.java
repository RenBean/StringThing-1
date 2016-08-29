package springBootApp.entities;

public class PrettyLink {
    String prettyText;
    String link;

    public PrettyLink(String prettyText,String link){
        this.prettyText = prettyText;
        this.link = link;
    }

    public String getPrettyText() {
        return prettyText;
    }

    public void setPrettyText(String prettyText) {
        this.prettyText = prettyText;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
