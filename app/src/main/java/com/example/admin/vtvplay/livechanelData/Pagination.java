
package com.example.admin.vtvplay.livechanelData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("rowCount")
    @Expose
    private Integer rowCount;
    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("itemLeft")
    @Expose
    private Integer itemLeft;
    @SerializedName("pageLeft")
    @Expose
    private Integer pageLeft;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getItemLeft() {
        return itemLeft;
    }

    public void setItemLeft(Integer itemLeft) {
        this.itemLeft = itemLeft;
    }

    public Integer getPageLeft() {
        return pageLeft;
    }

    public void setPageLeft(Integer pageLeft) {
        this.pageLeft = pageLeft;
    }

}
