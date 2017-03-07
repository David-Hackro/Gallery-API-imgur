
package tutorials.hackro.com.gallery.presentation.model;

public class DataPresentation {

    private String id;
    private String title;
    private String description;
    private int datetime;
    private String link;

    /**
     * No args constructor for use in serialization
     *
     */
    public DataPresentation() {
    }

    /**
     *
     * @param id
     * @param title
     * @param description
     * @param datetime
     * @param link
     */
    public DataPresentation(String id, String title, String description, int datetime, String link) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.datetime = datetime;
        this.link = link;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDatetime() {
        return datetime;
    }

    public void setDatetime(int datetime) {
        this.datetime = datetime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "DataPresentation{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", description=" + description +
                ", datetime=" + datetime +
                ", link='" + link + '\'' +
                '}';
    }
}
