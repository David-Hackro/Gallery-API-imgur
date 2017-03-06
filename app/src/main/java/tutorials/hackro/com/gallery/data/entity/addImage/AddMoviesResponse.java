
package tutorials.hackro.com.gallery.data.entity.addImage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import tutorials.hackro.com.gallery.data.entity.Data;

public class AddMoviesResponse{

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("status")
    @Expose
    private Integer status;

    /**
     * No args constructor for use in serialization
     *
     */
    public AddMoviesResponse() {
    }

    /**
     *
     * @param status
     * @param data
     * @param success
     */
    public AddMoviesResponse(Data data, Boolean success, Integer status) {
        super();
        this.data = data;
        this.success = success;
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
