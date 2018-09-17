package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class ImageItem {
    @SerializedName("#text")
    private String url;
    @SerializedName("size")
    private String size;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
