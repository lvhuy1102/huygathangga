
package com.example.admin.vtvplay.livechanelData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Watermark {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("x")
    @Expose
    private String x;
    @SerializedName("y")
    @Expose
    private String y;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

}
