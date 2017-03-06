
package tutorials.hackro.com.gallery.data.entity.ReturnImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImagesResponse {

    @SerializedName("data")
    @Expose
    private List<Data> data = null;
    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("status")
    @Expose
    private int status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImagesResponse() {
    }

    /**
     * 
     * @param status
     * @param data
     * @param success
     */
    public ImagesResponse(List<Data> data, boolean success, int status) {
        super();
        this.data = data;
        this.success = success;
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
