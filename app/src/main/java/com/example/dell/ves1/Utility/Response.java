package com.example.dell.ves1.Utility;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

        @SerializedName("owner")
        @Expose
        private String owner;
        @SerializedName("image_reference")
        @Expose
        private Object imageReference;
        @SerializedName("created")
        @Expose
        private Integer created;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("rent")
        @Expose
        private Boolean rent;
        @SerializedName("ownerId")
        @Expose
        private Object ownerId;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("sale")
        @Expose
        private Object sale;
        @SerializedName("price")
        @Expose
        private Integer price;
        @SerializedName("land")
        @Expose
        private Boolean land;
        @SerializedName("location")
        @Expose
        private Object location;
        @SerializedName("updated")
        @Expose
        private Integer updated;
        @SerializedName("objectId")
        @Expose
        private String objectId;
        @SerializedName("___class")
        @Expose
        private String _class;

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public Object getImageReference() {
            return imageReference;
        }

        public void setImageReference(Object imageReference) {
            this.imageReference = imageReference;
        }

        public Integer getCreated() {
            return created;
        }

        public void setCreated(Integer created) {
            this.created = created;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getRent() {
            return rent;
        }

        public void setRent(Boolean rent) {
            this.rent = rent;
        }

        public Object getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(Object ownerId) {
            this.ownerId = ownerId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getSale() {
            return sale;
        }

        public void setSale(Object sale) {
            this.sale = sale;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Boolean getLand() {
            return land;
        }

        public void setLand(Boolean land) {
            this.land = land;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            this.location = location;
        }

        public Integer getUpdated() {
            return updated;
        }

        public void setUpdated(Integer updated) {
            this.updated = updated;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String getClass_() {
            return _class;
        }

        public void setClass_(String _class) {
            this._class = _class;
        }

    }




