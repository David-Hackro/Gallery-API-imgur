
package tutorials.hackro.com.gallery.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("datetime")
    @Expose
    private int datetime;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("animated")
    @Expose
    private boolean animated;
    @SerializedName("width")
    @Expose
    private int width;
    @SerializedName("height")
    @Expose
    private int height;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("views")
    @Expose
    private int views;
    @SerializedName("bandwidth")
    @Expose
    private int bandwidth;
    @SerializedName("vote")
    @Expose
    private String vote;
    @SerializedName("favorite")
    @Expose
    private boolean favorite;
    @SerializedName("nsfw")
    @Expose
    private String nsfw;
    @SerializedName("section")
    @Expose
    private String section;
    @SerializedName("account_url")
    @Expose
    private String accountUrl;
    @SerializedName("account_id")
    @Expose
    private String accountId;
    @SerializedName("is_ad")
    @Expose
    private boolean isAd;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("in_gallery")
    @Expose
    private boolean inGallery;
    @SerializedName("deletehash")
    @Expose
    private String deletehash;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("link")
    @Expose
    private String link;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param tags
     * @param inGallery
     * @param animated
     * @param accountId
     * @param isAd
     * @param vote
     * @param link
     * @param width
     * @param favorite
     * @param type
     * @param section
     * @param size
     * @param bandwidth
     * @param id
     * @param title
     * @param height
     * @param nsfw
     * @param description
     * @param views
     * @param name
     * @param deletehash
     * @param accountUrl
     * @param datetime
     */
    public Data(String id, String title, String description, int datetime, String type, boolean animated, int width, int height, int size, int views, int bandwidth, String vote, boolean favorite, String nsfw, String section, String accountUrl, String accountId, boolean isAd, List<String> tags, boolean inGallery, String deletehash, String name, String link) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.datetime = datetime;
        this.type = type;
        this.animated = animated;
        this.width = width;
        this.height = height;
        this.size = size;
        this.views = views;
        this.bandwidth = bandwidth;
        this.vote = vote;
        this.favorite = favorite;
        this.nsfw = nsfw;
        this.section = section;
        this.accountUrl = accountUrl;
        this.accountId = accountId;
        this.isAd = isAd;
        this.tags = tags;
        this.inGallery = inGallery;
        this.deletehash = deletehash;
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getNsfw() {
        return nsfw;
    }

    public void setNsfw(String nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAccountUrl() {
        return accountUrl;
    }

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public boolean isIsAd() {
        return isAd;
    }

    public void setIsAd(boolean isAd) {
        this.isAd = isAd;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public boolean isInGallery() {
        return inGallery;
    }

    public void setInGallery(boolean inGallery) {
        this.inGallery = inGallery;
    }

    public String getDeletehash() {
        return deletehash;
    }

    public void setDeletehash(String deletehash) {
        this.deletehash = deletehash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
